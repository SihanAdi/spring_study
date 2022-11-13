package com.adsh.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object targrt;

    public void setRent(Object rent) {
        this.targrt = rent;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), targrt.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        //动态代理的本质就是通过反射实现
        Object result = method.invoke(targrt, args);
        return result;
    }
    public void log(String msg){
        System.out.println("加载了"+msg+"方法");
    }
}
