package Pages.Elements;

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
    private List<WebElement> actualentries;

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



    public void addNewEntry(String firstnamevalue,String lastnamevalue, String emailvalue, String agevalue,
                            String salaryvalue, String departmentvalue){

        Integer actualtablesize = actualentries.size();

        add.click();
        firstname.sendKeys(firstnamevalue);
        lastname.sendKeys(lastnamevalue);
        email.sendKeys(emailvalue);
        age.sendKeys(agevalue);
        salary.sendKeys(salaryvalue);
        deparment.sendKeys(departmentvalue);
        submit.click();

        validateNewEntry(actualtablesize, firstnamevalue, lastnamevalue, emailvalue, agevalue, salaryvalue, departmentvalue);

    }

    private void validateNewEntry(Integer actualtablesize, String firstnamevalue,String lastnamevalue, String emailvalue, String agevalue,
                                  String salaryvalue, String departmentvalue){
        Integer expectedtablesize = actualentries.size();
        Assert.assertTrue(actualtablesize + 1 == expectedtablesize);
        String lastEntryTable=actualentries.get(actualtablesize).getText();
        Assert.assertTrue(lastEntryTable.contains(firstnamevalue));
        Assert.assertTrue(lastEntryTable.contains(lastnamevalue));
        Assert.assertTrue(lastEntryTable.contains(emailvalue));
        Assert.assertTrue(lastEntryTable.contains(agevalue));
        Assert.assertTrue(lastEntryTable.contains(salaryvalue));
        Assert.assertTrue(lastEntryTable.contains(departmentvalue));


    }





}


