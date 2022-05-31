package com.infoTech.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    //Java,Microsoft office programlarini okuyamiyor.
    //Apache POI yeni bir kutuphane projemize ekliyecegiz
    //Workbook=> excel dosyamiza Workbook diyiyoruz
    //worksheet => acilan her excel sekmesi icin
    //Row => her satira Row diyiyoruz
    //Cell  ==> her verinin oldugu bolume yani hucreye verilen ad.
    @Test
    public void test() throws IOException {
        //dosya yolu olusturdum
        String dosyaYolu="src/test/resources/ULKELER.xlsx";
        //Acmak istedigimiz dosyaya ulastik
        FileInputStream file = new FileInputStream(dosyaYolu);
        //workbook dosyasini  okumaya baslayacagiz
        Workbook workbook= WorkbookFactory.create(file);
        //1.sayafaya gidiyoruz(index 0'dan baslar)
        Sheet sheet = workbook.getSheetAt(0);
        //1.satira gidelim(index 0;dan basliyor
        Row row =sheet.getRow(0);
        //1.Hucreyi alalim(index 0'dan basliyor
        Cell ulkeler=row.getCell(0);
        System.out.println(ulkeler);
        Cell baskentler=row.getCell(1);
        System.out.println(baskentler);
        Cell neyiMeshur= row.getCell(2);
        System.out.println(neyiMeshur);
        System.out.println("===========================================");
        //EXCElL'e git => sheet "0",3.indexteki satira git =>1.index'teki Hucre
        System.out.println(workbook.getSheetAt(0).getRow(3).getCell(1));
        //sheet =>0,satir =>7,hucre 2
        System.out.println(workbook.getSheetAt(0).getRow(7).getCell(2));
        //sheet ->0,satir ->10,hucre ->1
        System.out.println(workbook.getSheetAt(0).getRow(10).getCell(1));
        System.out.println("==============================================");
        //Son satir numarasini almak icin
        //tum satirlarin size'ini alacagiz,arada bosluk olsa dahi
        int satirSayis=workbook.getSheetAt(0).getLastRowNum()+1;
        System.out.println("Satir sayisi => "+satirSayis);
        System.out.println("========================================");
        //dolu olan satirlari almak icin
        int doluSatirSayis=workbook.getSheetAt(0).getPhysicalNumberOfRows();
        System.out.println("Dolu Satir sayisi => "+doluSatirSayis);
        System.out.println("======================================");
        //tum ulkeleri yazdirmak icin
        int sonsatirIndexi=workbook.getSheetAt(0).getLastRowNum();
        for(int i=0;  i<=sonsatirIndexi;  i++){
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));
        }
        System.out.println("===========================================================");
        //tum baskentleri almak icin
        for(int j=0;j<=sonsatirIndexi;j++){
            System.out.println(workbook.getSheetAt(0).getRow(j).getCell(1));
        }
        //bir satirin son index'ini alma
        //index 1'den basliyor
        int sonSutunIndex=workbook.getSheetAt(0).getRow(0).getFirstCellNum();
        for(int k=0; k<=sonSutunIndex;k++){
            System.out.println("4.satir "+k+".sutun => "+workbook.getSheetAt(0).getRow(5).getCell(k));
            //eger koseli dortgen icine alirsak bosluklarida satir olarak algilar
        }
    }
}