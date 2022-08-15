package TestNG._01_Day;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    @Test
    void EqualOrnek(){
        String s1="merhaba";
        String s2="iyi aksamlar";
        Assert.assertEquals(s1,s2,"sonuc");

    }

    @Test
    void NotEqualOrnek(){
        String s1="merhaba";
        String s2="iyi aksamlar";
        Assert.assertNotEquals(s1,s2,"sonuc");

    }
     @Test
    void TrueOrnek(){
        int s1=55;
        int s2=55;
        Assert.assertTrue(s1==s2,"Result");
    }
}
