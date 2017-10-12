package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {
    public static WebDriver getDriver(String url, String driverStr) {
        WebDriver driver=null;
        switch (driverStr) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\clodera\\self\\chromedriver_win32\\chromedriver.exe");
                driver= new ChromeDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver startBrowser(String url, String browser) {
        BowserInit browserInit = Helper::getDriver;
        return browserInit.startBrowser(url, browser);
    }
}
