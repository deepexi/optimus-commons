### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`static java.lang.String`|`generate(java.lang.String password)`加盐MD5|
|`static java.lang.String`|`getMD5ByFile(java.io.File file)`获取该文件的MD5值|
|`static java.lang.String`|`getMD5ByInputStream(java.io.InputStream is)`获取该输入流的MD5值|
|`static java.lang.String`|`getMd5ByString(java.lang.String sourceString)`获取该字符串的MD5值   用例: MD5Util.getMd5ByString("123") = 202cb962ac59075b964b07152d234b70  |
|`static java.lang.String`|`getMD5Code(java.lang.String strObj)`前端jquery.md5.js加密 对应 后端MD5加密|
|`static java.lang.String`|`MD5(java.lang.String input)`普通MD5|
|`static boolean`|`verify(java.lang.String password,      java.lang.String md5)`校验加盐后是否和原文一致MD5Util.verify("123", "023681031e16a77873c39e00911a1fb9268f26938125306f")  = true|

### 方法详细资料 ###

- 
#### getMd5ByString ####

```
public static java.lang.String getMd5ByString(java.lang.String sourceString)
```

获取该字符串的MD5值


```

 用例:
 MD5Util.getMd5ByString("123") = 202cb962ac59075b964b07152d234b70
 
 
```

参数:
:   `sourceString` - 

返回:


- 
#### getMD5ByInputStream ####

```
public static java.lang.String getMD5ByInputStream(java.io.InputStream is)
```

获取该输入流的MD5值

参数:
:   `is` - 

返回:
抛出:
:   `java.security.NoSuchAlgorithmException`

:   `java.io.IOException`


- 
#### getMD5ByFile ####

```
public static java.lang.String getMD5ByFile(java.io.File file)
```

获取该文件的MD5值

参数:
:   `file` - 

返回:
抛出:
:   `java.security.NoSuchAlgorithmException`

:   `java.io.IOException`


- 
#### getMD5Code ####

```
public static java.lang.String getMD5Code(java.lang.String strObj)
```

前端jquery.md5.js加密 对应 后端MD5加密

参数:
:   `strObj` - 

返回:


- 
#### MD5 ####

```
public static java.lang.String MD5(java.lang.String input)
```

普通MD5

参数:
:   `input` - 

返回:


- 
#### generate ####

```
public static java.lang.String generate(java.lang.String password)
```

加盐MD5

参数:
:   `password` - 

返回:
:   用例


- 
#### verify ####

```
public static boolean verify(java.lang.String password,
                             java.lang.String md5)
```

校验加盐后是否和原文一致

```
MD5Util.verify("123", "023681031e16a77873c39e00911a1fb9268f26938125306f")  = true
```

参数:
:   `password` - 

:   `md5` - 

返回:

