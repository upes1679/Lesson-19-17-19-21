package com.class_loaders;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        Animal a=new Animal();
        //Class c2=a.getClass();
        System.out.println(Animal.class.getClassLoader());
        //ClassLoader cl=Animal.class.getClassLoader();
        Class c=Animal.class;
        //System.out.println(c.getName());
        System.out.println(ArrayList.class.getClassLoader());
        //Bootstrap class loader- $JAVA_HOME/jre/lib
        //Extension class loaders- $JAVA_HOME/jre/lib/ext
        //System class loaders- It loads files found in the classpath environment variable, classes that we wrote
    }
}
