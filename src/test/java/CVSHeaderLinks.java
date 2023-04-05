import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CVSHeaderLinks extends Setup{

    CVSHeaderLinks home;

    @FindBy(xpath = "//div[@class=\"enpr__navigation--container container\"]")
    static
    WebElement headerLinks;


    WebElement[] header() {
        ArrayList<String> links = new ArrayList<>();
        WebElement[] headerLinks = new WebElement[0];
        for (WebElement a : headerLinks) {
            links.add(a.getText());
        }
        return headerLinks;
    }

    @Test
    void testHeaderLinks(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("About");
        expected.add("Services");
        expected.add("News");
        expected.add("impact");
        expected.add("Health Care Redefined");
        expected.add("Women's Health");
        expected.add("Search");
        
        System.out.println(expected);

        WebElement[] actual = home.headerText();
        Assert.assertEquals(actual, expected);
    }

    private WebElement[] headerText() {
        return header();
    }
;
}
