### 方法概要 ###

所有方法  
| 限定符和类型                                          | 方法和说明                                                   |
| ----------------------------------------------------- | ------------------------------------------------------------ |
| `static java.lang.reflect.Constructor<?>[]`           | `getAllConstructorsOfClass(java.lang.Class<?> clazz,                         boolean accessible)`获取类的所有构造方法 |
| `static java.lang.reflect.Method[]`                   | `getAllInstanceMethods(java.lang.Class<?> clazz)`获取某个类的所有实例方法，包含所有非静态的公有方法 |
| `static <A extends java.lang.annotation.Annotation>A` | `getAnnotation(java.lang.Class<?> clazz,             java.lang.Class<A> annoClazz)`获取某个类上面某种类型的所有注解 |
| `static <T> T`                                        | `newInstance(java.lang.Class<T> clazz)`根据clazz获取实例对象 |

- 
### 方法详细资料 ###

- 
#### getAnnotation ####

```
public static <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<?> clazz,
                                                                          java.lang.Class<A> annoClazz)
```

获取某个类上面某种类型的所有注解

参数:
:   `clazz` - 类

:   `annoClazz` - 注解类型

返回:
:   注解


- 
#### getAllInstanceMethods ####

```
public static java.lang.reflect.Method[] getAllInstanceMethods(java.lang.Class<?> clazz)
```

获取某个类的所有实例方法，包含所有非静态的公有方法

参数:
:   `clazz` - 

返回:


- 
#### getAllConstructorsOfClass ####

```
public static java.lang.reflect.Constructor<?>[] getAllConstructorsOfClass(java.lang.Class<?> clazz,
                                                                           boolean accessible)
```

获取类的所有构造方法

参数:
:   `clazz` - 

:   `accessible` - 

返回:


- 
#### newInstance ####

```
public static <T> T newInstance(java.lang.Class<T> clazz)
```

根据clazz获取实例对象

参数:
:   `clazz` - 

返回: