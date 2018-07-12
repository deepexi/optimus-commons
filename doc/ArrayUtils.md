### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`static java.util.List<java.util.List<java.lang.String>>`|`descartes(java.util.List<java.util.List<java.lang.String>> dimValue)`循环实现未知纬度的笛卡尔积|
|`static boolean`|`isEmpty(java.lang.Object[] array)`检查数组是否为`null`或空数组`[]`。|
|`static java.lang.Integer[]`|`toArray(java.lang.String str)` |
|`static java.lang.String`|`toString(java.lang.Integer[] array)` |




### 方法详细资料 ###

- 
#### toString ####

```
public static java.lang.String toString(java.lang.Integer[] array)
```


- 
#### toArray ####

```
public static java.lang.Integer[] toArray(java.lang.String str)
```


- 
#### isEmpty ####

```
public static boolean isEmpty(java.lang.Object[] array)
```

检查数组是否为`null`或空数组`[]`。


```

 ArrayUtil.isEmpty(null)              = true
 ArrayUtil.isEmpty(new int[0])        = true
 ArrayUtil.isEmpty(new int[10])       = false
 
```

参数:
:   `array` - 要检查的数组

返回:
:   如果为空, 则返回`true`
```

```

- 
#### descartes ####

```
public static java.util.List<java.util.List<java.lang.String>> descartes(java.util.List<java.util.List<java.lang.String>> dimValue)
```

循环实现未知纬度的笛卡尔积

参数:
:   `dimValue` - 返回组合后的list

返回:
```

```