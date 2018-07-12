## `public class DateUtils`

日期时间工具

 * **Author:** yunzi7758

     <p>


## `public static boolean isDate(String dateAsText)`

判断字符串是否日期格式

 * **Parameters:** `dateAsText` — 
 * **Returns:** 

## `public static Date now()`

获取当前时间

 * **Returns:** * 
 <pre>DateUtils.now() = Thu Jul 12 10:58:12 CST 2018</pre>

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

     <pre>DateUtils.currentYear() = 2018</pre>

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
<pre>DateUtils.getHour() = 10</pre>

## `public static String getTime()`

得到现在分钟

 * **Returns:** *
    <pre>DateUtils.getTime() = 58</pre>

## `public static String getTwoHour(String st1, String st2)`

二个小时时间间的差值,必须保证二个时间都是"HH:MM"的格式，返回字符型的分钟

## `public static String getTwoDay(String sj1, String sj2)`

得到二个日期间的间隔天数

## `public static String getPreTime(String sj1, String jj)`

时间前推或后推分钟,其中JJ表示分钟.

## `public static String getNextDay(String nowdate, String delay)`

得到一个时间延后或前移几天的时间,nowdate为时间,delay为前移或后延的天数 


<pre>DateUtils.getNextDay("Thu Jul 12 10:58:12 CST 2018","2") = Mon Jul 16 10:58:12 CST 2018</pre>

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

## `public static long millionSecondsOfDay = 86400000`

一天中一共的毫秒数

## `public static long millionSecondsOfHour = 3600000`

一小时中一共得毫秒数

## `public static int getDifferYear(Date date1, Date date2)`

得到两个日期之间相差的年数

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** 

## `public static int getDifferYear(String date1, String date2)`

得到两个日期之间相差的年数

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** 

## `public static int getDifferMonth(Date date1, Date date2)`

得到两个日期之间相差的月数

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** 

## `public static int getDifferMonth(String date1, String date2)`

得到两个日期之间相差的月数

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** 

## `private static int getDifferDay(Date date1, Date date2)`

得到两个日期之间相差的天数,两头不算,取出数据后，可以根据需要再加

 * **Deprecated**
 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** 

## `public static int getDifferDay(String date1, String date2)`

得到两个日期之间相差的天数,两头不算,取出数据后，可以根据需要再加

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** 

## `public static int[] getDifferHourAndMinute(String date1, String time1, String date2, String time2)`

计算2个时间之间的相差的小时和分钟数，返回XX小时XX分 注意date1格式为yyyy-MM-dd 注意date2格式为yyyy-MM-dd 注意time1格式为HH:mm 注意time2格式为HH:mm date1<date2

 * **Parameters:**
   * `date1` — 
   * `time1` — 
   * `date2` — 
   * `time2` — 
 * **Returns:** resultHM[hours,mins]

## `public static int[] getDifferHourAndMinute(Date date1, Date date2)`

计算2个时间之间的相差的小时和分钟数，返回XX小时XX分 注意date1格式为yyyy-MM-dd HH:mm 注意date2格式为yyyy-MM-dd HH:mm date1<date2

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** resultHM[hours,mins]

## `public static int[] getDifferHourAndMinute(String date1, String date2)`

计算2个时间之间的相差的小时和分钟数，返回XX小时XX分 注意date1格式为yyyy-MM-dd HH:mm 注意date2格式为yyyy-MM-dd HH:mm date1<date2

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** resultHM[hours,mins]

## `public static int getDifferHour(Date date1, Date date2)`

计算2个时间之间的相差的小时数(Date,Date) date1<date2

 * **Parameters:**
   * `Date` — date1
   * `Date` — date2
 * **Returns:** 

## `public static int getDifferHour(String date1, String date2)`

计算2个时间之间的相差的小时(String,String) date1<date2

 * **Parameters:**
   * `String` — date1
   * `String` — date2
 * **Returns:** 

## `public static int getDifferMinute(String date1, String date2)`

返回两日期相差的分钟数[日期格式为: "yyyy-MM-dd HH:mm"]

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** 
 * **Author:** hai

## `public static int getDifferMinute(Date date1, Date date2)`

返回两日期相差的分钟数[日期格式为: "yyyy-MM-dd HH:mm"]

 * **Parameters:**
   * `date1` — 
   * `date2` — 
 * **Returns:** 
 * **Author:** hai

## `public static Date addYear(Date date, int years)`

计算日期加年

 * **Parameters:**
   * `date` — 
   * `months` — 
 * **Returns:** 

## `public static Date addMonth(Date date, int months)`

计算日期加月数

 * **Parameters:**
   * `date` — 
   * `months` — 
 * **Returns:** 

## `public static Date addDay(Date date, int days)`

计算日期加天数

 * **Parameters:**
   * `date` — 
   * `days` — 
 * **Returns:** 

## `public static Date minusDay(Date date, int days)`

计算日期减天数

 * **Parameters:**
   * `date` — 
   * `days` — 
 * **Returns:** 

