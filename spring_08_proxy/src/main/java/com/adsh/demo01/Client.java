package com.adsh.demo01;

import org.junit.Test;

public class Client {
    @Test
    public void test(){
        //真实角色
        Host host = new Host();
        //代理角色现在没有
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
//        通过调用程序处理对象来处理我们要调用的接口对象
        proxyInvocationHandler.setRent(host);
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();//这里的proxy就是动态生成的

        proxy.rent();
    }
}
