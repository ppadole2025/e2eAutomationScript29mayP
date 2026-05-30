package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestPP extends BaseTest {

    @Test(priority = 1)
    public void verifyLoginp1() {

        LoginPage lp = new LoginPage(driver);

        lp.login("test@gmail.com", "test123");
    }
    @Test(priority = 2)
    public void verifyLoginp2() {

        LoginPage lp = new LoginPage(driver);

        lp.login("test@gmail.com", "test1234");
        Assert.assertEquals(6,6,"Forcefully fail");
    }
    @Test(priority = 3)
    public void verifyLoginp3() {

        LoginPage lp = new LoginPage(driver);

        lp.login("test@gmail.com", "test12345");
    }

}