## `public static Date addMinutes(Date date, int minutes)`

计算日期加分钟数

 * **Parameters:**
   * `date` — 
   * `minutes` — 
 * **Returns:** 

## `public static Date addHour(Date date, int hour)`

计算日期小时

 * **Parameters:**
   * `date` — 
   * `minutes` — 
 * **Returns:** 

## `public static String format(Date date)`

格式化日期为String型(yyyy-MM-dd)

 * **Parameters:**
   * `date` — 
   * `formater` — 
 * **Returns:** * 

 <pre>DateUtils.format("Thu Jul 12 10:58:12 CST 2018") = 2018-07-12</pre>

## `public static String format(Date date, String formater)`

根据指定日期格式格式化日期为String型

 * **Parameters:**
   * `date` — 
   * `formater` — 
 * **Returns:** 

## `public static Date parse(String date)`

格式化日期为Date型(yyyy-MM-dd)

 * **Parameters:**
   * `date` — 
   * `formater` — 
 * **Returns:** 

## `public static Date parse(String date, String formater)`

根据指定日期格式格式化日期为Date型

 * **Parameters:**
   * `date` — 
   * `formater` — 
 * **Returns:** 

## `public static int getWeekOfDate(Date date)`

根据日期取出是星期几,数字

 * **Parameters:** `date` — 
 * **Returns:** int 返回1-7

## `public static String getWeekTextOfDate(Date date)`

根据日期取出是星期几,中文

 * **Parameters:** `date` — 
 * **Returns:** int 返回1-7

## `public static String getCurrenDate()`

得到当前的日期，格式为：yyyy-MM-dd

 * **Returns:** 为一个字符串

## `public static String getCurrentTime()`

得到当前的时间，精确到毫秒，格式为：yyyy-MM-dd hh:mm:ss

 * **Returns:** 为一个字符串

## `public static java.sql.Date convertUtilDateToSQLDate(java.util.Date date)`

将java时间转为sql时间

 * **Parameters:** `date` — 
 * **Returns:** 

## `public static java.util.Date convertSQLDateToUtilDate(java.sql.Date date)`

将sql时间转为java时间

 * **Parameters:** `date` — 
 * **Returns:** 

## `public static boolean isLeapYear(int year)`

是否为闰年

 * **Parameters:** `year` — 
 * **Returns:** 

## `public static boolean isToday(Date date)`

是否为当天

 * **Parameters:** `date` — 
 * **Returns:** 

## `public static Timestamp getSysTimestamp()`

取Java虚拟机系统时间, 返回当前时间戳

 * **Returns:** Timestamp类型的时间

## `public static Date getSysDate()`

取Java虚拟机系统时间, 返回当前Date

 * **Returns:** Date类型的时间

## `public static boolean isBetweenDateByClosedInterval(Date date1, Date date2)`

当前日期是否在指定区间日期范围内-- 闭区间

 * **Parameters:**
   * `date1` — Date类型
   * `date2` — Date类型
 * **Returns:** 

## `public static boolean isBetweenDateByOpenInterval(Date date1, Date date2)`

当前日期是否在指定区间日期范围内-- 开区间

 * **Parameters:**
   * `date1` — Date类型
   * `date2` — Date类型
 * **Returns:** 

## `public static boolean DateisBetweenDateByClosedInterval(Date curDate, String sDate1, String date2)`

当前日期是否在指定区间日期范围内-- 闭区间

 * **Parameters:**
   * `sDate1` — String类型（格式为：yyyy-MM-dd）
   * `date2` — String类型（格式为：yyyy-MM-dd）
 * **Returns:** 

## `public static boolean DateisBetweenDateByOpenInterval(Date curDate, String sDate1, String date2)`

当前日期是否在指定区间日期范围内-- 开区间

 * **Parameters:**
   * `sDate1` — String类型（格式为：yyyy-MM-dd）
   * `date2` — String类型（格式为：yyyy-MM-dd）
 * **Returns:** 

## `public static boolean isBetweenDateByClosedInterval(String sDate1, String date2)`

当前日期是否在指定区间日期范围内-- 闭区间

 * **Parameters:**
   * `sDate1` — String类型（格式为：yyyy-MM-dd）
   * `date2` — String类型（格式为：yyyy-MM-dd）
 * **Returns:** 

## `public static boolean isBetweenDateByOpenInterval(String sDate1, String date2)`

当前日期是否在指定区间日期范围内-- 开区间

 * **Parameters:**
   * `sDate1` — String类型（格式为：yyyy-MM-dd）
   * `date2` — String类型（格式为：yyyy-MM-dd）
 * **Returns:** 

## `public static String getCurrentTimeNum()`

得到当前的时间，精确到毫秒，格式为：yyyyMMddHHmmssSSS

 * **Returns:** 为一个字符串

## `public static int[] getTimeByCalendar(Date date)`

时间转换为年月日时分秒 周

 * **Parameters:** `date` — 
 * **Returns:** 