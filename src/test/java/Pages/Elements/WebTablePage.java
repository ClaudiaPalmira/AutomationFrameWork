package Pages.Elements;

import Database.Queries.WebTable;
import Logger.LoggerUtility;
import ObjectData.WebTableObject;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class WebTablePage extends BasePage {

    private WebTable webTable;

    public WebTablePage(WebDriver driver) {
        super(driver);
        webTable = new WebTable();
    }

    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even'] ")
    private List<WebElement> actualEntries;

    @FindBy(id = "addNewRecordButton")
    private WebElement add;

    @FindBy(id = "firstName")
    private  WebElement firstname;

    @FindBy(id = "lastName")
    private WebElement lastname;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "age")
    private WebElement age;

    @FindBy(id = "salary")
    private WebElement salary;

    @FindBy(id = "department")
    private WebElement deparment;

    @FindBy (id = "submit")
    private WebElement submit;



//    public void addNewEntry(String firstnamevalue,String lastnamevalue, String emailvalue, String agevalue,
//                            String salaryvalue, String departmentvalue){
      public void addNewEntry(WebTableObject webTableObject){

        Integer actualtablesize = actualEntries.size();

        elementMethods.clickJsElement(add);
//        elementMethods.clickElement(add);
        LoggerUtility.info("The user clicks on the add button");
//        add.click();

        elementMethods.fillElement(firstname, webTableObject.getFirstnamevalue());
        LoggerUtility.info("The user fills firstname field" + firstname);
//        firstname.sendKeys(firstnamevalue);

        elementMethods.fillElement(lastname, webTableObject.getLastnamevalue());
        LoggerUtility.info("The user fills lastname field" + lastname);
//        lastname.sendKeys(lastnamevalue);

        elementMethods.fillElement(email, webTableObject.getEmailvalue());
        LoggerUtility.info("The user fills email field" + email);
//        email.sendKeys(emailvalue);

        elementMethods.fillElement(age, webTableObject.getAgevalue());
        LoggerUtility.info("The user fills age field" + age);
//        age.sendKeys(agevalue);

        elementMethods.fillElement(salary,webTableObject.getSalaryvalue());
        LoggerUtility.info("The user fills salary field" + salary);
//        salary.sendKeys(salaryvalue);

        elementMethods.fillElement(deparment, webTableObject.getDepartmentvalue());
        LoggerUtility.info("The user fills department field" + deparment);
//        deparment.sendKeys(departmentvalue);

        elementMethods.clickElement(submit);
        LoggerUtility.info("The user clicks on submit button");
//        submit.click();

       validateNewEntry(actualtablesize, webTableObject);

       // Inseram datele din IU in BD-ul nostru
          webTable.insertWebtableData(webTableObject);
          LoggerUtility.info("All the testing data were inserted into Webtable with success");


    }

    private void validateNewEntry(Integer actualtablesize, WebTableObject webTableObject){

        Integer expectedtablesize = actualEntries.size();
        Assert.assertTrue(actualtablesize+1 == expectedtablesize);
//        Assert.assertEquals(actualtablesize+1, Integer.valueOf(expectedtablesize));
        String lastEntryTable=actualEntries.get(actualtablesize).getText();

        Assert.assertTrue(lastEntryTable.contains(webTableObject.getFirstnamevalue()));
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getLastnamevalue()));
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getEmailvalue()));
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getAgevalue()));
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getSalaryvalue()));
        Assert.assertTrue(lastEntryTable.contains(webTableObject.getDepartmentvalue()));




    }





}


