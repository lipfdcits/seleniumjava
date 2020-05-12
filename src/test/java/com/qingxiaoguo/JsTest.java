package com.qingxiaoguo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JsTest {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closedBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void Js() throws InterruptedException {
        driver.get("https://www.baidu.com");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.getElementById(\"kw\").setAttribute(\"maxlength\",\"1000\");");
        Thread.sleep(5000);
    }
}
