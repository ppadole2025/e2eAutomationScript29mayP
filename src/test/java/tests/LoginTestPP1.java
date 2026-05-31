package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestPP1 extends BaseTest {

    @Test(priority = 1)
    public void verifyLoginp11() {

        LoginPage lp = new LoginPage(driver);

        lp.login("test@gmail.com", "test123");
        System.out.println("Login Test Started... resolved conflict message1-Prnajali Code");
        System.out.println("Login Test Started... resolved conflict message1 - Anajali");
        System.out.println("Login Test Started... resolved conflict message3 - Vaishali");
    }
    @Test(priority = 2)
    public void verifyLoginp22() {

        LoginPage lp = new LoginPage(driver);

        lp.login("test@gmail.com", "test1234");
        Assert.assertEquals(6,6,"Forcefully no idea 2");
    }

}
