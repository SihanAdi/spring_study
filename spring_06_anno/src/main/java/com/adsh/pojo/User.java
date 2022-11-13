package com.adsh.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//等价于<bean id="user" class="com.adsh.pojo.User"/>
@Component
@Scope("singleton")
public class User {
//    相当于<property name="name" value="ad"/>
    @Value("ad")
    public String name;
    //    相当于<property name="name" value="ad"/>
    @Value("ad")
    public void setName(String name) {
        this.name = name;
    }
}
