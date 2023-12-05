package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public WindowMethods windowMethods;
    public AlertMethods alertMethods;

    public BasePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        windowMethods= new WindowMethods(driver);
        alertMethods = new AlertMethods(driver);

    }
}
