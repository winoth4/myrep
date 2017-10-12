package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBHomePage {
    WebDriver fbHomeDriver;

    public FBHomePage(WebDriver fbHomeDriver) {
        this.fbHomeDriver = fbHomeDriver;
    }
    @FindBy(xpath = "//*[@id=\"u_0_b\"]/div[1]/div[1]/div/a/span/span")
    WebElement userInHome;

    @FindBy(how=How.XPATH,using = "//*[@id=\"navItem_1612464931\"]/a/div")
    WebElement userName;

    public WebElement getUserInHome() {
        return userInHome;
    }

    public void setUserName(WebElement userName) {
        this.userName = userName;
    }
}
