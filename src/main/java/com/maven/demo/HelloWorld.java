package com.maven.demo;

/**
 * Created by yinhao on 17/7/27.
 */
public class HelloWorld {

    public String sayHello(){
        return "Hello Maven";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());
    }
}
