package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class video131_2 {

//    public void beforeMethod(){
//        System.out.println("I execute before every method in the test class");
//    }
    @Test
    public void AwebLogInHome(){
        System.out.println("VIDEO131_2: A");
    }

    @Test
    public void BmobileLogInHome(){
        System.out.println("VIDEO131_2: B");
    }

    @Test
    public void CloginAPIHome(){
        System.out.println("VIDEO131_2: C");
    }

    @Test(dependsOnMethods = {"EbeforeSuite", "CloginAPIHome"})
    public void DbeforeSuite(){
        System.out.println("VIDEO131_2: D");
    }

    @Test
    public void EbeforeSuite(){
        System.out.println("VIDEO131_2: E");
    }

    @Test(enabled = false)
    public void FafterClass(){
        System.out.println("VIDEO131_2: F");
    }

    @Test(groups = {"Smoke"})
    public void Ggrouping1(){
        System.out.println("VIDEO131_2: G");
    }

//    @Test
//    public void boundToFail(){
//        Assert.assertTrue(false);
//    }

}
