## 常用依赖
```xml
<dependencies>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.23</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
        </dependency>
    </dependencies>
```
## Spring配置文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <!--    指定要扫描的包，这个包下的注解就会生效-->
<!--    <context:component-scan base-package="com.adsh.pojo"/>-->
    <!--    开启注解支持-->
    <context:annotation-config/>
  

</beans>
```
## 注解说明
- @Autowired: 自动装配通过类型。名宇
   如果Autowired不能唯一自动裝配上属性，则需要通过@Qualifier(value="xxx")解决
- @Nullable
  字段标记了这个注解，说明这个字段可以为nul1;
- @Resource: 自动装配通过名字。类型


- pojo [@Component]: 组件，放在类上，说明被Spring管理了，也就是bean
- dao [@Repository]
- service [@Service]
- controller [@Controller]
- 这四个注解功能都是一样的，都是代表将某个类注册到Spring中，装配Bean


- 作用域: @Scope("singleton")
## xml 与注解：
- xml更加万能，适用于任何场合！维护简单方便
- 注解 不是自己类使用不了，维护相对复杂！
