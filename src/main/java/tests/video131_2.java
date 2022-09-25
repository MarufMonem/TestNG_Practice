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

    @Parameters({"URL1", "APIkey"})
    @Test
    public void BmobileLogInHome(String urlValue, String apiVal){
        System.out.println(urlValue + "----" + apiVal);
        System.out.println("VIDEO131_2: B");
    }

    @Test(dataProvider = "getData")
    public void CloginAPIHome(String username, String password){
        System.out.println(username + " ---------- " + password);
        System.out.println("VIDEO131_2: C");
    }

    @Test(dependsOnMethods = {"EbeforeSuite", "CloginAPIHome"})
    public void DbeforeSuite(){
        System.out.println("VIDEO131_2: D");
    }

    @Test(timeOut = 4000)
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
//        Assert.fail();
//    }

    @DataProvider
    public Object[][] getData(){
        //First combi with username and password
        //2nd combi with username and password

        Object[][] data = new Object[3][2]; //2 cols 3 rows
        data[0][0] = "Sam";
        data[0][1] = "Sam321";

        data[1][0] = "Samir";
        data[1][1] = "765823";

        data[2][0] = "Maruf";
        data[2][1] = "QA321";

        return data;
    }

}
