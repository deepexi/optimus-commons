### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`static java.lang.String`|`decodeString(java.lang.String value)`String中值解密|
|`static java.lang.String`|`decodeString(java.lang.String value,            java.lang.String code)`String中值解密|
|`static java.lang.String`|`encodeString(java.lang.String value)`String中的值加密|
|`static java.lang.String`|`encodeString(java.lang.String value,            java.lang.String code)`对字符串指定编码加密|

- 
### 方法详细资料 ###

- 
#### encodeString ####

```
public static java.lang.String encodeString(java.lang.String value)
```

String中的值加密
		
```
encodeString("123456789")
```		


- 
#### encodeString ####

```
public static java.lang.String encodeString(java.lang.String value,
                                            java.lang.String code)
```

对字符串指定编码加密
		
```

```		

参数:
:   `value` - 值

:   `code` - 编码

返回:
:   返回加密值


- 
#### decodeString ####

```
public static java.lang.String decodeString(java.lang.String value)
```

String中值解密
		
```
decodeString("MTIzNDU2Nzg5")
```		


- 
#### decodeString ####

```
public static java.lang.String decodeString(java.lang.String value,
                                            java.lang.String code)
```

String中值解密
		
```

```		


