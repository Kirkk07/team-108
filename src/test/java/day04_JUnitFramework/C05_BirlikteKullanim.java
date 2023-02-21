package day04_JUnitFramework;

import org.junit.*;

public class C05_BirlikteKullanim {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass calisti\n=======");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("=========\n After class calisti");
    }

    @Before
    public void before(){
        System.out.println("\n Before Methodu calisti");
    }
    @After public void after(){
        System.out.println("After Methodu Calisti");
    }
    @Test
    public void test01(){
        System.out.println("Test 01 calisti");
    }
    @Test
    public void test02(){
        System.out.println("Test 02 calisti");
    }
    @Test
    public void test03(){
        System.out.println("Test 03 calisti");
    }
}
