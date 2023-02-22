package day07_actionClass_fileTestleri;

import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath extends TestBase{
    @Test
    public void Test(){
        String filePath= "C:/Users/hasan/Desktop/aa.txt";
          boolean result= Files.exists(Paths.get(filePath));
        System.out.println(result);
    }
}
