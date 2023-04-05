import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeTest extends Setup {

    HomePage home;

    @BeforeMethod
    void setUpTest() {
        setupDriver("https://www.cvshealth.com/");
        home = PageFactory.initElements(driver, HomePage.class);
    }
    @AfterMethod
    void closeBrowser() throws InterruptedException {
        quitBrowser();
    }
    @Test
    void testAbout(){
        String actualText = home.About.getText();
        Assert.assertEquals(actualText,"About");

    }


}
