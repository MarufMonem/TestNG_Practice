package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class video129_1 {
    @Test
    public void Ademo129(){
        System.out.println("129 A  hello --- AfterTest");
    }
    @Test
    public void Bdemo129(){
        System.out.println("129 B  World");
    }

    @Test
    public void CafterSuite129(){
        System.out.println("129 C  VIDEO129_1: After Suite");
    }

    @Test
    public void Dgrouping129(){
        System.out.println("129 D  Grouping TCs -- video129_2");
    }
}