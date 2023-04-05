import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class HomePage {


    public boolean getMessageText;
    @FindBy(xpath ="//*[@class=\"primary__btn\"] ")
    WebElement About;

    public void clickAbout() {
        About.click();
    }

    public TextComponent Prescription;


    public HomePage(WebDriver driver) {

    }


    public void getMessageText() {
    }

    public void clickLogin() {
    }
}