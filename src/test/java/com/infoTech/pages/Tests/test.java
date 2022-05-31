package com.infoTech.pages.Tests;

import com.infoTech.utilities.Driver;
import org.testng.annotations.Test;

public class test {

    @Test
    public void test(){
        Driver.getDriver().get("http://google.com");
        Driver.getDriver().get("http://amazon.com");
        Driver.getDriver().getTitle();
    }
}
