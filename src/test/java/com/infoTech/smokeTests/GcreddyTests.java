package com.infoTech.smokeTests;

import com.infoTech.pages.GcreddyPage;
import com.infoTech.utilities.ConfigurationReader;
import com.infoTech.utilities.TestBase;
import org.testng.annotations.Test;

public class GcreddyTests extends TestBase {
    @Test
    public void giris() throws InterruptedException{
        driver.get(ConfigurationReader.getProperty("grcreddy_link"));
        GcreddyPage page=new GcreddyPage(driver);
        Thread.sleep(2000);
        page.grcreddy_userName
        .sendKeys(ConfigurationReader.getProperty("gcreddy_userName"));

        page.grcreddy_password
        .sendKeys(ConfigurationReader.getProperty("gcreddy_passWord"));
        page.grcreddy_login.click();

    }
}
