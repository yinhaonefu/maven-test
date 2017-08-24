package com.maven.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yinhao on 17/8/22.
 */
public class HelloWorldTest {
    @Test
    public void sayHelloTest(){
        HelloWorld helloWorld = new HelloWorld();
        String s = helloWorld.sayHello();
        Assert.assertEquals("Hello Maven",s);
    }
}
