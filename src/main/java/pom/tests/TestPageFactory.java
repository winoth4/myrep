package pom.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.pages.FBHomePage;
import pom.pages.FBLoginPage;

import static helper.Helper.startBrowser;

public class TestPageFactory {
    WebDriver driver;

    FBHomePage homePage;

    @Test
    public void validateHomePage() {
        driver = startBrowser("https://www.facebook.com/", "chrome");
        FBLoginPage loginPage=new FBLoginPage(driver);
        loginPage.loginToFB("winoth4@yahoo.com", "imop4ever");
        homePage= PageFactory.initElements(driver,FBHomePage.class);
        Assert.assertTrue(homePage.getUserInHome().getText().equals("vinoth"),"Username invalid");
                //homePage.getUserInHome().getText().equals("vinoth"));
    }

}
