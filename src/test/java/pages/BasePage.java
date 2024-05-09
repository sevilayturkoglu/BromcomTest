package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {
    protected BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


}
