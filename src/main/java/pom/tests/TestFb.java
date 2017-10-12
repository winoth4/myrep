package pom.tests;

import helper.BowserInit;
import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pom.pages.FBLoginPage;

import static helper.Helper.getDriver;
import static helper.Helper.startBrowser;

public class TestFb {
    WebDriver driver;
    FBLoginPage loginPage;

    @Test
    public void testFBLogin() {
        driver=startBrowser("https://www.facebook.com/", "chrome");
        loginPage = new FBLoginPage(driver);
        loginPage.loginToFB("winoth4@yahoo.com", "imop4ever");
        System.out.println(driver.getCurrentUrl());
        // driver.quit();
    }
}
