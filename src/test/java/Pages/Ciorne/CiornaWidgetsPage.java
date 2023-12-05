package Pages.Ciorne;

import ShareData.ShareData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CiornaWidgetsPage extends ShareData {

    public WebDriver driver;
    public CiornaWidgetsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Auto Complete']")
    private WebElement autoComplete;

    public void clickAutoComplete(){
        autoComplete.click();
    }
}
