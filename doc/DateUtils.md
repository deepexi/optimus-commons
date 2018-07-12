### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`static java.util.Date`|`addDay(java.util.Date date,      int days)`计算日期加天数|
|`static java.util.Date`|`addHour(java.util.Date date,       int hour)`计算日期小时|
|`static java.util.Date`|`addMinutes(java.util.Date date,          int minutes)`计算日期加分钟数|
|`static java.util.Date`|`addMonth(java.util.Date date,        int months)`计算日期加月数|
|`static java.util.Date`|`addYear(java.util.Date date,       int years)`计算日期加年|
|`static java.util.Calendar`|`calendar()` |
|`static java.util.Date`|`convertSQLDateToUtilDate(java.sql.Date date)`将sql时间转为java时间|
|`static java.sql.Date`|`convertUtilDateToSQLDate(java.util.Date date)`将java时间转为sql时间|
|`static int`|`currentYear()`当前年份|
|`static boolean`|`DateisBetweenDateByClosedInterval(java.util.Date curDate,                                 java.lang.String sDate1,                                 java.lang.String date2)`当前日期是否在指定区间日期范围内-- 闭区间|
|`static boolean`|`DateisBetweenDateByOpenInterval(java.util.Date curDate,                               java.lang.String sDate1,                               java.lang.String date2)`当前日期是否在指定区间日期范围内-- 开区间|
|`static java.lang.String`|`format(java.util.Date date)`格式化日期为String型(yyyy-MM-dd)|
|`static java.lang.String`|`format(java.util.Date date,      java.lang.String formater)`根据指定日期格式格式化日期为String型|
|`static java.lang.String`|`formatToEng(java.lang.String date)` |
|`static java.lang.String`|`getCurrenDate()`得到当前的日期，格式为：yyyy-MM-dd|
|`static java.lang.String`|`getCurrentTime()`得到当前的时间，精确到毫秒，格式为：yyyy-MM-dd hh:mm:ss|
|`static java.lang.String`|`getCurrentTimeNum()`得到当前的时间，精确到毫秒，格式为：yyyyMMddHHmmssSSS|
|`static java.util.Date`|`getDate(java.lang.String dateText)`yyyy-MM-dd格式字符串转为Date|
|`static java.util.Date`|`getDate(java.lang.String dateText,       java.lang.String pattern)`pattern格式字符串转为Date|
|`static java.util.Date`|`getDayByInterval(java.util.Date d,                int delay)`得到一个时间延后或前移几天的时间,nowdate为时间,delay为前移或后延的天数|
|`static java.lang.String`|`getDayByInterval(java.lang.String nowdate,                java.lang.String delay)`得到一个时间延后或前移几天的时间,nowdate为时间,delay为前移或后延的天数 DateUtils.getNextDay("Thu Jul 12 10:58:12 CST 2018","2") = Mon Jul 16 10:58:12 CST 2018|
|`static long`|`getDays(java.lang.String date1,       java.lang.String date2)`两个时间之间的天数|
|`static int`|`getDifferDay(java.lang.String date1,            java.lang.String date2)`得到两个日期之间相差的天数,两头不算,取出数据后，可以根据需要再加|
|`static int`|`getDifferHour(java.util.Date date1,             java.util.Date date2)`计算2个时间之间的相差的小时数(Date,Date) date1|
|`static int`|`getDifferHour(java.lang.String date1,             java.lang.String date2)`计算2个时间之间的相差的小时(String,String) date1|
|`static int[]`|`getDifferHourAndMinute(java.util.Date date1,                      java.util.Date date2)`计算2个时间之间的相差的小时和分钟数，返回XX小时XX分 注意date1格式为yyyy-MM-dd HH:mm 注意date2格式为yyyy-MM-dd HH:mm date1|
|`static int[]`|`getDifferHourAndMinute(java.lang.String date1,                      java.lang.String date2)`计算2个时间之间的相差的小时和分钟数，返回XX小时XX分 注意date1格式为yyyy-MM-dd HH:mm 注意date2格式为yyyy-MM-dd HH:mm date1|
|`static int[]`|`getDifferHourAndMinute(java.lang.String date1,                      java.lang.String time1,                      java.lang.String date2,                      java.lang.String time2)`计算2个时间之间的相差的小时和分钟数，返回XX小时XX分 注意date1格式为yyyy-MM-dd 注意date2格式为yyyy-MM-dd 注意time1格式为HH:mm 注意time2格式为HH:mm date1|
|`static int`|`getDifferMinute(java.util.Date date1,               java.util.Date date2)`返回两日期相差的分钟数[日期格式为: "yyyy-MM-dd HH:mm"]|
|`static int`|`getDifferMinute(java.lang.String date1,               java.lang.String date2)`返回两日期相差的分钟数[日期格式为: "yyyy-MM-dd HH:mm"]|
|`static int`|`getDifferMonth(java.util.Date date1,              java.util.Date date2)`得到两个日期之间相差的月数|
|`static int`|`getDifferMonth(java.lang.String date1,              java.lang.String date2)`得到两个日期之间相差的月数|
|`static int`|`getDifferYear(java.util.Date date1,             java.util.Date date2)`得到两个日期之间相差的年数|
|`static int`|`getDifferYear(java.lang.String date1,             java.lang.String date2)`得到两个日期之间相差的年数|
|`static java.lang.String`|`getEndDateOfMonth(java.lang.String dat)`获取一个月的最后一天|
|`static java.lang.String`|`getHour()`得到现在小时 DateUtils.getHour() = 10|
|`static java.util.Date`|`getLastDate(long day)`提取一个月中的最后一天|
|`static java.lang.String`|`getMinute()`得到现在分钟|
|`static java.lang.String`|`getNowMonth(java.lang.String sdate)`形成如下的日历 ， 根据传入的一个时间返回一个结构 星期日 星期一 星期二 星期三 星期四 星期五 星期六 下面是当月的各个时间 此函数返回该日历第一行星期日所在的日期|
|`static java.lang.String`|`getSeqWeek()`产生周序列,即得到当前时间所在的年度是第几周|
|`static java.lang.String`|`getStringToday()`得到现在时间|
|`static java.util.Date`|`getSysDate()`取Java虚拟机系统时间, 返回当前Date|
|`static java.sql.Timestamp`|`getSysTimestamp()`取Java虚拟机系统时间, 返回当前时间戳|
|`static int[]`|`getTimeByCalendar(java.util.Date date)`时间转换为年月日时分秒 周|
|`static java.lang.String`|`getTimeByInterval(java.lang.String sj1,                 java.lang.String interval)`时间前推或后推分钟,其中interval表示分钟.|
|`static java.lang.String`|`getTimeShort()`获取时间 小时:分;秒 HH:mm:ss|
|`static java.lang.String`|`getTwoDayInterval(java.lang.String sj1,                 java.lang.String sj2)`得到二个日期间的间隔天数|
|`static java.lang.String`|`getTwoHourInterval(java.lang.String st1,                  java.lang.String st2)`二个小时时间间的差值,必须保证二个时间都是"HH:MM"的格式，返回字符型的分钟|
|`static java.lang.String`|`getWeek(java.lang.String sdate)`根据一个日期，返回是星期几的字符串|
|`static java.lang.String`|`getWeek(java.lang.String sdate,       java.lang.String num)`获得一个日期所在的周的星期几的日期，如要找出2002年2月3日所在周的星期一是几号|
|`static int`|`getWeekOfDate(java.util.Date date)`根据日期取出是星期几,数字|
|`static java.lang.String`|`getWeekStr(java.lang.String sdate)`获取当前时间对应的中午日期|
|`static java.lang.String`|`getWeekTextOfDate(java.util.Date date)`根据日期取出是星期几,中文|
|`static boolean`|`isBetweenDateByClosedInterval(java.util.Date date1,                             java.util.Date date2)`当前日期是否在指定区间日期范围内-- 闭区间|
|`static boolean`|`isBetweenDateByClosedInterval(java.lang.String sDate1,                             java.lang.String date2)`当前日期是否在指定区间日期范围内-- 闭区间|
|`static boolean`|`isBetweenDateByOpenInterval(java.util.Date date1,                           java.util.Date date2)`当前日期是否在指定区间日期范围内-- 开区间|
|`static boolean`|`isBetweenDateByOpenInterval(java.lang.String sDate1,                           java.lang.String date2)`当前日期是否在指定区间日期范围内-- 开区间|
|`static boolean`|`isDate(java.lang.String dateAsText)`判断字符串是否日期格式|
|`static boolean`|`isLeapYear(int year)`是否为闰年|
|`static boolean`|`isLeapYear(java.lang.String ddate)`判断是否润年|
|`static boolean`|`isSameWeekDates(java.util.Date date1,               java.util.Date date2)`判断二个时间是否在同一个周|
|`static boolean`|`isToday(java.util.Date date)`是否为当天|
|`static void`|`main(java.lang.String[] args)` |
|`static java.util.Date`|`minusDay(java.util.Date date,        int days)`计算日期减天数|
|`static java.util.Date`|`nextYear(java.util.Date date,        java.lang.Integer delay)`获取下delay个年|
|`static java.util.Date`|`now()`获取当前时间|
|`static java.util.Date`|`parse(java.lang.String date)`格式化日期为Date型(yyyy-MM-dd)|
|`static java.util.Date`|`parse(java.lang.String date,     java.lang.String formater)`根据指定日期格式格式化日期为Date型|
|`static boolean`|`rightDate(java.lang.String date)`如果时间字符串符合yyyy-MM-dd hh:mm:ss yyyy-MM-dd格式返回true|
|`static java.lang.String`|`toDateText(java.util.Date date)`将时间转换为 yyyy-MM-dd 格式的字符串|
|`static java.lang.String`|`toDateText(java.util.Date date,          java.lang.String pattern)`将时间转换为 pattern 格式的字符串|
|`static java.lang.String`|`toDateTime(java.util.Date date)`将时间转换为 yyyy-MM-dd HH:mm 格式的字符串|

