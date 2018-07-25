package com.deepexi.util.config;

import org.apache.commons.lang3.reflect.MethodUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonFilter;
import org.codehaus.jackson.map.ser.FilterProvider;
import org.codehaus.jackson.map.ser.impl.SimpleBeanPropertyFilter;
import org.codehaus.jackson.map.ser.impl.SimpleFilterProvider;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * 序列化处理
 */
public class JsonFilterConfig {
    private static final ObjectMapper mapper = new ObjectMapper();

    private JsonFilterConfig() {
    }

    public static Object filteredWriter(Object payload) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        if (payload == null) {
            return null;
        } else {
            String[] filterFields = getFilterFields(payload);
            if (filterFields == null) {
                filterFields = new String[0];
            }

            FilterProvider filters = (new SimpleFilterProvider()).addFilter("JsonFilter", SimpleBeanPropertyFilter.serializeAllExcept(filterFields));
            String jsonString = mapper.writer(filters).writeValueAsString(payload);
            if (!(payload instanceof List) && !payload.getClass().isArray()) {
                if (payload != null && !payload.getClass().isPrimitive() && !isSimplteObject(payload) && !isWrapClass(payload.getClass())) {
                    Map<String, Map<String, Object>> maps = (Map) mapper.readValue(jsonString, Map.class);
                    return maps;
                } else {
                    return payload;
                }
            } else {
                List list = (List) mapper.readValue(jsonString, List.class);
                return list;
            }
        }
    }

    public static String[] getFilterFields(Object obj) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        if (obj == null) {
            return new String[0];
        } else {
            StringBuffer filterFields = new StringBuffer();
            Object temp = obj;
            if (obj instanceof List) {
                if (((List) obj).size() == 0) {
                    return new String[0];
                }

                temp = ((List) obj).get(0);
            }

            if (temp != null && !temp.getClass().isPrimitive() && !isSimplteObject(temp) && (!isWrapClass(temp.getClass()) || temp.getClass().isArray()) && temp.getClass() != Object.class && !(temp instanceof Map)) {
                JsonFilter filterAnnotation = temp.getClass().getAnnotation(JsonFilter.class);
                if (filterAnnotation != null && "JsonFilter".equals(filterAnnotation.value())) {
                    JsonPropertiesFilter clazzAnnotation = temp.getClass().getAnnotation(JsonPropertiesFilter.class);
                    if (clazzAnnotation != null) {
                        String[] filterFields1 = clazzAnnotation.filterFields();
                        if (filterFields1 != null && filterFields1.length > 0) {
                            filterFields.append(filterFields1[0]);

                            for (int i = 1; i < filterFields1.length; ++i) {
                                filterFields.append("," + filterFields1[i]);
                            }
                        }
                    }
                }

                Method[] allMethods = temp.getClass().getDeclaredMethods();
                List<Method> usefulMethods = new ArrayList();
                Method[] var15 = allMethods;
                int var7 = allMethods.length;

                for (int var8 = 0; var8 < var7; ++var8) {
                    Method method = var15[var8];
                    if (method.getName().matches("^is.*") || method.getName().matches("^get.*")) {
                        usefulMethods.add(method);
                    }
                }

                if (usefulMethods != null && usefulMethods.size() > 0) {
                    Iterator var16 = usefulMethods.iterator();

                    label143:
                    while (true) {
                        String[] sonFields;
                        do {
                            do {
                                String tempField;
                                Object value;
                                do {
                                    do {
                                        Method method;
                                        Class m;
                                        do {
                                            do {
                                                do {
                                                    do {
                                                        do {
                                                            do {
                                                                do {
                                                                    do {
                                                                        do {
                                                                            if (!var16.hasNext()) {
                                                                                break label143;
                                                                            }

                                                                            method = (Method) var16.next();
                                                                            m = method.getReturnType();
                                                                        } while (m == Void.TYPE);
                                                                    } while (method.getName().equals("getOrderFor"));

                                                                    value = MethodUtils.invokeMethod(temp, method.getName());
                                                                    if (m == List.class && value != null && ((List) value).size() > 0) {
                                                                        m = ((List) value).get(0).getClass();
                                                                        value = ((List) value).get(0);
                                                                    }
                                                                } while (m.isPrimitive());
                                                            } while (m == temp.getClass());
                                                        } while (isSimplteObject(value));
                                                    } while (isWrapClass(m));
                                                } while (m.isArray());
                                            } while (m == Object.class);
                                        } while (m == Map.class);

                                        if (method.getName().matches("^is.*")) {
                                            tempField = method.getName().substring(2);
                                        } else {
                                            tempField = method.getName().substring(3);
                                        }

                                        tempField = tempField.substring(0, 1).toLowerCase() + tempField.substring(1);
                                    } while (value == null);
                                } while (filterFields.toString().contains(tempField));

                                sonFields = getFilterFields(value);
                            } while (sonFields == null);
                        } while (sonFields.length <= 0);

                        if (filterFields.length() <= 0) {
                            filterFields.append(sonFields[0]);
                        } else {
                            filterFields.append("," + sonFields[0]);
                        }

                        for (int i = 1; i < sonFields.length; ++i) {
                            filterFields.append("," + sonFields[i]);
                        }
                    }
                }

                if (filterFields != null && filterFields.length() > 0) {
                    return filterFields.toString().split(",");
                } else {
                    return new String[0];
                }
            } else {
                return new String[0];
            }
        }
    }

    public static boolean isSimplteObject(Object o) {
        return o != null && (o instanceof String || o instanceof Long || o instanceof Integer || o instanceof Float || o instanceof Double || o instanceof Boolean || o instanceof Byte || o instanceof Character || o instanceof Short || o instanceof Date);
    }

    public static boolean isWrapClass(Class clzz) {
        try {
            return clzz == String.class || clzz == Long.class || clzz == Integer.class || clzz == Float.class || clzz == Double.class || clzz == Boolean.class || clzz == Byte.class || clzz == Character.class || clzz == Short.class || clzz == Date.class;
        } catch (Exception var2) {
            return false;
        }
    }
}
