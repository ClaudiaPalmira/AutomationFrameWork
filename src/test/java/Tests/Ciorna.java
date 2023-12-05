//package Tests;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import java.io.File;
//
//public class Ciorna {
//
//    public WebDriver driver;
//
//    @Test
//
//    public void testmethod(){
//
//        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//
//        WebElement elements = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,350)");
//        elements.click();
//
//        WebElement practiceform = driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        practiceform.click();
//
//        WebElement firstname = driver.findElement(By.id("firstName"));
//        String firstnamevalue = "Claudia";
//        firstname.sendKeys(firstnamevalue);
//
//
//        WebElement lastname = driver.findElement(By.id("lastName"));
//        String lastnamevalue = "Gologan";
//        lastname.sendKeys(lastnamevalue);
//
//
//        WebElement email = driver.findElement(By.id("userEmail"));
//        String emailvalue = "gggg@gmail.ro";
//        email.sendKeys(emailvalue);
//
//        WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        gender.click();
//
//
//        WebElement mobilenumber = driver.findElement(By.id("userNumber"));
//        String mobilenumbervalue = "0744400555";
//        mobilenumber.sendKeys(mobilenumbervalue);
//
//        WebElement subjects = driver.findElement(By.id("subjectsInput"));
//        String subjectsvalue = "English";
//        subjects.sendKeys(subjectsvalue);
//        subjects.sendKeys(Keys.ENTER);
//
//        WebElement hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
//        hobbies.click();
//
//        WebElement picture = driver.findElement(By.id("uploadPicture"));
//        File file = new File("src/test/resources/gopro contact.PNG");
//        picture.sendKeys(file.getAbsolutePath());
//
//        WebElement currentaddress = driver.findElement(By.id("currentAddress"));
//        String currentaddressvalue = "Eroilor 31";
//        currentaddress.sendKeys(currentaddressvalue);
//
//        jse.executeScript("window.scrollBy(0,350)");
//
//        WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));
//        state.click();
//
//        WebElement selectedstate = driver.findElement(By.id("react-select-3-input"));
//        String selectedstatevalue = "NCR";
//        selectedstate.sendKeys(selectedstatevalue);
//        selectedstate.sendKeys(Keys.ENTER);
//
//        WebElement city = driver.findElement(By.xpath("//div[text()='Select City']"));
//        city.click();
//
//        WebElement selectedcity = driver.findElement(By.id("react-select-4-input"));
//        String selectedcityvalue = "Delhi";
//        selectedcity.sendKeys(selectedcityvalue);
//        selectedcity.sendKeys(Keys.ENTER);
//
//        WebElement submit = driver.findElement(By.id("submit"));
//        jse.executeScript("arguments[0].click();", submit);
//
//
//
//
//
//
//    }
//}