- 
### 字段详细资料 ###

- 
#### DEFAULT_DATE_TIME_FORMAT ####

```
public static final java.lang.String DEFAULT_DATE_TIME_FORMAT
```

Default time format : yyyy-MM-dd HH:mm:ss

另请参阅:
:   常量字段值


- 
#### DATE_TIME_FORMAT ####

```
public static final java.lang.String DATE_TIME_FORMAT
```

Time format : yyyy-MM-dd HH:mm

另请参阅:
:   常量字段值


- 
#### TIME_FORMAT ####

```
public static final java.lang.String TIME_FORMAT
```

HH:mm

另请参阅:
:   常量字段值


- 
#### DATE_FORMAT ####

```
public static final java.lang.String DATE_FORMAT
```

Default date format yyyy-MM-dd

另请参阅:
:   常量字段值


- 
#### MONTH_FORMAT ####

```
public static final java.lang.String MONTH_FORMAT
```

Default month format yyyy-MM

另请参阅:
:   常量字段值


- 
#### DAY_FORMAT ####

```
public static final java.lang.String DAY_FORMAT
```

Default day format dd

另请参阅:
:   常量字段值


- 
#### DATE_PATTERN ####

```
public static final java.lang.String DATE_PATTERN
```

另请参阅:
:   常量字段值


