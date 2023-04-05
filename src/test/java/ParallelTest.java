import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class ParallelTest {

    public WebDriver driver;

    @Test
    public void FirefoxTest() {
        driver = new FirefoxDriver();
        driver.get("https://www.cvshealth.com/");

        driver.findElement(By.xpath("//button[@id=\"uuid4b8a475f-83cb-4eaa-8e07-cc35f6462777\"]")).click();
        driver.quit();
    }

    @Test
    public void ChromeTest() {
        driver = new ChromeDriver();
        driver.get("https://www.cvshealth.com/");

        driver.findElement(By.xpath("//button[@id=\"uuid4b8a475f-83cb-4eaa-8e07-cc35f6462777\"]")).click();
        driver.quit();

    }
}


