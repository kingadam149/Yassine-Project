import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    static WebDriver driver;

    void setupDriver(String url){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);

        driver.manage().window().maximize();
    }

    void quitBrowser() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }
}
