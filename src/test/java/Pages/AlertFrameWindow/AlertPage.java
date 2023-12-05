package Pages.AlertFrameWindow;

import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "alertButton")
    private WebElement alertaOkButton;

    @FindBy(id = "timerAlertButton")
    private WebElement alertDelayButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    @FindBy(id = "promtButton")
    private WebElement promtButton;

    public void interractAlertOK(){

        alertaOkButton.click();
        alertMethods.acceptAlert();
//        Alert alertok = driver.switchTo().alert();
//        alertok.accept();
    }

    public void interractAlertDelay(){

        alertDelayButton.click();
        alertMethods.acceptAlert();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alertDelay = driver.switchTo().alert();
//        alertDelay.accept();
    }

    public void interractAlertDismiss(){

        confirmButton.click();
        alertMethods.cancelAlert();
//        Alert alertConfirmation = driver.switchTo().alert();
//        alertConfirmation.dismiss();
    }

    public void interractAlertValue(String value){

        promtButton.click();
        alertMethods.fillAlert(value);
//        Alert alertPromt = driver.switchTo().alert();  //facem switchul pe alerta
//        alertPromt.sendKeys(value);
//        alertPromt.accept();
    }
}
