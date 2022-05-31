package com.infoTech.pages.Tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable extends TestBase {
    public  void giris(){
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        WebElement guvenlikDuvari= driver.findElement(By.xpath("//*[.='Consent']"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        guvenlikDuvari.click();
    }
    @Test
    public void table() throws InterruptedException {
        giris();
        Thread.sleep(3000);
        //tbody kismindaki verileri almak icin kullaniyoruz
        WebElement tbody=driver.findElement(By.xpath("//tbody"));
        System.out.println(tbody.getText());
        System.out.println("=================================================");
        //Tum basliklari almak icin
        List<WebElement> baslik=driver.findElements(By.xpath("//thead/tr/th"));
        for(WebElement basliklar:baslik){
            System.out.println(basliklar.getText());
        }
    }
    @Test
    public void tumSatirlari() throws InterruptedException{
        giris();
        Thread.sleep(2000);
        List<WebElement> tumSatirlar=driver.findElements(By.xpath("//tbody/tr"));
        for(WebElement satirlar:tumSatirlar){
            System.out.println(satirlar.getText());
        }
    }
    @Test
    public void tumHucreler() throws InterruptedException{
        giris();
        Thread.sleep(2000);
        List<WebElement> tumHucreler=driver.findElements(By.xpath("//tbody/tr/td"));
        for(WebElement hucreler:tumHucreler){
            System.out.println(hucreler.getText());
        }
        /*
        "//" ile "/" slash arasindaki fark
        -Eger tek slash "/" eklerseniz basamk basamk gideriz.o webelementin childe manasina gelir
            ornek://tbody/tr[2]/td[3]
        -eger cift "//" slash eklerseniz ,bu childe olabilir onun torunu,yada torununun torunu.
            ornek: //tbody//td[3]
         */
    }
    @Test
    public void tumSutun() throws InterruptedException {
        giris();
        Thread.sleep(3000);
        List<WebElement> tumSutun=driver.findElements(By.xpath("//tbody/td[3]"));
        for(WebElement sutun:tumSutun){
            System.out.println(sutun.getText());
        }
        /*
        thead  => Table head =? tablonun en ust kismi
        tbody  => table body => tablonun govde kismi
        tr => table row => tablodaki satir
        td=> table data => tablodaki veri
*/
    }
    public void hucreYazdir(int satir,int sutun){
        String xpathDegerim="//tbody/tr["+satir+"]/td["+sutun+"]";
        //tbody/tr[  6  ]/td[  5  ]
        WebElement hucre=driver.findElement(By.xpath(xpathDegerim));
        System.out.println(hucre.getText());
    }
    @Test
    public void calistir() throws InterruptedException {
        giris();
        Thread.sleep(3000);
        hucreYazdir(5,1);
        hucreYazdir(9,2);
        hucreYazdir(12,4);
    }
    @Test
    public void ornek() throws InterruptedException {
        List<WebElement> tumSatirlar=driver.findElements(By.xpath("//tbody/tr"));
        System.out.println("tabloda "+tumSatirlar.size()+" satir vardir");

        WebElement ucuncusatir=driver.findElement(By.xpath("//tbody/tr[3]"));
        System.out.println("ucuncu satir "+ucuncusatir.getText());

    }


}
