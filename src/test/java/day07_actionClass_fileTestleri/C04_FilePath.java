package day07_actionClass_fileTestleri;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import org.junit.Test;

public class C04_FilePath {
    public C04_FilePath() {
    }

    @Test
    public void test01() {
        String dosyaYolu = "/Users/ahmetbulutluoz/Desktop/Thedelta.docx";
        boolean sonuc = Files.exists(Paths.get(dosyaYolu), new LinkOption[0]);
        System.out.println(sonuc);
        System.out.println(System.getProperty("user.home"));
        dosyaYolu = "/Users/ahmetbulutluoz/Desktop/Thedelta.docx";
        dosyaYolu = System.getProperty("user.home") + "/Desktop/Thedelta.docx";
        System.out.println(System.getProperty("user.dir"));
    }
}

