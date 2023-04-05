import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class ServicesTest extends Setup {

        HomePage service;

        @BeforeMethod
        void openBrowser() {
            setupDriver("https://www.cvshealth.com/services.html");
            service = PageFactory.initElements(driver, HomePage.class);
        }

        @AfterMethod
        void close() throws InterruptedException {
            quitBrowser();
        }

        @Test
        void testServicesPage() {
            String actualText;
        }
        @Test
        void impact() {
            String actualText;
        }
    }

