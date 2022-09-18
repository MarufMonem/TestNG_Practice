package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class video129_1 {
    @AfterTest
    public void demo(){
        System.out.println("hello --- AfterTest");
    }
    @Test
    public void demo2(){
        System.out.println("World");
    }
}