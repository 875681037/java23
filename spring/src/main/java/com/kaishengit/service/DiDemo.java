package com.kaishengit.service;

import com.kaishengit.dao.UserDao;

import java.util.*;

/**
 * Created by 875681037 on 2017/7/7.
 */
public class DiDemo {
    private double score;
    private  String name;
    private List<String> nameList;
    private Set<String> setName;
    private Map<String,UserDao> userMap;
    private Properties config;

    public void show(){


   System.out.println("score"+score);
   System.out.println("name"+name);
        for(String n :nameList){
            System.out.println("nameList"+n);
        }
    for(String n:setName){
            System.out.println("setName"+n);

    }
    for(Map.Entry<String,UserDao> entry:userMap.entrySet()){
        System.out.println(entry.getKey()+">"+entry.getValue());
    }
        Enumeration keys = config.propertyNames();
        while(keys.hasMoreElements()){
            String key = (String) keys.nextElement();
            String value = config.getProperty(key);
            System.out.println(key + "==>" + value);

        }




    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public Set<String> getSetName() {
        return setName;
    }

    public void setSetName(Set<String> setName) {
        this.setName = setName;
    }

    public Map<String, UserDao> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, UserDao> userMap) {
        this.userMap = userMap;
    }

    public Properties getConfig() {
        return config;
    }

    public void setConfig(Properties config) {
        this.config = config;
    }
}
