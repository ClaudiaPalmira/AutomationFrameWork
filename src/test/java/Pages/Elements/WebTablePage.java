package Pages.Elements;

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

    public WebTablePage(WebDriver driver) {
        super(driver);
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

        elementMethods.clickElement(add);
//        add.click();

        elementMethods.fillElement(firstname, webTableObject.getLastnamevalue());
//        firstname.sendKeys(firstnamevalue);

        elementMethods.fillElement(lastname, webTableObject.getLastnamevalue());
//        lastname.sendKeys(lastnamevalue);

        elementMethods.fillElement(email, webTableObject.getEmailvalue());
//        email.sendKeys(emailvalue);

        elementMethods.fillElement(age, webTableObject.getAgevalue());
//        age.sendKeys(agevalue);

        elementMethods.fillElement(salary,webTableObject.getSalaryvalue());
//        salary.sendKeys(salaryvalue);

        elementMethods.fillElement(deparment, webTableObject.getDepartmentvalue());
//        deparment.sendKeys(departmentvalue);

        elementMethods.clickElement(submit);
//        submit.click();

       validateNewEntry(actualtablesize, webTableObject);

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


