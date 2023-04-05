import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CVSotherweb {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cvshealth.com");

        driver.findElement(By.xpath("//ul[@class=\"enpr--topLinksSection left\"]/li[1]/a[1]")).click();
        Thread.sleep(3000);
        driver.close();


    }
}
