package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLoginPage {
    WebDriver fbDiver;

    public FBLoginPage(WebDriver fbDiver) {
        this.fbDiver = fbDiver;
    }

    By userName=By.xpath("//*[@id=\"email\"]");
    By passwordEle=By.xpath("//*[@id=\"pass\"]");

    public void loginToFB(String email,String password){
        fbDiver.findElement(userName).sendKeys(email);
        fbDiver.findElement(passwordEle).sendKeys(password);

        fbDiver.findElement(By.id("loginbutton")).click();


    }
}
