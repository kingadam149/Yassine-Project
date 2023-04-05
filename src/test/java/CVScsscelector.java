import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CVScsscelector {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cvshealth.com/");

        driver.findElement(By.cssSelector("[href=\"/news/pharmacy/how-our-pharmacists-support-patients-fasting-for-ramadan.html\"]")).click();
    }
}
