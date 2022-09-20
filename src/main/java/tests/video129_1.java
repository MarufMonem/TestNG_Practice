package tests;

import org.testng.annotations.AfterSuite;
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

    @AfterSuite
    public void afterSuite(){
        System.out.println("VIDEO129_1: After Suite");
    }

    @Test(groups = {"Smoke"})
    public void grouping3(){
        System.out.println("Grouping TCs -- video129_2");
    }
}