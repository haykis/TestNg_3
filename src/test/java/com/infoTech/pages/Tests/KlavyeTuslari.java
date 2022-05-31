package com.infoTech.pages.Tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KlavyeTuslari extends TestBase {
    @Test
    public void asagiYukari(){
        driver.get("https:amazon.com");
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();//yeterli gelmezse
        actions.sendKeys(Keys.END).perform();//sayfanin en altina gider
        actions.sendKeys(Keys.PAGE_UP).perform();//yukariya gider
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys(Keys.ARROW_LEFT).perform();
    }
    @Test
    public void kucukBuyukYazma() {
        driver.get("https:google.com");
        WebElement guvenlik = driver.findElement(By.xpath("//*[.='Kabul ediyorum']"));
        guvenlik.click();
        WebElement arama = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        //Mause'ile arama kutusuna tikladim
        actions.moveToElement(arama).click()
                .keyDown(Keys.SHIFT).sendKeys("meRhabA")  //shift tusuna bastim ve yazimi gonderdim
                .keyUp(Keys.SHIFT).sendKeys("  nasilsiniz") //shift tusundan elimi kaldirdim ve yazimi gonderdim
                .perform();

    }

}
