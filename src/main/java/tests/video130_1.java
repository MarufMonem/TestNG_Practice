package tests;

import org.testng.annotations.Test;

public class video130_1 {
    @Test
    public void demo(){
        System.out.println("Hello from video 130");
    }

    @Test(groups = {"Smoke"})
    public void grouping1(){
        System.out.println("Grouping TCs -- video130_1");
    }
}
