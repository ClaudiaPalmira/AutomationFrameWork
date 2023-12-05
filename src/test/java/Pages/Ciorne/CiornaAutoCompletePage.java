package Pages.Ciorne;

import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CiornaAutoCompletePage extends ShareData {
    public WebDriver driver;
    public CiornaAutoCompletePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "autoCompleteMultipleInput")
    private WebElement multipleColorNames;

    @FindBy(id = "autoCompleteSingleInput")
    private WebElement singleColorName;


    public void autoCompleteMultiple(String colorNamesValue){
        multipleColorNames.sendKeys(colorNamesValue);
        multipleColorNames.sendKeys(Keys.ENTER);
    }

    public void autoCompleteSingle(String singleColorNameValue){
        singleColorName.sendKeys(singleColorNameValue);
        singleColorName.sendKeys(Keys.ENTER);
    }
}
