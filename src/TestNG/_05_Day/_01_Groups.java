package TestNG._05_Day;

import org.testng.annotations.Test;

public class _01_Groups {
    @Test(groups = "SmokeTest")
    void Test1(){
        System.out.println("Test 1 Smoke Test");
    }
    @Test(groups = "Regression")
    void Test3(){
        System.out.println("Test 3 Regression Test");
    }
    @Test(groups = "Regression")
    void Test5(){
        System.out.println("Test 5 Regression Test");
    }
    @Test(groups = "Regression")
    void Test2(){
        System.out.println("Test 2 Regression Test");
    }
    @Test(groups = "SmokeTest")
    void Test4(){
        System.out.println("Test 4 Smoke Test");
    }
    @Test(groups = "SmokeTest")
    void Test6(){
        System.out.println("Test 6 Smoke Test");
    }
    void Test7(){
        System.out.println("Test 7");
    }
}
