package com.infoTech.Tests;

import com.infoTech.pages.GooglePage;
import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase {
    @Test
    public void aramaTesti(){
        driver.get("https:google.com");
        GooglePage page=new GooglePage(driver);
        page.guvenlikDuvari.click();
        page.aramaKutusu.sendKeys("selamlar");

    }

}
