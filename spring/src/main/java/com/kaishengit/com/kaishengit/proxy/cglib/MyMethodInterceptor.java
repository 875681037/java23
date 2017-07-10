package com.kaishengit.com.kaishengit.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by 875681037 on 2017/7/10.
 */
public class MyMethodInterceptor implements MethodInterceptor {




    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("移动1");
        Object result=methodProxy.invokeSuper(o,objects);
        return result;
    }
}
