package com.example.demo.processordDemo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }

    public void test(){
        System.out.println("the test method!");
    }

    public static void main(String[] args) {
        InvocationHandler handler = new ProxyDemo();
        ProxyDemo o = (ProxyDemo)Proxy.newProxyInstance(ProxyDemo.class.getClassLoader(), null, handler);
        o.test();

    }
}
