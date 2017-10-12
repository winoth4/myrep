package helper;

import org.openqa.selenium.WebDriver;

@FunctionalInterface
public interface BowserInit {
    public WebDriver startBrowser(String url, String browserName);
}
