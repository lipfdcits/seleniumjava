package com.qingxiaoguo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class phantomjsTest {
    @Test
    public void phantomjs(){
        System.setProperty("phantomjs.binary.path","D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
        WebDriver driver=new PhantomJSDriver();
        driver.get("https://www.baidu.com");
        String a= driver.getTitle();
        System.out.println(a);
    }
}
