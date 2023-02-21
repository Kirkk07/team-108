package day04_JUnitFramework;

import org.junit.Assert;
import org.junit.Test;

public class C06_Assertions {
    //JUnit testlerin passed yada failed olduguna
    //Kodlarin calisirken sorun olusup olusmamsina gore karar girer.
    String str1="Ali";
    String str2="ali";
    @Test
    public void test01(){
        //Str1'in str2'ye Esit oldugunu test edin.
        Assert.assertEquals("karsilastirlan degerler Farkli",str1,str2);
        //        if (str1.equals(str2)){
        //            System.out.println("Esitlik testi passed");
        //        }else {
        //            System.out.println("Esitlik Testi Failed");
        //        }

    }
    @Test
    public void test02(){
        // Str1'in "A" harfi icerdigini test Edin
        Assert.assertTrue("STR1 Istenen harfi iceriyor",str1.contains("A"));
        //        if (str1.contains("A")){
        //            System.out.println("Olumlu testi passed");
        //        }else {
        //            System.out.println("Olumlu Testi Failed");
        //        }

    }

    @Test
    public void test03(){
        //Str2'nin C Harfi Icermedigini test edin.
        Assert.assertFalse("Istenen harf icermiyor",str2.contains("c"));
        //        if (!str1.contains("C")){
        //            System.out.println("Negatif testi passed");
        //        }else {
        //            System.out.println("Negatif Testi Failed");
        //        }

    }
}
