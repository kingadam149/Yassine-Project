import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdiver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        WebElement dropDown = driver.findElement(By.id("gh-cat"));
        Select select = new Select(dropDown);

        select = new Select(driver.findElement(By.id("searchDropdownBox")));
        select.selectByVisibleText("Books");
        Thread.sleep(3000);
        select.selectByIndex(6);
        Thread.sleep(2000);
        select.selectByValue("search-alias=stripbooks");

        for(int i = 1; i <= 10; i++){
            select.selectByIndex(i);
            Thread.sleep(1500);
        }
    }
}