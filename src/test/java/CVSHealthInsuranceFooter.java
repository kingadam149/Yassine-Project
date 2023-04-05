import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CVSHealthInsuranceFooter {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cvshealth.com/");

        WebElement HealthInsurance = driver.findElement(By.xpath("/html/body/div[2]/div/footer/div/div[1]/div[2]/div[2]/div/div[2]/div/ul/li[4]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(HealthInsurance).perform();
        String text = HealthInsurance.getText();
        System.out.println(text);
    }
}
