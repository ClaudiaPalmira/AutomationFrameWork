package Tests;

import Pages.Elements.ElementsPage;
import Pages.HomePage;
import Pages.Elements.WebTablePage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class WebTableTest extends ShareData {

    @Test

    public void testMethod() {


       // WebElement elements = driver.findElement(By.xpath("//h5[text()='Elements']"));
       // JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("window.scrollBy(0,350)");
      //  elements.click();

       // WebElement webtables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
       // webtables.click();

        HomePage homePage = new HomePage(getDriver());
        homePage.clickElements();

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.clickWebTables();

        String firstnamevalue = "Claudia";
        String lastnamevalue = "Gologan";
        String emailvalue = "claudiapalmiragologan@gmail.com";
        String agevalue = "20";
        String salaryvalue = "30000";
        String departmentvalue = "IT";


        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addNewEntry(firstnamevalue, lastnamevalue, emailvalue, agevalue, salaryvalue, departmentvalue);


       // List<WebElement> actualentries = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even'] "));
       // Integer actualtablesize = actualentries.size();

       // WebElement add = driver.findElement(By.id("addNewRecordButton"));
       // add.click();

       // WebElement firstname = driver.findElement(By.id("firstName"));
       // firstname.sendKeys(firstnamevalue);

       // WebElement lastname = driver.findElement(By.id("lastName"));
       // lastname.sendKeys(lastnamevalue);

       // WebElement email = driver.findElement(By.id("userEmail"));
       // email.sendKeys(emailvalue);

       // WebElement age = driver.findElement(By.id("age"));
       // age.sendKeys(agevalue);

       // WebElement salary = driver.findElement(By.id("salary"));
       // salary.sendKeys(salaryvalue);

       // WebElement deparment = driver.findElement(By.id("department"));
       // deparment.sendKeys(departmentvalue);

       // WebElement submit = driver.findElement(By.id("submit"));
       // submit.click();

       // List<WebElement> expectedentries = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even'] "));
       // Integer expectedtablesize = expectedentries.size();


       // Assert.assertTrue(actualtablesize + 1 == expectedtablesize);


       // String lastEntryTable=expectedentries.get(actualtablesize).getText();
        //Assert.assertTrue(lastEntryTable.contains(firstnamevalue));
       // Assert.assertTrue(lastEntryTable.contains(lastnamevalue));
       // Assert.assertTrue(lastEntryTable.contains(emailvalue));
       // Assert.assertTrue(lastEntryTable.contains(agevalue));
       // Assert.assertTrue(lastEntryTable.contains(salaryvalue));
       // Assert.assertTrue(lastEntryTable.contains(departmentvalue));


    }


    }

