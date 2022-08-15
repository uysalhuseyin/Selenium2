package TestNG._01_Day;

import Utils.BaseStaticDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _04_Enable extends BaseStaticDriver {
     @Test
    void test1(){
        System.out.println("test 1");
    }
    @Test(enabled = false)
    void test2(){
        System.out.println("test 2");
    }
    @Test
    void test3(){
        System.out.println("test 3");
    }
    @BeforeClass
    void Start(){
        System.out.println("Driver start...");
    }

     @Test
    void End(){
        System.out.println("Driver end...");
    }

}
