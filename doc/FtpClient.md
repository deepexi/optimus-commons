
## `public class FtpClient`

ftp工具

 * **Author:** yunzi7758

     <p>

## `public void copySingleFile(String fullFileName,String targetFileName)throws IOException`

复制单个文件

 * **Parameters:**
   * `fullFileName` — 源文件,全路径
   * `targetFileName` — 目标文件，全路径

## `public boolean downLoadFiles(String path,String fileName,String trueName,OutputStream os)`

下载文件

 * **Parameters:**
   * `path` — 下载文件所在文件夹路径
   * `fileName` — 下载文件名（这里是已经加密的名字）
   * `trueName` — 真实文件名
 * **Returns:** 