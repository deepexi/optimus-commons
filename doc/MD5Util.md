# Documentation

## `public class MD5Util`

MD5工具类

## `public static String getMd5ByString(String sourceString)`

获取该字符串的MD5值

<pre> 用例: MD5Util.getMd5ByString("123") = 202cb962ac59075b964b07152d234b70 </pre>

 * **Parameters:** `sourceString` — 
 * **Returns:** 

## `public static String getMD5ByInputStream(InputStream is)`

获取该输入流的MD5值

 * **Parameters:** `is` — 
 * **Returns:** 
 * **Exceptions:**
   * `NoSuchAlgorithmException` — 
   * `IOException` — 

## `public static String getMD5ByFile(File file)`

获取该文件的MD5值

 * **Parameters:** `file` — 
 * **Returns:** 
 * **Exceptions:**
   * `NoSuchAlgorithmException` — 
   * `IOException` — 

## `public static String getMD5Code(String strObj)`

前端jquery.md5.js加密 对应 后端MD5加密

 * **Parameters:** `strObj` — 
 * **Returns:** 

## `private static String byteToArrayString(byte bByte)`

返回形式为数字跟字符串

 * **Parameters:** `bByte` — 
 * **Returns:** 

## `private static String byteToString(byte[] bByte)`

转换字节数组为16进制字串

 * **Parameters:** `bByte` — 
 * **Returns:** 

## `public static String MD5(String input)`

普通MD5

 * **Parameters:** `input` — 
 * **Returns:** 
 * **Author:** daniel

## `public static String generate(String password)`

加盐MD5

 * **Parameters:** `password` — 
 * **Returns:** 用例
 * **Author:** daniel

## `public static boolean verify(String password, String md5)`

校验加盐后是否和原文一致

 * **Parameters:**
   * `password` — 
   * `md5` — 
 * **Returns:** 
 * **Author:** daniel

## `private static String md5Hex(String src)`

获取十六进制字符串形式的MD5摘要

## `public static void main(String[] args)`

test