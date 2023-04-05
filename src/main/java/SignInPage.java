import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage{


    public boolean getMessageText;
    protected WebDriver driver;

    private By usernameBy = By.name("user_name");
    private By passwordBy = By.name("password");
    private By signinBy = By.name("sign_in");

    public SignInPage(WebDriver driver){
        this.driver = driver;
        if (driver.getTitle().equals("Sign In Page")) {
            throw new IllegalStateException("This is not Sign In Page," +
                    " current page is: " + driver.getCurrentUrl());
        }
    }

    public HomePage loginValidUser(String userName, String password) {
        driver.findElement(usernameBy).sendKeys(userName);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(signinBy).click();
        return new HomePage(driver);

        }

}

