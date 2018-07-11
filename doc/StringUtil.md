
## `public class StringUtil`

字符串工具

 * **Author:** yunzi7758

     <p>

## `public static String addSQuote(String str)`

将类似id1,id2,id3字符串改成'id1','id2','id3'字符串 即sql内的in子句内容

 * **Parameters:** `str` — 
 * **Returns:** 

## `public static String listToString(List<?> list, String split)`

List转换String

 * **Parameters:** `list` — :需要转换的List
 * **Returns:** String转换后的字符串

## `public static String filterQueryValue(String str)`

过滤查询条件值，避免sql注入

 * **Parameters:** `str` — 
 * **Returns:** 

## `public static boolean isBlank(CharSequence cs)`

Checks if a CharSequence is whitespace, empty ("") or null.



<pre> StringUtils.isBlank(null) = true StringUtils.isBlank("") = true StringUtils.isBlank(" ") = true StringUtils.isBlank("bob") = false StringUtils.isBlank(" bob ") = false </pre>

 * **Parameters:** `cs` — the CharSequence to check, may be null
 * **Returns:** {@code true} if the CharSequence is null, empty or whitespace
 * **Since:**
   * 2.0
   * 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)

## `public static boolean isNotBlank(CharSequence cs)`

Checks if a CharSequence is not empty (""), not null and not whitespace only.



<pre> StringUtils.isNotBlank(null) = false StringUtils.isNotBlank("") = false StringUtils.isNotBlank(" ") = false StringUtils.isNotBlank("bob") = true StringUtils.isNotBlank(" bob ") = true </pre>

 * **Parameters:** `cs` — the CharSequence to check, may be null
 * **Returns:** {@code true} if the CharSequence is

     not empty and not null and not whitespace
 * **Since:**
   * 2.0
   * 3.0 Changed signature from isNotBlank(String) to isNotBlank(CharSequence)

## `public static boolean isEmpty(CharSequence cs)`

Checks if a CharSequence is empty ("") or null.



<pre> StringUtils.isEmpty(null) = true StringUtils.isEmpty("") = true StringUtils.isEmpty(" ") = false StringUtils.isEmpty("bob") = false StringUtils.isEmpty(" bob ") = false </pre>



NOTE: This method changed in Lang version 2.0. It no longer trims the CharSequence. That functionality is available in isBlank().

 * **Parameters:** `cs` — the CharSequence to check, may be null
 * **Returns:** {@code true} if the CharSequence is empty or null
 * **Since:** 3.0 Changed signature from isEmpty(String) to isEmpty(CharSequence)

## `public static boolean isNotEmpty(CharSequence cs)`

Checks if a CharSequence is not empty ("") and not null.



<pre> StringUtils.isNotEmpty(null) = false StringUtils.isNotEmpty("") = false StringUtils.isNotEmpty(" ") = true StringUtils.isNotEmpty("bob") = true StringUtils.isNotEmpty(" bob ") = true </pre>

 * **Parameters:** `cs` — the CharSequence to check, may be null
 * **Returns:** {@code true} if the CharSequence is not empty and not null
 * **Since:** 3.0 Changed signature from isNotEmpty(String) to isNotEmpty(CharSequence)