package Pages.Forms;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage extends BasePage {
    public FormsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceElement;

    public void clickPracticeForm(){
        practiceElement.click();
        LoggerUtility.info("The user clicks on practiceElement button");
    }

}
