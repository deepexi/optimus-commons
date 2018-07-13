### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`void`|`changeWorkingDirectory(java.lang.String path)`切换工具目录|
|`boolean`|`connect(java.lang.String host,       int port,       java.lang.String username,       java.lang.String pwd)`创建FtpClient实例|
|`void`|`copySingleFile(java.lang.String fullFileName,              java.lang.String targetFileName)`复制单个文件|
|`static void`|`delete(java.lang.String host,      int port,      java.lang.String username,      java.lang.String pwd,      java.lang.String path,      java.lang.String fileName)`删除文件|
|`boolean`|`delete(java.lang.String path,      java.lang.String fileName)`删除文件|
|`void`|`disconnect()`断开连接|
|`static void`|`downLoadFiles(java.lang.String host,             int port,             java.lang.String username,             java.lang.String pwd,             java.lang.String path,             java.lang.String fileName,             java.io.OutputStream os)`下载文件|
|`boolean`|`downLoadFiles(java.lang.String path,             java.lang.String fileName,             java.lang.String trueName,             java.io.OutputStream os)`下载文件|
|`void`|`makeDirs(java.lang.String path,        java.lang.String basePath)`创建目录|
|`static void`|`putFile(java.lang.String host,       int port,       java.lang.String username,       java.lang.String pwd,       java.lang.String path,       java.lang.String basePath,       java.lang.String ftpFileName,       java.io.InputStream in)`上传文件|
|`void`|`putFile(java.lang.String path,       java.lang.String basePath,       java.lang.String ftpFileName,       java.io.InputStream in)`上传文件|
|`void`|`sendSiteCommand(java.lang.String cmd)`发送命令|

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

创建FtpClient实例

参数:
:   `host` - 

:   `port` - 

:   `username` - 

:   `pwd` - 


- 
#### changeWorkingDirectory ####

```
public void changeWorkingDirectory(java.lang.String path)
                            throws java.io.IOException
```

切换工具目录

参数:
:   `path` - 

抛出:
:   `java.io.IOException`


- 
#### sendSiteCommand ####

```
public void sendSiteCommand(java.lang.String cmd)
                     throws java.io.IOException
```

发送命令

参数:
:   `cmd` - 

抛出:
:   `java.io.IOException`


- 
#### makeDirs ####

```
public void makeDirs(java.lang.String path,
                     java.lang.String basePath)
              throws java.io.IOException
```

创建目录

参数:
:   `path` - 

:   `basePath` - 

抛出:
:   `java.io.IOException`


- 
#### putFile ####

```
public static void putFile(java.lang.String host,
                           int port,
                           java.lang.String username,
                           java.lang.String pwd,
                           java.lang.String path,
                           java.lang.String basePath,
                           java.lang.String ftpFileName,
                           java.io.InputStream in)
```

上传文件

参数:
:   `host` - 

:   `port` - 

:   `username` - 

:   `pwd` - 

:   `path` - 

:   `basePath` - 

:   `ftpFileName` - 

:   `in` - 


- 
#### downLoadFiles ####

```
public static void downLoadFiles(java.lang.String host,
                                 int port,
                                 java.lang.String username,
                                 java.lang.String pwd,
                                 java.lang.String path,
                                 java.lang.String fileName,
                                 java.io.OutputStream os)
```

下载文件

参数:
:   `host` - 

:   `port` - 

:   `username` - 

:   `pwd` - 

:   `path` - 

:   `fileName` - 

:   `os` - 


- 
#### delete ####

```
public static void delete(java.lang.String host,
                          int port,
                          java.lang.String username,
                          java.lang.String pwd,
                          java.lang.String path,
                          java.lang.String fileName)
```

删除文件

参数:
:   `host` - 

:   `port` - 

:   `username` - 

:   `pwd` - 

:   `path` - 

:   `fileName` - 


- 
#### putFile ####

```
public void putFile(java.lang.String path,
                    java.lang.String basePath,
                    java.lang.String ftpFileName,
                    java.io.InputStream in)
             throws java.io.IOException
```

上传文件

参数:
:   `path` - 

:   `basePath` - 

:   `ftpFileName` - 

:   `in` - 

抛出:
:   `java.io.IOException`


- 
#### delete ####

```
public boolean delete(java.lang.String path,
                      java.lang.String fileName)
               throws java.io.IOException
```

删除文件

参数:
:   `path` - 

:   `fileName` - 

返回:
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

断开连接

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