package com.adsh.config;

import com.adsh.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //这个类被spring接管了，注册到了容器中，它本质也是一个@Component
//@Configuration代表这是一个配置类，就是之前的beans.xml
@ComponentScan("com.adsh.pojo")
@Import(AdshConfig2.class)
public class AdshConfig {
    //注册一个bean，就相当于之前的bean标签
    //这个方法的名字==bean的id属性
    //这个方法的返回值==bean的class属性
    @Bean
    public User getUser(){
        return new User();//返回要注入的bean的对象
    }
}
