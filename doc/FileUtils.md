### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`static java.io.File`|`createTmpFile(java.io.InputStream inputStream,             java.lang.String name,             java.lang.String ext)`创建临时文件|
|`static java.io.File`|`createTmpFile(java.io.InputStream inputStream,             java.lang.String name,             java.lang.String ext,             java.io.File tmpDirFile)`创建临时文件|


- 
### 方法详细资料 ###

- 
#### createTmpFile ####

```
public static java.io.File createTmpFile(java.io.InputStream inputStream,
                                         java.lang.String name,
                                         java.lang.String ext,
                                         java.io.File tmpDirFile)
                                  throws java.io.IOException
```

创建临时文件

参数:
:   `inputStream` - 

:   `name` - 文件名

:   `ext` - 扩展名

:   `tmpDirFile` - 临时文件夹目录

返回:
抛出:
:   `java.io.IOException`


- 
#### createTmpFile ####

```
public static java.io.File createTmpFile(java.io.InputStream inputStream,
                                         java.lang.String name,
                                         java.lang.String ext)
                                  throws java.io.IOException
```

创建临时文件

参数:
:   `inputStream` - 

:   `name` - 文件名

:   `ext` - 扩展名

返回:
抛出:
:   `java.io.IOException`