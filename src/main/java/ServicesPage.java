import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicesPage {

    @FindBy(xpath ="//*[@id=\"uuid2e50f128-69c7-4b85-8f4b-a6adc89c96d6\"]")
    WebElement Services;

    String Services() {
        return String.valueOf(Services);
    }
    @FindBy(css = "[id=\"uuide0d359eb-b2db-41fc-b871-d04c2a741291\"]")
    WebElement Impact;

    String Impact() {
        return String.valueOf(Impact);
    }

}
