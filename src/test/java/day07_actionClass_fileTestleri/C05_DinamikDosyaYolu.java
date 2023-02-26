package day07_actionClass_fileTestleri;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import org.junit.Assert;
import org.junit.Test;

public class C05_DinamikDosyaYolu {
    public C05_DinamikDosyaYolu() {
    }

    @Test
    public void test01() {
        String dosyaYolu = System.getProperty("user.home") + "/Desktop/Thedelta.docx";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu), new LinkOption[0]));
    }
}
