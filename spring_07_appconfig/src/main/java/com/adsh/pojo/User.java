package com.adsh.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//这里这个注解的意思，就是说这个类被spring接管了，注册到了容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("adsh")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
