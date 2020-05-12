package com.qingxiaoguo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.Element;
import java.util.concurrent.TimeUnit;

public class seleniumTest {
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
    public void actionBrowser() throws InterruptedException {
        driver.get("https://www.hao123.com/");
        WebElement el1=driver.findElement(By.xpath("//*[@id=\"userCommonSites\"]/ul/li[4]"));
        WebElement el2=driver.findElement(By.xpath("//*[@id=\"search\"]/form/div[2]/input"));
        el2.sendKeys("123");
        Actions actions=new Actions(driver);
        actions.clickAndHold(el1).moveToElement(el2).release(el1).perform();

    }


}
