package com.kaishengit.com.kaishengit.proxy.jdk;

import com.kaishengit.com.kaishengit.proxy.Computer;
import com.kaishengit.com.kaishengit.proxy.Dell;

import java.lang.reflect.Proxy;

/**
 * Created by 875681037 on 2017/7/10.
 */
public class Test {
   public static void main(String[] args){
       Dell dell = new Dell();
    ComputerInvocationHandler invocationHandler = new ComputerInvocationHandler(dell);

       Computer computer=(Computer)Proxy.newProxyInstance(dell.getClass().getClassLoader(),dell.getClass().getInterfaces(),invocationHandler);
       computer.sales();


   }
}
