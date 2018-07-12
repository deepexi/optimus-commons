### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`void`|`changeWorkingDirectory(java.lang.String path)` |
|`boolean`|`connect(java.lang.String host,       int port,       java.lang.String username,       java.lang.String pwd)` |
|`void`|`copySingleFile(java.lang.String fullFileName,              java.lang.String targetFileName)`复制单个文件|
|`boolean`|`delete(java.lang.String path,      java.lang.String fileName)` |
|`void`|`disconnect()` |
|`boolean`|`downLoadFiles(java.lang.String path,             java.lang.String fileName,             java.lang.String trueName,             java.io.OutputStream os)`下载文件|
|`void`|`makeDirs(java.lang.String path,        java.lang.String fixedPath)` |
|`void`|`putFile(java.lang.String path,       java.lang.String fixedPath,       java.lang.String ftpFileName,       java.io.InputStream in)` |
|`void`|`sendSiteCommand(java.lang.String cmd)` |

- 
### 方法详细资料 ###

- 
#### connect ####

```
public boolean connect(java.lang.String host,
                       int port,
                       java.lang.String username,
                       java.lang.String pwd)
```


- 
#### changeWorkingDirectory ####

```
public void changeWorkingDirectory(java.lang.String path)
                            throws java.io.IOException
```

抛出:
:   `java.io.IOException`


- 
#### sendSiteCommand ####

```
public void sendSiteCommand(java.lang.String cmd)
                     throws java.io.IOException
```

抛出:
:   `java.io.IOException`


- 
#### makeDirs ####

```
public void makeDirs(java.lang.String path,
                     java.lang.String fixedPath)
              throws java.io.IOException
```

抛出:
:   `java.io.IOException`


- 
#### putFile ####

```
public void putFile(java.lang.String path,
                    java.lang.String fixedPath,
                    java.lang.String ftpFileName,
                    java.io.InputStream in)
             throws java.io.IOException
```

抛出:
:   `java.io.IOException`


- 
#### delete ####

```
public boolean delete(java.lang.String path,
                      java.lang.String fileName)
               throws java.io.IOException
```

抛出:
:   `java.io.IOException`


- 
#### copySingleFile ####

```
public void copySingleFile(java.lang.String fullFileName,
                           java.lang.String targetFileName)
                    throws java.io.IOException
```

复制单个文件

参数:
:   `fullFileName` - 源文件,全路径

:   `targetFileName` - 目标文件，全路径

抛出:
:   `java.io.IOException`


- 
#### disconnect ####

```
public void disconnect()
                throws java.io.IOException
```

抛出:
:   `java.io.IOException`


- 
#### downLoadFiles ####

```
public boolean downLoadFiles(java.lang.String path,
                             java.lang.String fileName,
                             java.lang.String trueName,
                             java.io.OutputStream os)
```

下载文件

参数:
:   `path` - 下载文件所在文件夹路径

:   `fileName` - 下载文件名（这里是已经加密的名字）

:   `trueName` - 真实文件名

返回: