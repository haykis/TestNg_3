package com.infoTech.Tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandleTest extends TestBase {
    @Test
    public void WindowsHandle() throws InterruptedException{
       driver.get("https://the-internet.herokuapp.com/windows");
       //sayfanin handle ni aldik
       String handle= driver.getWindowHandle();
        System.out.println(handle);
        driver.findElement(By.partialLinkText("Click Here")).click();
        //tum sayfalarin handle'ni aliyoruz
        Set<String> tumelementler=driver.getWindowHandles();
        for(String w:tumelementler){
            System.out.println(w);
        }
        //once array'e ceviriyoruz
        Object[] array=(Object[]) tumelementler.toArray();
        String sonsayfahandle=array[array.length-1].toString();
        System.out.println("son sayfa handle "+sonsayfahandle);
        Thread.sleep(2000);
        driver.switchTo().window(handle);
        //? driver.switchTo().window("CDwindow-20FB594D3F6DD988229F5E7159D183E3");
        // olmamasinin sebebi her defasinda otomatik degisiyor
    }
}