- 
#### millionSecondsOfDay ####

```
public static long millionSecondsOfDay
```

一天中一共的毫秒数


- 
#### millionSecondsOfHour ####

```
public static long millionSecondsOfHour
```

一小时中一共得毫秒数

- 
### 构造器详细资料 ###

- 
#### DateUtils ####

```
public DateUtils()
```

- 
### 方法详细资料 ###

- 
#### isDate ####

```
public static boolean isDate(java.lang.String dateAsText)
```

判断字符串是否日期格式

参数:
:   `dateAsText` - 

返回:


- 
#### now ####

```
public static java.util.Date now()
```

获取当前时间

返回:
:   
```
DateUtils.now() = Thu Jul 12 10:58:12 CST 2018
```


- 
#### toDateText ####

```
public static java.lang.String toDateText(java.util.Date date)
```

将时间转换为 yyyy-MM-dd 格式的字符串

参数:
:   `date` - 

返回:


- 
#### toDateText ####

```
public static java.lang.String toDateText(java.util.Date date,
                                          java.lang.String pattern)
```

将时间转换为 pattern 格式的字符串

参数:
:   `date` - 

:   `pattern` - 

返回:


- 
#### getDate ####

```
public static java.util.Date getDate(java.lang.String dateText)
```

yyyy-MM-dd格式字符串转为Date

