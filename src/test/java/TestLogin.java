import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends Setup{

    HomePage testLogin;


    @BeforeMethod
    void openBrowser() {
        setupDriver("https://www.cvs.com/");
        testLogin = PageFactory.initElements(driver, HomePage.class);
    }

    @AfterMethod
    void close() throws InterruptedException {
        quitBrowser();
    }

        @Test
        public void testLogin() {
            SignInPage signInPage;
            signInPage = new SignInPage(driver);
            SignInPage homePage = signInPage;

    }


}
