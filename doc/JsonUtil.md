### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`static <T> java.lang.String`|`bean2JsonString(T t)`java对象转jsonString   |
|`static <T> java.util.Map<java.lang.String,java.lang.String>`|`bean2Map(T t)`java对象转map  |
|`static <T> T`|`json2Bean(java.lang.String jsonData,         T t)`json 转java对象   |
|`static java.util.Map<java.lang.String,java.lang.String>`|`json2Map(java.lang.String jsonData)`json字符串转map  |
|`static <T> T`|`map2Bean(java.util.Map<java.lang.String,?> mapData,        T t)`map转换成对象   |



- 
### 方法详细资料 ###

- 
#### map2Bean ####

```
public static <T> T map2Bean(java.util.Map<java.lang.String,?> mapData,
                             T t)
```

map转换成对象


```

	@Test
	public void map2bean() {
		HashMap<String,Object> hashMap = new HashMap<>();
		
		hashMap.put("strfield", "strfield");
		hashMap.put("intfield", 1);
		
		TestBean bean = new TestBean();
		
		System.out.println(bean);
		
		bean = JsonUtil.map2Bean(hashMap, bean);
		
		System.out.println(bean);
	}
 
```

参数:
:   `mapData` - 

:   `t` - 

返回:


- 
#### bean2Map ####

```
public static <T> java.util.Map<java.lang.String,java.lang.String> bean2Map(T t)
```

java对象转map

```
	@Test
	public void bean2map() {
		
		TestBean bean = new TestBean("123", 123);
		
		Map<String, String> map = JsonUtil.bean2Map(bean);
		
		System.out.println(map);
	}
 
```

参数:
:   `t` - 

返回:


- 
#### bean2JsonString ####

```
public static <T> java.lang.String bean2JsonString(T t)
```

java对象转jsonString


```

	@Test
	public void bean2JsonString() {
		
		TestBean bean = new TestBean("123", 123);
		
		String jsonString = JsonUtil.bean2JsonString(bean);
		
		System.out.println(jsonString);
	}
 
```

参数:
:   `t` - 

返回:


- 
#### json2Bean ####

```
public static <T> T json2Bean(java.lang.String jsonData,
                              T t)
```

json 转java对象


```

	@Test
	public void json2Bean() {
		
		TestBean bean = new TestBean("123", 123);
		
		String jsonString = JsonUtil.bean2JsonString(bean);
		
		TestBean testBean = new TestBean();
		testBean = JsonUtil.json2Bean(jsonString, testBean);
		
		System.out.println(testBean);
	}
 
```

参数:
:   `jsonData` - 

:   `t` - 

返回:


- 
#### json2Map ####

```
public static java.util.Map<java.lang.String,java.lang.String> json2Map(java.lang.String jsonData)
```

json字符串转map


```

	@Test
	public void json2Map() {
		
		TestBean bean = new TestBean("123", 123);
		
		String jsonString = JsonUtil.bean2JsonString(bean);
		
		Map<String, String> json2Map = JsonUtil.json2Map(jsonString);
		
		System.out.println(json2Map);
	}
 
```

参数:
:   `jsonData` - 

返回:
