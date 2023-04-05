import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cvshealth.com/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Leadership");
        WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
        a.click();
        a.sendKeys("Health Care and Wellness");
        a.clear();
        a.sendKeys("Prescription Drug Coverage");
        a.click();
    }
}
