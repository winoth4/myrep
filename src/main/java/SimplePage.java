import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class SimplePage {
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\clodera\\self\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.com/");
        driver.manage().window().maximize();
        WebElement toIndia=driver.findElement(By.xpath("//*[@id=\"go\"]"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"go\"]")).getText());
        toIndia.click();


        driver.quit();
    }

}
