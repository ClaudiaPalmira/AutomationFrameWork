package ShareData;

import Logger.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {

    //o clasa de baza in care poti sa salvezi informaii ce vor fi vizibile in tot proiectul

    private WebDriver driver;

//    @BeforeMethod  // se va executa ca o preconditie inaintea testului efectiv

    public void setUp (){

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoggerUtility.info("The browser was opened with success");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,450)");
    }


//    @AfterMethod  // post conditii - inchide driver-ul respectiv
    public void clear (){
        driver.quit();
        LoggerUtility.info("The browser was closed with success");

    }

    public WebDriver getDriver() {
        return driver;
    }
}
