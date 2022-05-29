package com.infoTech.Tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JsAlert extends TestBase {
    @Test
    public void jsAlert() throws InterruptedException{
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       WebElement button=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
       button.click();

       String alertMesaji=driver.switchTo().alert().getText();
        System.out.println(alertMesaji);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }
    @Test
    public void jsConfirm() throws InterruptedException{
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement confirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        confirm.click();
        String mesaj=driver.switchTo().alert().getText();
        System.out.println(mesaj);
        driver.switchTo().alert().dismiss();
    }
    @Test
    public void jSConfirmSend() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement Prompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        Prompt.click();
//        String mesaj = driver.switchTo().alert().getText();
//        System.out.println(mesaj);
//        Thread.sleep(3000);

        driver.switchTo().alert().sendKeys("Merhaba TestNG");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
}
