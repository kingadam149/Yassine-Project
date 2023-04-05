import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PrescriptionTest extends Setup{

        HomePage home;

        @BeforeMethod
        void setUpTest() {
            setupDriver("https://www.cvs.com/");
            home = PageFactory.initElements(driver, HomePage.class);
        }
        @AfterMethod
        void closeBrowser() throws InterruptedException {
            quitBrowser();
        }
        @Test
        void testPrescription(){
            String actualText = home.Prescription.getText();

        }
    }

