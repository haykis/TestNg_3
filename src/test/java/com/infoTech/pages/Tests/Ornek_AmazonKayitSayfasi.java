package com.infoTech.pages.Tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ornek_AmazonKayitSayfasi extends TestBase {
    @Test
    public void odev1() throws InterruptedException {
        driver.get("http:amazon.com");
        String amazontitle = driver.getTitle();
        System.out.println(amazontitle);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(amazontitle.contains("Amazon.com. Spend less. Smile more."));

        WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(sign).perform();
        Thread.sleep(1000);
        WebElement starhere = driver.findElement(By.xpath("//a[@class='nav-a']"));
        actions.moveToElement(starhere).perform();
        actions.doubleClick(starhere).perform();
        String ikinciTitle = driver.getTitle();
        System.out.println("ikinci title " + ikinciTitle);
        softAssert.assertEquals(ikinciTitle,"Amazon.com. Spend less. Smile more.");
    }

    @Test(dependsOnMethods = "odev1")
    public void odev2() throws InterruptedException {
        WebElement yourname=driver.findElement(By.id("ap_customer_name"));

        yourname.sendKeys("huseyin");
        WebElement email=driver.findElement(By.id("ap_email"));

        email.sendKeys("h.aykis@gmail.com");
        WebElement password=driver.findElement(By.id("ap_password"));

        password.sendKeys("Kalem25698");
        WebElement reenter=driver.findElement(By.id("ap_password_check"));
        reenter.sendKeys("Kalem25698");
        WebElement contin=driver.findElement(By.id("continue"));
        contin.click();
        String sontitle=driver.getTitle();
        System.out.println("son title "+sontitle);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(sontitle,"Authentication required");

    }
}