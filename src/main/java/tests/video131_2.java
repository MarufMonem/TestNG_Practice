package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class video131_2 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I execute before every method in the test class");
    }
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

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite -- video131_2");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class -- video131_2");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class -- video131_2");
    }

    @Test(groups = {"Smoke"})
    public void grouping1(){
        System.out.println("Grouping TCs -- video131_2");
    }

//    @Test
//    public void boundToFail(){
//        Assert.assertTrue(false);
//    }

}
