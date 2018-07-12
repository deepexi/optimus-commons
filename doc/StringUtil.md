### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`static java.lang.String`|`addSQuote(java.lang.String str)`将类似id1,id2,id3字符串改成'id1','id2','id3'字符串 即sql内的in子句内容|
|`static java.lang.String`|`filterQueryValue(java.lang.String str)`过滤查询条件值，避免sql注入|
|`static java.lang.String`|`getRandomString(int length)` |
|`static boolean`|`isBlank(java.lang.CharSequence cs)`Checks if a CharSequence is whitespace, empty ("") or null.|
|`static boolean`|`isEmpty(java.lang.CharSequence cs)`Checks if a CharSequence is empty ("") or null.|
|`static boolean`|`isNotBlank(java.lang.CharSequence cs)`Checks if a CharSequence is not empty (""), not null and not whitespace only.|
|`static boolean`|`isNotEmpty(java.lang.CharSequence cs)`Checks if a CharSequence is not empty ("") and not null.|
|`static java.lang.String`|`listToString(java.util.List<?> list,            java.lang.String split)`List转换String|
|`static void`|`main(java.lang.String[] args)` |
|`static java.lang.String`|`parseFromException(java.lang.Exception e)` |
|`static java.lang.String`|`setToString(java.util.Set<?> set,           java.lang.String split)` |

- 
### 方法详细资料 ###

- 
#### addSQuote ####

```
public static java.lang.String addSQuote(java.lang.String str)
```

将类似id1,id2,id3字符串改成'id1','id2','id3'字符串 即sql内的in子句内容

参数:
:   `str` - 

返回:


- 
#### setToString ####

```
public static java.lang.String setToString(java.util.Set<?> set,
                                           java.lang.String split)
```


- 
#### listToString ####

```
public static java.lang.String listToString(java.util.List<?> list,
                                            java.lang.String split)
```

List转换String

参数:
:   `list` - :需要转换的List

返回:
:   String转换后的字符串


- 
#### filterQueryValue ####

```
public static java.lang.String filterQueryValue(java.lang.String str)
```

过滤查询条件值，避免sql注入

参数:
:   `str` - 

返回:


- 
#### parseFromException ####

```
public static java.lang.String parseFromException(java.lang.Exception e)
```


- 
#### getRandomString ####

```
public static java.lang.String getRandomString(int length)
```


- 
#### isBlank ####

```
public static boolean isBlank(java.lang.CharSequence cs)
```

Checks if a CharSequence is whitespace, empty ("") or null.

```

 StringUtils.isBlank(null)      = true
 StringUtils.isBlank("")        = true
 StringUtils.isBlank(" ")       = true
 StringUtils.isBlank("bob")     = false
 StringUtils.isBlank("  bob  ") = false
 
```

参数:
:   `cs` - the CharSequence to check, may be null

返回:
:   `true` if the CharSequence is null, empty or whitespace

从以下版本开始:
:   2.0, 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)


- 
#### isNotBlank ####

```
public static boolean isNotBlank(java.lang.CharSequence cs)
```

Checks if a CharSequence is not empty (""), not null and not whitespace only.

```

 StringUtils.isNotBlank(null)      = false
 StringUtils.isNotBlank("")        = false
 StringUtils.isNotBlank(" ")       = false
 StringUtils.isNotBlank("bob")     = true
 StringUtils.isNotBlank("  bob  ") = true
 
```

参数:
:   `cs` - the CharSequence to check, may be null

返回:
:   `true` if the CharSequence is
  not empty and not null and not whitespace

从以下版本开始:
:   2.0, 3.0 Changed signature from isNotBlank(String) to isNotBlank(CharSequence)


- 
#### isEmpty ####

```
public static boolean isEmpty(java.lang.CharSequence cs)
```

Checks if a CharSequence is empty ("") or null.

```

 StringUtils.isEmpty(null)      = true
 StringUtils.isEmpty("")        = true
 StringUtils.isEmpty(" ")       = false
 StringUtils.isEmpty("bob")     = false
 StringUtils.isEmpty("  bob  ") = false
 
```

NOTE: This method changed in Lang version 2.0.
 It no longer trims the CharSequence.
 That functionality is available in isBlank().

参数:
:   `cs` - the CharSequence to check, may be null

返回:
:   `true` if the CharSequence is empty or null

从以下版本开始:
:   3.0 Changed signature from isEmpty(String) to isEmpty(CharSequence)


- 
#### isNotEmpty ####

```
public static boolean isNotEmpty(java.lang.CharSequence cs)
```

Checks if a CharSequence is not empty ("") and not null.

```

 StringUtils.isNotEmpty(null)      = false
 StringUtils.isNotEmpty("")        = false
 StringUtils.isNotEmpty(" ")       = true
 StringUtils.isNotEmpty("bob")     = true
 StringUtils.isNotEmpty("  bob  ") = true
 
```

参数:
:   `cs` - the CharSequence to check, may be null

返回:
:   `true` if the CharSequence is not empty and not null

从以下版本开始:
:   3.0 Changed signature from isNotEmpty(String) to isNotEmpty(CharSequence)


- 
#### main ####

```
public static void main(java.lang.String[] args)
```