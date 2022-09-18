package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class video131_2 {
    @Test
    public void webLogInHome(){
        System.out.println("VIDEO131_2: WebLogIn Home");
    }

    @Test
    public void mobileLogInHome(){
        System.out.println("VIDEO131_2: mobileLogIn Home");
    }

    @AfterTest
    public void loginAPIHome(){
        System.out.println("VIDEO131_2: loginAPI Home ---- AfterTest");
    }
}
