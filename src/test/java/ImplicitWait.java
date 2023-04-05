import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.cvs.com/");

            driver.findElement(By.xpath("/html/body/app-root/app-homepage/main/cvs-bcc[1]/div/div/div[1]/div[1]/div/a[1]/div/span")).click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.findElement(By.xpath("/html/body/app-root/app-side-nav/div/div[2]/div/app-home/main/app-essential-services/div/div/div/a")).click();

            driver.close();

        }

}
