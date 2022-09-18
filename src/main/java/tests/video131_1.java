package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class video131_1 {
    @AfterTest
    public void webLogIn(){
        System.out.println("VIDEO131_1: Web");
    }

    @BeforeTest
    public void mobileLogIn(){
        System.out.println("VIDEO131_1: Mobile login --- BEFORE TEST");
    }

    @Test
    public void mobileloginAPI(){
        System.out.println("VIDEO131_1: MobileloginAPI");
    }
}
