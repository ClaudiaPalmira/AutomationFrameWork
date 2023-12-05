package HelpMethods;

import Pages.BasePage;
import ShareData.ShareData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FrameMethods {
    private WebDriver driver;

    public FrameMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void interractFirstIFrame(){

        driver.switchTo().frame("frame1");
        System.out.println(frameText.getText());
        driver.switchTo().defaultContent();
    }

}
