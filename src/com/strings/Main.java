package com.strings;

public class Main {
    public static void main(String[] args) {
        String str="Hello world";
        String str2=new String("Hello world");
        String str3=new String(new char[]{'H','e','l','l','o'});
        System.out.println(str3);
        System.out.println("----------------------------------");
        String s="String";
        String s2="String";
        s="another string";
        System.out.println(s);
        System.out.println(s2);
        s=s.concat("!");
        System.out.println(s);
    }
}