参数:
:   `dateText` - 

返回:


- 
#### getDate ####

```
public static java.util.Date getDate(java.lang.String dateText,
                                     java.lang.String pattern)
```

pattern格式字符串转为Date

参数:
:   `dateText` - 

:   `pattern` - 

返回:


- 
#### toDateTime ####

```
public static java.lang.String toDateTime(java.util.Date date)
```

将时间转换为 yyyy-MM-dd HH:mm 格式的字符串

参数:
:   `date` - 

返回:


- 
#### currentYear ####

```
public static int currentYear()
```

当前年份

返回:
:   Current year

```
DateUtils.currentYear() = 2018
```


- 
#### calendar ####

```
public static java.util.Calendar calendar()
```


- 
#### getTimeShort ####

```
public static java.lang.String getTimeShort()
```

获取时间 小时:分;秒 HH:mm:ss

返回:


- 
#### getLastDate ####

```
public static java.util.Date getLastDate(long day)
```

提取一个月中的最后一天

参数:
:   `day` - 

返回:


- 
#### getStringToday ####

```
public static java.lang.String getStringToday()
```

得到现在时间

返回:
:   字符串 yyyyMMdd HHmmss


- 
#### getHour ####

```
public static java.lang.String getHour()
```

得到现在小时

```
DateUtils.getHour() = 10
```


- 
#### getMinute ####

```
public static java.lang.String getMinute()
```

得到现在分钟

返回:
:   
```
DateUtils.getTime() = 58
```


- 
#### getTwoHourInterval ####

```
public static java.lang.String getTwoHourInterval(java.lang.String st1,
                                                  java.lang.String st2)
```

二个小时时间间的差值,必须保证二个时间都是"HH:MM"的格式，返回字符型的分钟


- 
#### getTwoDayInterval ####

```
public static java.lang.String getTwoDayInterval(java.lang.String sj1,
                                                 java.lang.String sj2)
```

得到二个日期间的间隔天数


- 
#### getTimeByInterval ####

```
public static java.lang.String getTimeByInterval(java.lang.String sj1,
                                                 java.lang.String interval)
```

时间前推或后推分钟,其中interval表示分钟.


- 
#### getDayByInterval ####

```
public static java.lang.String getDayByInterval(java.lang.String nowdate,
                                                java.lang.String delay)
```

得到一个时间延后或前移几天的时间,nowdate为时间,delay为前移或后延的天数

```
DateUtils.getNextDay("Thu Jul 12 10:58:12 CST 2018","2") = Mon Jul 16 10:58:12 CST 2018
```


- 
#### getDayByInterval ####

```
public static java.util.Date getDayByInterval(java.util.Date d,
                                              int delay)
```

得到一个时间延后或前移几天的时间,nowdate为时间,delay为前移或后延的天数


- 
#### isLeapYear ####

```
public static boolean isLeapYear(java.lang.String ddate)
```

判断是否润年

参数:
:   `ddate` - 

返回:


- 
#### nextYear ####

```
public static java.util.Date nextYear(java.util.Date date,
                                      java.lang.Integer delay)
```

获取下delay个年

参数:
:   `date` - 

:   `delay` - 

返回:


- 
#### getEndDateOfMonth ####

```
public static java.lang.String getEndDateOfMonth(java.lang.String dat)
```

获取一个月的最后一天

参数:
:   `dat` - 

返回:


- 
#### isSameWeekDates ####

```
public static boolean isSameWeekDates(java.util.Date date1,
                                      java.util.Date date2)
```

判断二个时间是否在同一个周

参数:
:   `date1` - 

:   `date2` - 

返回:


- 
#### getSeqWeek ####

```
public static java.lang.String getSeqWeek()
```

