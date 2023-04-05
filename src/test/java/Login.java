import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login{

    public Login(WebDriver driver) {

    }

    public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.cvs.com/");

            driver.findElement(By.id("login")).click();
            driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
            driver.findElement(By.id("password")).sendKeys("Password@123");
            driver.findElement(By.id("login")).click();
            System.out.println("The page title is : " +driver.findElement(By.xpath("//*[@id=\"app\"]//div[@class=\"main-header\"]")).getText());
            driver.findElement(By.id("submit")).click();

            driver.quit();
        }

    public void enterUsername(String s) {

    }

    public void enterPassword(String s) {

    }

    public void clickLogin() {

    }
}

