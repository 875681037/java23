package com.kaishengit.com.kaishengit.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 875681037 on 2017/7/10.
 */
public class ComputerInvocationHandler implements InvocationHandler{

    private Object target;
    public ComputerInvocationHandler(Object object){
        this.target=object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("加价");
       Object result = method.invoke(target,args);
        System.out.println("减价");
        return result;
    }
}
