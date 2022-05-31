package com.infoTech.pages.Tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class fileDowland extends TestBase {
    @Test
    public void dosyaVarmiYokmu(){
        //bir dosyanin var olup olmadigini kontrol etmek icin

        //bulunan klasorun yolunu path ini verir
        System.out.println(System.getProperty("user.dir"));//C:\Users\Guest\workspace\InfoTechTestNg_3

        //kullanici ana klasorune ulasmak icin
        System.out.println(System.getProperty("user.home"));//C:\Users\Guest

        String kullanicidosyayolu=System.getProperty("user.dir");
        System.out.println("Kullanici dosya yolu= "+kullanicidosyayolu);//C:\Users\Guest\workspace\InfoTechTestNg_3

        String pomxmlDosyayolu=kullanicidosyayolu+"/pom.xml";
        System.out.println("en son "+pomxmlDosyayolu);
        boolean varmi=Files.exists(Paths.get(pomxmlDosyayolu));
       // boolean varmi= Files.exists(Paths.get("C:\\Users\\Guest\\workspace\\InfoTechTestNg_3/pom.xml"));
        System.out.println(varmi);
        Assert.assertTrue(varmi);
    }
    @Test
    public void dosyaUpload(){
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement dosyasecme=driver.findElement(By.id("file-upload"));

        dosyasecme.sendKeys("C:\\Users\\Guest\\Desktop\\GitHub\\github.jpg");
        WebElement uplade=driver.findElement(By.id("file-submit"));
        uplade.submit();
        WebElement fileupladeyazisi=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileupladeyazisi.isDisplayed());
    }
    @Test
    public void dosyaDowland() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/download");
        WebElement practise=driver.findElement(By.partialLinkText("practise.txt"));
       practise.click();
       Thread.sleep(3000);
        boolean varMI= Files.exists(Paths.get("C:\\Users\\Guest\\Downloads\\practise.txt"));
        System.out.println(varMI);
        Thread.sleep(1000);
        Assert.assertTrue(varMI);
    }

}
