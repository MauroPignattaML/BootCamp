package com.mauropignatta.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SorterFactory {

    public static Object getInstance(String objName) {
        try {
            Class<?> clazz = Class.forName(objName);
            Constructor<?> ctor = clazz.getConstructor();
            return ctor.newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
