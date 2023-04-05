public class LoginTest extends Setup {

        public static void main(String[] args) throws InterruptedException {

            HomePage home = new HomePage(driver);

            Login login = new Login(driver);

            home.clickLogin();

            login.enterUsername("Your Username");
            login.enterPassword("Your Password");

            login.clickLogin();
            Thread.sleep(3000);


        }


}