产生周序列,即得到当前时间所在的年度是第几周

返回:


- 
#### getWeek ####

```
public static java.lang.String getWeek(java.lang.String sdate,
                                       java.lang.String num)
```

获得一个日期所在的周的星期几的日期，如要找出2002年2月3日所在周的星期一是几号

参数:
:   `sdate` - 

:   `num` - 

返回:


- 
#### getWeek ####

```
public static java.lang.String getWeek(java.lang.String sdate)
```

根据一个日期，返回是星期几的字符串

参数:
:   `sdate` - 

返回:


- 
#### main ####

```
public static void main(java.lang.String[] args)
```


- 
#### getWeekStr ####

```
public static java.lang.String getWeekStr(java.lang.String sdate)
```

获取当前时间对应的中午日期

参数:
:   `sdate` - 

返回:


- 
#### getDays ####

```
public static long getDays(java.lang.String date1,
                           java.lang.String date2)
```

两个时间之间的天数

参数:
:   `date1` - 

:   `date2` - 

返回:


- 
#### getNowMonth ####

```
public static java.lang.String getNowMonth(java.lang.String sdate)
```

形成如下的日历 ， 根据传入的一个时间返回一个结构 星期日 星期一 星期二 星期三 星期四 星期五 星期六 下面是当月的各个时间
 此函数返回该日历第一行星期日所在的日期

参数:
:   `sdate` - 

返回:


- 
#### rightDate ####

```
public static boolean rightDate(java.lang.String date)
```

如果时间字符串符合yyyy-MM-dd hh:mm:ss yyyy-MM-dd格式返回true

参数:
:   `date` - 

返回:


- 
#### getDifferYear ####

```
public static int getDifferYear(java.util.Date date1,
                                java.util.Date date2)
```

得到两个日期之间相差的年数

参数:
:   `date1` - 

:   `date2` - 

返回:


- 
#### getDifferYear ####

```
public static int getDifferYear(java.lang.String date1,
                                java.lang.String date2)
```

得到两个日期之间相差的年数

参数:
:   `date1` - 

:   `date2` - 

返回:


- 
#### getDifferMonth ####

```
public static int getDifferMonth(java.util.Date date1,
                                 java.util.Date date2)
```

得到两个日期之间相差的月数

参数:
:   `date1` - 

:   `date2` - 

返回:


- 
#### getDifferMonth ####

```
public static int getDifferMonth(java.lang.String date1,
                                 java.lang.String date2)
```

得到两个日期之间相差的月数

参数:
:   `date1` - 

:   `date2` - 

返回:


- 
#### getDifferDay ####

```
public static int getDifferDay(java.lang.String date1,
                               java.lang.String date2)
```

得到两个日期之间相差的天数,两头不算,取出数据后，可以根据需要再加

参数:
:   `date1` - 

:   `date2` - 

返回:


- 
#### getDifferHourAndMinute ####

```
public static int[] getDifferHourAndMinute(java.lang.String date1,
                                           java.lang.String time1,
                                           java.lang.String date2,
                                           java.lang.String time2)
```

计算2个时间之间的相差的小时和分钟数，返回XX小时XX分 注意date1格式为yyyy-MM-dd 注意date2格式为yyyy-MM-dd
 注意time1格式为HH:mm 注意time2格式为HH:mm date1
参数:
:   `date1` - 

:   `time1` - 

:   `date2` - 

:   `time2` - 

返回:
:   resultHM[hours,mins]


- 
#### getDifferHourAndMinute ####

```
public static int[] getDifferHourAndMinute(java.util.Date date1,
                                           java.util.Date date2)
```

计算2个时间之间的相差的小时和分钟数，返回XX小时XX分 注意date1格式为yyyy-MM-dd HH:mm
 注意date2格式为yyyy-MM-dd HH:mm date1
参数:
:   `date1` - 

:   `date2` - 

返回:
:   resultHM[hours,mins]


- 
#### getDifferHourAndMinute ####

```
public static int[] getDifferHourAndMinute(java.lang.String date1,
                                           java.lang.String date2)
```

