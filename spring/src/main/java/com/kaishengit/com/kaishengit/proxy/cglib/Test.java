package com.kaishengit.com.kaishengit.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by 875681037 on 2017/7/10.
 */
public class Test {
    public static  void  maikn(String[] args){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Mouse.class);
        enhancer.setCallback(new MyMethodInterceptor());
        Mouse mouse=(Mouse)enhancer.create();
        mouse.move();

    }


}
