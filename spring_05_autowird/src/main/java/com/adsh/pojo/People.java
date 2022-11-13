package com.adsh.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
//都是用来自动装配的，都可以放在属性字段上
//@ Autowired 通过byType的方式实现，而且必须要求这个对象存在！【常用】
//@Resource 默认通过byname的方式实现，如果找不到名字，则通过byType实现！如果两个都找不到的情況下，就报错！【常用】
//执行顺序不同：@ Autowired 通过byType的方式实现。@ Resource 默认通过byname的方式实现。
public class People {
//    @Autowired一般用在set和属性上
//    使用@Autowired可以不要set方法

    @Autowired
    @Qualifier(value = "cat11")
    private Cat cat;
//  @Resource先找id在找class，还可以指定名字
//    @Resource
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
    @Autowired
    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