计算2个时间之间的相差的小时和分钟数，返回XX小时XX分 注意date1格式为yyyy-MM-dd HH:mm
 注意date2格式为yyyy-MM-dd HH:mm date1
参数:
:   `date1` - 

:   `date2` - 

返回:
:   resultHM[hours,mins]


- 
#### getDifferHour ####

```
public static int getDifferHour(java.util.Date date1,
                                java.util.Date date2)
```

计算2个时间之间的相差的小时数(Date,Date) date1
参数:
:   `Date` - date1

:   `Date` - date2

返回:


- 
#### getDifferHour ####

```
public static int getDifferHour(java.lang.String date1,
                                java.lang.String date2)
```

计算2个时间之间的相差的小时(String,String) date1
参数:
:   `String` - date1

:   `String` - date2

返回:


- 
#### getDifferMinute ####

```
public static int getDifferMinute(java.lang.String date1,
                                  java.lang.String date2)
```

返回两日期相差的分钟数[日期格式为: "yyyy-MM-dd HH:mm"]

参数:
:   `date1` - 

:   `date2` - 

返回:


- 
#### getDifferMinute ####

```
public static int getDifferMinute(java.util.Date date1,
                                  java.util.Date date2)
```

返回两日期相差的分钟数[日期格式为: "yyyy-MM-dd HH:mm"]

参数:
:   `date1` - 

:   `date2` - 

返回:


- 
#### addYear ####

```
public static java.util.Date addYear(java.util.Date date,
                                     int years)
```

计算日期加年

参数:
:   `date` - 

:   `months` - 

返回:


- 
#### addMonth ####

```
public static java.util.Date addMonth(java.util.Date date,
                                      int months)
```

计算日期加月数

参数:
:   `date` - 

:   `months` - 

返回:


- 
#### addDay ####

```
public static java.util.Date addDay(java.util.Date date,
                                    int days)
```

计算日期加天数

参数:
:   `date` - 

:   `days` - 

返回:


- 
#### minusDay ####

```
public static java.util.Date minusDay(java.util.Date date,
                                      int days)
```

计算日期减天数

参数:
:   `date` - 

:   `days` - 

返回:


- 
#### addMinutes ####

```
public static java.util.Date addMinutes(java.util.Date date,
                                        int minutes)
```

计算日期加分钟数

参数:
:   `date` - 

:   `minutes` - 

返回:


- 
#### addHour ####

```
public static java.util.Date addHour(java.util.Date date,
                                     int hour)
```

计算日期小时

参数:
:   `date` - 

:   `minutes` - 

返回:


- 
#### format ####

```
public static java.lang.String format(java.util.Date date)
```

格式化日期为String型(yyyy-MM-dd)

参数:
:   `date` - 

:   `formater` - 

返回:
:   
```
DateUtils.format("Thu Jul 12 10:58:12 CST 2018") = 2018-07-12
```


- 
#### format ####

```
public static java.lang.String format(java.util.Date date,
                                      java.lang.String formater)
```

根据指定日期格式格式化日期为String型

参数:
:   `date` - 

:   `formater` - 

返回:


- 
#### parse ####

```
public static java.util.Date parse(java.lang.String date)
```

格式化日期为Date型(yyyy-MM-dd)

参数:
:   `date` - 

:   `formater` - 

返回:


- 
#### parse ####

```
public static java.util.Date parse(java.lang.String date,
                                   java.lang.String formater)
```

根据指定日期格式格式化日期为Date型

参数:
:   `date` - 

:   `formater` - 

返回:


- 
#### getWeekOfDate ####

```
public static int getWeekOfDate(java.util.Date date)
```

根据日期取出是星期几,数字

参数:
:   `date` - 

返回:
:   int 返回1-7


- 
#### getWeekTextOfDate ####

```
public static java.lang.String getWeekTextOfDate(java.util.Date date)
```

根据日期取出是星期几,中文

参数:
:   `date` - 

返回:
:   int 返回1-7


- 
#### getCurrenDate ####

```
public static java.lang.String getCurrenDate()
```

得到当前的日期，格式为：yyyy-MM-dd

返回:
:   为一个字符串


- 
#### getCurrentTime ####

