import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CareMark {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.caremark.com/");

        driver.findElement(By.xpath("//nav[@class=\"megamenu__navigation megamenu--secondary \"]")).click();
        Thread.sleep(3000);
        driver.close();


    }
}

