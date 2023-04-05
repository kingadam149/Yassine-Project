import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.cvshealth.com/");

            WebElement Impact = driver.findElement(By.xpath("//li[@class=\"nav__primary--item active\"]"));
            org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
            actions.moveToElement(Impact).perform();
            actions.contextClick();

        }
    }


