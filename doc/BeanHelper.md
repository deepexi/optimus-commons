

对象copy工具类


## BeanHelper


### com.deepexi.util.BeanHelper
（不支持复杂类型，比如枚举等，性能好）


#### 方法列表


	
#### 简单使用

```
class User{
     String name;


    String sex;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }


}


//开始使用
User orig=new User();
orig.setName("orig");
orig.setSex("male");
User dest1=BeanHelper.mapPartOverriderV2(orig,User.class);
//dest1={"name":"orig","sex":"male"};


User orig2=new User();
orig2.setName("orig2");
orig2.setSex(null);
User dest2=new User();
dest2.setName("dest2");
dest2.setSex("male2");
BeanHelper.mapPartOverriderV2(orig2,dest2);
//dest2={"name":"orig2","sex":"male2"};




BeanHelper.mapCompleteOverriderV2(orig2,dest2);
//dest2={"name":"orig2","sex":null};
```






