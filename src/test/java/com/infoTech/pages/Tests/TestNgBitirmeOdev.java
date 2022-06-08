package com.infoTech.pages.Tests;

import com.infoTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgBitirmeOdev  {
    @Test
    public void test() throws InterruptedException{
        Driver.getDriver().get("https://demo.guru99.com/insurance/v1/index.php");
        Thread.sleep(2000);
        Driver.driver.switchTo().frame(6);
        WebElement cerezler=Driver.driver.findElement(By.xpath("//*[.='Tümünü Kabul Et']"));
        cerezler.click();
        WebElement register=Driver.driver.findElement(By.partialLinkText("Register"));
        register.click();
        WebElement dropDown=Driver.driver.findElement(By.id("user_title"));
        Select select=new Select(dropDown);
        select.selectByVisibleText("General");
        WebElement firstname=Driver.driver.findElement(By.id("user_firstname"));
        firstname.sendKeys("huseyin");
        WebElement surname=Driver.driver.findElement(By.id("user_surname"));
        surname.sendKeys("kahraman");
        WebElement phone=Driver.driver.findElement(By.id("user_phone"));
        phone.sendKeys("05456730265");
        WebElement dropDown2=Driver.driver.findElement(By.id("user_dateofbirth_1i"));
        Select select2=new Select(dropDown2);
        select2.selectByValue("1989");
        WebElement dropDown3=Driver.driver.findElement(By.id("user_dateofbirth_2i"));
        Select select3=new Select(dropDown3);
        select3.selectByValue("11");
        WebElement dropDown4=Driver.driver.findElement(By.id("user_dateofbirth_3i"));
        Select select4=new Select(dropDown4);
        select4.selectByValue("3");
        WebElement pro=Driver.driver.findElement(By.xpath("//input[@value='Provisional']"));
        pro.click();
        WebElement licence=Driver.driver.findElement(By.id("user_licenceperiod"));
        Select select5=new Select(licence);
        select5.selectByValue("2");
        WebElement occu=Driver.driver.findElement(By.id("user_occupation_id"));
        Select select6=new Select(occu);
        select6.selectByValue("6");
        WebElement street=Driver.driver.findElement(By.id("user_address_attributes_street"));
        street.sendKeys("Ataturk cad.");
        WebElement city=Driver.driver.findElement(By.id("user_address_attributes_city"));
        city.sendKeys("Ankara");
        WebElement country=Driver.driver.findElement(By.id("user_address_attributes_county"));
        country.sendKeys("Turkiye");
        WebElement post=Driver.driver.findElement(By.id("user_address_attributes_postcode"));
        post.sendKeys("5642FM");
        WebElement email=Driver.driver.findElement(By.id("user_user_detail_attributes_email"));
        email.sendKeys("haykis25@gmail.com");
        Actions actions=new Actions(Driver.driver);
       WebElement password=Driver.driver.findElement(By.id("user_user_detail_attributes_password"));
       actions.moveToElement(password).click().keyDown(Keys.SHIFT).sendKeys("e").keyUp(Keys.SHIFT).sendKeys("kim963").perform();
       WebElement passwordtekrar=Driver.driver.findElement(By.id("user_user_detail_attributes_password_confirmation"));
       passwordtekrar.sendKeys("Ekim963");
       WebElement create=Driver.driver.findElement(By.xpath("//input[@value='Create']"));
       create.click();

    }
}

