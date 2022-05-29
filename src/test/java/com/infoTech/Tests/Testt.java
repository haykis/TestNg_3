package com.infoTech.Tests;

import com.infoTech.utilities.TestBase;
import org.testng.annotations.Test;

public class Testt extends TestBase {
    @Test
    public void googleArama(){
        driver.get("http:google.com");
    }
}
