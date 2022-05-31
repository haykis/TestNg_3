package com.infoTech.pages.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertTest {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void googleArama(){
        driver.get("http:amazon.com");
        String baslik=driver.getTitle();
        System.out.println(baslik);
        SoftAssert softAssert=new SoftAssert(); //normal assert ten farki hatada durmuyor
//        Assert.assertEquals();
//        Assert.assertTrue();
//        Assert.assertFalse();
        softAssert.assertTrue(baslik.contains("Amazon"));
        softAssert.assertEquals("Amazon.com. Spend less. Smile more.",baslik);
        softAssert.assertFalse(baslik.contains("Car"));

        softAssert.assertAll(); //tumunu check eder
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
