package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class BromcomHomePage extends BasePage {

    public WebElement getHeaders(String text) {
        return Driver.get().findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    public void isVisible(List<String> headers) {
        for (String title : headers) {
            assertTrue("Headers is visible, but it should not be.", getHeaders(title).isDisplayed());
        }
    }
}
