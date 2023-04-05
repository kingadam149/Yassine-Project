import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage {

        @FindBy(xpath = "//span[@class=\"account-text centered\"]")
        WebElement signInButton;

        @FindBy(css = "[class=\"cart-icon sc-cvs-header-basket\"]")
        WebElement emptyCart;
        String text;

    String textSignInButton() {
            String Text = signInButton.getText();
            return text;
        }

    public boolean emptyCart() {

        return true;
    }
    String Cart() {
        String Text = emptyCart.getText();
        return text;
    }


}

