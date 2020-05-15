package com.qingxiaoguo;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGit {

    @Test
    public void zhushi1(){
        System.out.println("这是@Test1注释");
    }
    @Test
    public void zhushi2(){
        System.out.println("这是@Test2注释");
    }
    @BeforeTest
    public void zhushi3(){
        System.out.println("这是@BeforeTest1注释");
    }
    @AfterTest
    public void zhushi4(){
        System.out.println("这是@AfterTest注释");
    }

}
