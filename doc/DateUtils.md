
## `public class DateUtils`

日期时间工具

 * **Author:** yunzi7758

 
## `public static boolean isDate(String dateAsText)`

判断字符串是否日期格式

 * **Parameters:** `dateAsText` — 
 * **Returns:** 

## `public static String toDateText(Date date)`

yyyy-MM-dd

 * **Parameters:** `date` — 
 * **Returns:** 

## `public static Date getDate(String dateText)`

yyyy-MM-dd格式字符串转为Date

 * **Parameters:** `dateText` — 
 * **Returns:** 

## `public static String toDateTime(Date date)`

yyyy-MM-dd HH:mm

 * **Parameters:** `date` — 
 * **Returns:** 

## `public static int currentYear()`

当前年份

 * **Returns:** Current year

## `public static String getTimeShort()`

获取时间 小时:分;秒 HH:mm:ss

 * **Returns:** 

## `public static Date getLastDate(long day)`

提取一个月中的最后一天

 * **Parameters:** `day` — 
 * **Returns:** 

## `public static String getStringToday()`

得到现在时间

 * **Returns:** 字符串 yyyyMMdd HHmmss

## `public static String getHour()`

得到现在小时

## `public static String getTime()`

得到现在分钟

 * **Returns:** 

## `public static String getTwoHour(String st1, String st2)`

二个小时时间间的差值,必须保证二个时间都是"HH:MM"的格式，返回字符型的分钟

## `public static String getTwoDay(String sj1, String sj2)`

得到二个日期间的间隔天数

## `public static String getPreTime(String sj1, String jj)`

时间前推或后推分钟,其中JJ表示分钟.

## `public static String getNextDay(String nowdate, String delay)`

得到一个时间延后或前移几天的时间,nowdate为时间,delay为前移或后延的天数

## `public static Date getNextDay(Date d, int delay)`

得到一个时间延后或前移几天的时间,nowdate为时间,delay为前移或后延的天数

## `public static boolean isLeapYear(String ddate)`

判断是否润年

 * **Parameters:** `ddate` — 
 * **Returns:** 

## `Date d = getDate(ddate)`

详细设计： 1.被400整除是闰年，否则： 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年 3.能被4整除同时能被100整除则不是闰年

## `public static String getEndDateOfMonth(String dat)`

获取一个月的最后一天

 * **Parameters:** `dat` — 
 * **Returns:** 

## `public static boolean isSameWeekDates(Date date1, Date date2)`

判断二个时间是否在同一个周

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** 

## `public static String getSeqWeek()`

产生周序列,即得到当前时间所在的年度是第几周

 * **Returns:** 

## `public static String getWeek(String sdate, String num)`

获得一个日期所在的周的星期几的日期，如要找出2002年2月3日所在周的星期一是几号

 * **Parameters:**
   * `sdate` — 
   * `num` — 
 * **Returns:** 

## `public static String getWeek(String sdate)`

根据一个日期，返回是星期几的字符串

 * **Parameters:** `sdate` — 
 * **Returns:** 

## `public static long getDays(String date1, String date2)`

两个时间之间的天数

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** 

## `public static String getNowMonth(String sdate)`

形成如下的日历 ， 根据传入的一个时间返回一个结构 星期日 星期一 星期二 星期三 星期四 星期五 星期六 下面是当月的各个时间 此函数返回该日历第一行星期日所在的日期

 * **Parameters:** `sdate` — 
 * **Returns:** 

## `public static boolean rightDate(String date)`

 * **Parameters:** `args` — 