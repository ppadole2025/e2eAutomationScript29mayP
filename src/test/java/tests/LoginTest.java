package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void verifyLogin() {

        LoginPage lp = new LoginPage(driver);

        lp.login("test@gmail.com", "test123");
    }
    @Test(priority = 2)
    public void verifyLogin2() {

        LoginPage lp = new LoginPage(driver);

        lp.login("test@gmail.com", "test1234");
    }
    @Test(priority = 3)
    public void verifyLogin3() {

        LoginPage lp = new LoginPage(driver);

        lp.login("test@gmail.com", "test12345");
    }

}