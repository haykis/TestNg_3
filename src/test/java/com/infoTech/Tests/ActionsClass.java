package com.infoTech.Tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends TestBase {
    @Test
    public void sagTiklama() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement element= driver.findElement(By.id("hot-spot"));
        //Actions nesnesi olusturuyoruz
        Actions actions=new Actions(driver);
        //Actions class ile islem yapariz,her seferinde "PERFORM() kullanmak zorundasiniz
        Thread.sleep(3000);
        actions.contextClick(element).perform();
    }
    @Test
    public void ciftTiklama() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement guvenlikDuvar=driver.findElement(By.xpath("//*[.='Consent']"));
        Thread.sleep(3000);
        guvenlikDuvar.click();
        Actions actions=new Actions(driver);
        WebElement ciftTikla= driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        actions.doubleClick(ciftTikla).perform();
    }
    @Test
    public void mouse() throws InterruptedException {
        driver.get("http://amazon.com");
        Thread.sleep(1000);
        Actions actions=new Actions(driver);
        WebElement sign= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Thread.sleep(1000);
       actions.moveToElement(sign).perform();
    }
}