```
public static java.lang.String getCurrentTime()
```

得到当前的时间，精确到毫秒，格式为：yyyy-MM-dd hh:mm:ss

返回:
:   为一个字符串


- 
#### convertUtilDateToSQLDate ####

```
public static java.sql.Date convertUtilDateToSQLDate(java.util.Date date)
```

将java时间转为sql时间

参数:
:   `date` - 

返回:


- 
#### convertSQLDateToUtilDate ####

```
public static java.util.Date convertSQLDateToUtilDate(java.sql.Date date)
```

将sql时间转为java时间

参数:
:   `date` - 

返回:


- 
#### isLeapYear ####

```
public static boolean isLeapYear(int year)
```

是否为闰年

参数:
:   `year` - 

返回:


- 
#### isToday ####

```
public static boolean isToday(java.util.Date date)
```

是否为当天

参数:
:   `date` - 

返回:


- 
#### getSysTimestamp ####

```
public static java.sql.Timestamp getSysTimestamp()
```

取Java虚拟机系统时间, 返回当前时间戳

返回:
:   Timestamp类型的时间


- 
#### getSysDate ####

```
public static java.util.Date getSysDate()
```

取Java虚拟机系统时间, 返回当前Date

返回:
:   Date类型的时间


- 
#### isBetweenDateByClosedInterval ####

```
public static boolean isBetweenDateByClosedInterval(java.util.Date date1,
                                                    java.util.Date date2)
```

当前日期是否在指定区间日期范围内-- 闭区间

参数:
:   `date1` - Date类型

:   `date2` - Date类型

返回:


- 
#### isBetweenDateByOpenInterval ####

```
public static boolean isBetweenDateByOpenInterval(java.util.Date date1,
                                                  java.util.Date date2)
```

当前日期是否在指定区间日期范围内-- 开区间

参数:
:   `date1` - Date类型

:   `date2` - Date类型

返回:


- 
#### DateisBetweenDateByClosedInterval ####

```
public static boolean DateisBetweenDateByClosedInterval(java.util.Date curDate,
                                                        java.lang.String sDate1,
                                                        java.lang.String date2)
```

当前日期是否在指定区间日期范围内-- 闭区间

参数:
:   `sDate1` - String类型（格式为：yyyy-MM-dd）

:   `date2` - String类型（格式为：yyyy-MM-dd）

返回:


- 
#### DateisBetweenDateByOpenInterval ####

```
public static boolean DateisBetweenDateByOpenInterval(java.util.Date curDate,
                                                      java.lang.String sDate1,
                                                      java.lang.String date2)
```

当前日期是否在指定区间日期范围内-- 开区间

参数:
:   `sDate1` - String类型（格式为：yyyy-MM-dd）

:   `date2` - String类型（格式为：yyyy-MM-dd）

返回:


- 
#### isBetweenDateByClosedInterval ####

```
public static boolean isBetweenDateByClosedInterval(java.lang.String sDate1,
                                                    java.lang.String date2)
```

当前日期是否在指定区间日期范围内-- 闭区间

参数:
:   `sDate1` - String类型（格式为：yyyy-MM-dd）

:   `date2` - String类型（格式为：yyyy-MM-dd）

返回:


- 
#### isBetweenDateByOpenInterval ####

```
public static boolean isBetweenDateByOpenInterval(java.lang.String sDate1,
                                                  java.lang.String date2)
```

当前日期是否在指定区间日期范围内-- 开区间

参数:
:   `sDate1` - String类型（格式为：yyyy-MM-dd）

:   `date2` - String类型（格式为：yyyy-MM-dd）

返回:


- 
#### formatToEng ####

```
public static java.lang.String formatToEng(java.lang.String date)
```


- 
#### getCurrentTimeNum ####

```
public static java.lang.String getCurrentTimeNum()
```

得到当前的时间，精确到毫秒，格式为：yyyyMMddHHmmssSSS

返回:
:   为一个字符串


- 
#### getTimeByCalendar ####

```
public static int[] getTimeByCalendar(java.util.Date date)
```

时间转换为年月日时分秒 周

参数:
:   `date` - 

返回: