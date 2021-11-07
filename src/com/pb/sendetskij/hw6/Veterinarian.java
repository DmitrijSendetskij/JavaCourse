package com.pb.sendetskij.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Veterinarian {
    public Object animal;

    public static void treatAnimal(Animal animal) throws Exception{
        Class An = Class.forName("com.pb.sendetskij.hw6.Animal");
        Constructor constr = An.getConstructor();
        Object obj = constr.newInstance();
        if(obj instanceof Animal){
            ((Animal) obj).eat();
            ((Animal) obj).location();
        }
    }
}
