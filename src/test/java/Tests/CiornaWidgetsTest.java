//package Tests;
//
//
//
//import Pages.Ciorne.CiornaAutoCompletePage;
//import Pages.Ciorne.CiornaWidgetsPage;
//import Pages.HomePage;
//import ShareData.ShareData;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//public class CiornaWidgetsTest extends ShareData {
//
//    //public WebDriver driver;
//
//    @Test
//
//    public void testare(){
//
//
//        //driver = new ChromeDriver();
//        //driver.get("https://demoqa.com/");
//        //driver.manage().window().maximize();
//
//        HomePage homePage = new HomePage(getDriver());
//        homePage.clickWidgets();
//
//        CiornaWidgetsPage ciornaWidgetsPage = new CiornaWidgetsPage(getDriver());
//        ciornaWidgetsPage.clickAutoComplete();
//
//        CiornaAutoCompletePage ciornaAutoCompletePage = new CiornaAutoCompletePage(getDriver());
//        String colorNamesValue = "Blue";
//        String singleColorNameValue = "Black";
//        ciornaAutoCompletePage.autoCompleteSingle(singleColorNameValue);
//        ciornaAutoCompletePage.autoCompleteMultiple(colorNamesValue);
//
//        //WebElement widgets = driver.findElement(By.xpath("//h5[text()='Widgets']"));
//        //widgets.click();
//        //JavascriptExecutor jse = (JavascriptExecutor) driver;
//        //jse.executeScript("window.scrollBy(0,350)");
//
//        //WebElement autoComplete = driver.findElement(By.xpath("//span[text()='Auto Complete']"));
//        //autoComplete.click();
//
//        //WebElement multipleColorNames = driver.findElement(By.id("autoCompleteMultipleInput"));
//        //multipleColorNames.sendKeys(colorNamesValue);
//       // multipleColorNames.sendKeys(Keys.ENTER);
//
//        //WebElement singleColorName = driver.findElement(By.id("autoCompleteSingleInput"));
//        //singleColorName.click();
//        //singleColorName.sendKeys(singleColorNameValue);
//        //singleColorName.sendKeys(Keys.ENTER);
//
//
//    }
//
//}
