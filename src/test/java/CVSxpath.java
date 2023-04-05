import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CVSxpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cvshealth.com/");



        driver.findElement(By.xpath("//a[@href=\"/news/long-term-care/how-sleep-impacts-our-physical-and-mental-health.html\"]")).click();





    }
}
