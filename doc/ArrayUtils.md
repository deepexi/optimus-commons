### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`static java.util.List<java.util.List<java.lang.String>>`|`descartes(java.util.List<java.util.List<java.lang.String>> dimValue)`循环实现未知纬度的笛卡尔积|
|`static boolean`|`isEmpty(java.lang.Object[] array)`检查数组是否为`null`或空数组`[]`。|
|`static java.lang.Integer[]`|`toArray(java.lang.String str)`将字符串str以,切割为数组返回|
|`static java.lang.Integer[]`|`toArray(java.lang.String str,       java.lang.String split)`将字符串str以split切割为数组返回|
|`static java.lang.String`|`toString(java.lang.Integer[] array)`将数组array以,拼接为字符串 |
|`static java.lang.String`|`toString(java.lang.Integer[] array,        java.lang.String split)`将数组array以split拼接为字符串 |


- 
### 方法详细资料 ###

- 
#### toString ####

```
public static java.lang.String toString(java.lang.Integer[] array)
```

将数组array以,拼接为字符串


```
	@Test
	public void toString1() {

		Integer[] array = {1,3,34,4};
		String string = ArrayUtils.toString(array);
		System.out.println(string);
	}
```

参数:
:   `array` - 

返回:


- 
#### toString ####

```
public static java.lang.String toString(java.lang.Integer[] array,
                                        java.lang.String split)
```

将数组array以split拼接为字符串


```
	@Test
	public void toString2() {

		Integer[] array = {1,3,34,4};
		String string = ArrayUtils.toString(array,"+");
		System.out.println(string);
	}
```

参数:
:   `array` - 

:   `split` - 

返回:


- 
#### toArray ####

```
public static java.lang.Integer[] toArray(java.lang.String str)
```

将字符串str以,切割为数组返回

```
	@Test
	public void toArray1() {
		System.out.println(ArrayUtils.toArray("1,3,34,4"));
	}
```

参数:
:   `str` - 

返回:


- 
#### toArray ####

```
public static java.lang.Integer[] toArray(java.lang.String str,
                                          java.lang.String split)
```

将字符串str以split切割为数组返回

```
	@Test
	public void toArray2() {
		System.out.println(ArrayUtils.toArray("1a3a4","a"));
	}
```

参数:
:   `str` - 

:   `split` - 

返回:


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


- 
#### descartes ####

```
public static java.util.List<java.util.List<java.lang.String>> descartes(java.util.List<java.util.List<java.lang.String>> dimValue)
```

循环实现未知纬度的笛卡尔积

```
	 @Test
	public  void descartes() {

		 List<List<String>> dimValue = new ArrayList<>();
		 
		 List<String> list1 = new ArrayList<>();
		 
		 List<String> list2 = new ArrayList<>();
		 
		 list1.add("a");
		 list1.add("b");
		 
		 list2.add("b");
		 list2.add("c");
		 
		 dimValue.add(list1);
		 dimValue.add(list2);
		 
		 System.out.println(ArrayUtils.descartes(dimValue));
		
	}
```

参数:
:   `dimValue` - 返回组合后的list

返回: