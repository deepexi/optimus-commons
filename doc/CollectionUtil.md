### 方法概要 ###

所有方法  
|限定符和类型|方法和说明|
|--------|--------|
|`static <V> java.util.List<V>`|`convertList(java.util.List<java.util.List<V>> list)`将List>转为List|
|`static <E> java.util.ArrayList<E>`|`createArrayList()`创建`ArrayList`实例|
|`static <E> java.util.ArrayList<E>`|`createArrayList(int initialCapacity)`创建`ArrayList`实例|
|`static <K,V> java.util.HashMap<K,V>`|`createHashMap()`创建`HashMap`实例|
|`static <K,V> java.util.HashMap<K,V>`|`createHashMap(int initialCapacity)`创建`HashMap`实例|
|`static <K,V> java.util.HashMap<K,V>`|`createHashMap(int initialCapacity,             float loadFactor)`创建`HashMap`实例|
|`static boolean`|`isEmpty(java.util.Collection<?> collection)`判断`Collection`是否为`null`或空数组`[]`。|
|`static boolean`|`isEmpty(java.util.Map<?,?> map)`判断`Map`是否为`null`或空`{}`|
|`static boolean`|`isNotEmpty(java.util.Collection<?> collection)`判断Collection是否不为`null`和空数组`[]`。|
|`static boolean`|`isNotEmpty(java.util.Map<?,?> map)`判断Map是否不为`null`和空`{}`|


### 方法详细资料 ###

- 
#### isEmpty ####

```
public static boolean isEmpty(java.util.Map<?,?> map)
```

判断`Map`是否为`null`或空`{}`

参数:
:   `map` - ## @see Map

返回:
:   如果为空, 则返回`true`


- 
#### isNotEmpty ####

```
public static boolean isNotEmpty(java.util.Map<?,?> map)
```

判断Map是否不为`null`和空`{}`

参数:
:   `map` - ## @see Map

返回:
:   如果不为空, 则返回`true`


- 
#### isEmpty ####

```
public static boolean isEmpty(java.util.Collection<?> collection)
```

判断`Collection`是否为`null`或空数组`[]`。

参数:
:   `collection` - 

返回:
:   如果为空, 则返回`true`

另请参阅:
:   `Collection`


- 
#### isNotEmpty ####

```
public static boolean isNotEmpty(java.util.Collection<?> collection)
```

判断Collection是否不为`null`和空数组`[]`。

参数:
:   `collection` - 

返回:
:   如果不为空, 则返回`true`


- 
#### createArrayList ####

```
public static <E> java.util.ArrayList<E> createArrayList()
```

创建`ArrayList`实例

类型参数:
:   `E` - 

返回:
:   `ArrayList`实例


- 
#### createArrayList ####

```
public static <E> java.util.ArrayList<E> createArrayList(int initialCapacity)
```

创建`ArrayList`实例

类型参数:
:   `E` - 

参数:
:   `initialCapacity` - 初始化容量

返回:
:   `ArrayList`实例


- 
#### createHashMap ####

```
public static <K,V> java.util.HashMap<K,V> createHashMap()
```

创建`HashMap`实例

类型参数:
:   `K` - 

:   `V` - 

返回:
:   `HashMap`实例


- 
#### createHashMap ####

```
public static <K,V> java.util.HashMap<K,V> createHashMap(int initialCapacity)
```

创建`HashMap`实例

类型参数:
:   `K` - 

:   `V` - 

参数:
:   `initialCapacity` - 初始化容量

返回:
:   `HashMap`实例


- 
#### createHashMap ####

```
public static <K,V> java.util.HashMap<K,V> createHashMap(int initialCapacity,
                                                         float loadFactor)
```

创建`HashMap`实例

类型参数:
:   `K` - 

:   `V` - 

参数:
:   `initialCapacity` - 初始化容量

:   `loadFactor` - 加载因子

返回:
:   `HashMap`实例


- 
#### convertList ####

```
public static <V> java.util.List<V> convertList(java.util.List<java.util.List<V>> list)
```

将List>转为List

参数:
:   `list` - 

返回: