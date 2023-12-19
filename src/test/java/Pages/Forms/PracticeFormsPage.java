package Pages.Forms;

import Logger.LoggerUtility;
import ObjectData.FormTableObject;
import Pages.BasePage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormsPage extends BasePage {
    public PracticeFormsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstName")
    private WebElement firstname;


    @FindBy(id = "lastName")
    private WebElement lastname;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement gender;

    @FindBy(id = "userNumber")
    private WebElement mobile;

    @FindBy(id = "subjectsInput")
    public  WebElement subjects;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement hobbies;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPicture;

    @FindBy (id = "currentAddress")
    private WebElement address;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "react-select-3-input")
    private WebElement selectstate;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "react-select-4-input")
    private WebElement selectcity;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement thanksmessage;

    @FindBy(css = ".table-dark>tbody>tr")
    private List<WebElement> validationtable;

    @FindBy(id = "closeLargeModal")
    private WebElement closebutton;



    public void fillPracticeForm(FormTableObject formTableObject){

        fillFirstName(formTableObject.getFirstNameValue());
        filldLastName(formTableObject.getLastNameValue());
        fillemail(formTableObject.getEmailvalue());
        fillgender();
        fillmobile(formTableObject.getMobilevalue());
        fillsubjects(formTableObject.getSubjectsvalue());
        elementMethods.scrollByPixel(0,400);
        fillhobbies();
        fillphoto();
        filladdress(formTableObject.getAddressvalue());
        fillstate(formTableObject.getStatevalue());
        fillcity(formTableObject.getCityvalue());
    }

    public List<String> getValuesForm(){
        List<String> formValues = new ArrayList<>();
        formValues.add(gender.getText());
        formValues.add(hobbies.getText());
        return formValues;
    }

    public void fillFirstName(String firstnamevalue){
        elementMethods.fillElement(firstname, firstnamevalue); // nu am castigat linii de cod dar am reusit GENERALIZAREA ACTIUNII
//        firstname.sendKeys(firstnamevalue);
        LoggerUtility.info("The user fills firstname with value: " + firstnamevalue);
    }

    public void filldLastName(String lastnamevalue){
        elementMethods.fillElement(lastname, lastnamevalue );
//        lastname.sendKeys(lastnamevalue);
        LoggerUtility.info("The user fills lastname with value: " + lastnamevalue);
    }

    public void fillemail(String emailvalue){
        elementMethods.fillElement(email, emailvalue);
//        email.sendKeys(emailvalue);
        LoggerUtility.info("The user fills email with value: " + emailvalue);
    }

    public void fillgender(){
        elementMethods.clickElement(gender);
//        gender.click();
        LoggerUtility.info("The user clicks on gender " + gender);
    }

    public void fillmobile(String mobilevalue){
        elementMethods.fillElement(mobile, mobilevalue);
//        mobile.sendKeys(mobilevalue);
        LoggerUtility.info("The user fills mobile with value: " + mobilevalue);
    }

    public void fillsubjects(String subjectsvalue){
        elementMethods.fillElement(subjects, subjectsvalue, Keys.ENTER);
        LoggerUtility.info("The user fills subjects with value: " + subjectsvalue);
//        subjects.sendKeys(subjectsvalue);
//        subjects.sendKeys(Keys.ENTER);
    }

    public void fillhobbies(){
        elementMethods.clickElement(hobbies);
        LoggerUtility.info("The user clicks on: " + hobbies);
//      hobbies.click();
    }

    public void fillphoto(){
        File file = new File("src/test/resources/gopro contact.PNG");
        uploadPicture.sendKeys(file.getAbsolutePath());
    }

    public void filladdress(String addressvalue){
        elementMethods.fillElement(address, addressvalue);
        LoggerUtility.info("The user fills address with value: " + address);

//      address.sendKeys(addressvalue);
    }

    public void fillstate(String statevalue){

        elementMethods.scrollByPixel(0,450);
        LoggerUtility.info("The user scrolls down the page ");

        elementMethods.clickJsElement(state);
        LoggerUtility.info("The user click on state button");

        elementMethods.fillElement(selectstate, statevalue, Keys.ENTER);
        LoggerUtility.info("The user selects the state " + statevalue);

//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,450)");
//        state.click();
//        selectstate.sendKeys(statevalue);
//        selectstate.sendKeys(Keys.ENTER);
    }

    public void fillcity(String cityvalue){
        elementMethods.clickJsElement(city);
        LoggerUtility.info("The user click on city");

        elementMethods.fillElement(selectcity, cityvalue, Keys.ENTER);
        LoggerUtility.info("The user selects the city: " + cityvalue);
//        city.click();
//        selectcity.sendKeys(cityvalue);
//        selectcity.sendKeys(Keys.ENTER);
    }

    public void fillsubmit(){
        elementMethods.clickJsElement(submit);
        LoggerUtility.info("The user clicks on submit button: ");

//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();", submit);
    }

    public void clickClose(){
        elementMethods.fillElement(closebutton, Keys.ENTER); //AICI DE VERIF DACA E OK, AM MAI FACUT O METODA PT WEB ELEMENT SI ENTER
        LoggerUtility.info("The user clicks on close button: ");

//        closebutton.sendKeys(Keys.ENTER);
    }

//    public void validatePracticeForm(String expectedMessage, String firstnamevalue, String lastnamevalue, String emailvalue,
//                                     String gendervalue, String mobilevalue, String subjectsvalue, String hobbiesvalue,
//                                     String addressvalue, String statevalue, String cityvalue){

    public void validatePracticeForm(String expectedMessage, String firstnamevalue, String lastnamevalue, String emailvalue,
                                     String gendervalue, String mobilevalue, String subjectsvalue, String hobbiesvalue,
                                     String addressvalue, String statevalue, String cityvalue){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM,yyyy");
        LocalDateTime now = LocalDateTime.now();
        String dateofbirthvalue = dtf.format(now);

        elementMethods.validateElementMessage(thanksmessage,expectedMessage);

//        String actualmessage = thanksmessage.getText();
//        Assert.assertEquals(actualmessage, expectedMessage);

        Assert.assertTrue(validationtable.get(0).getText().contains("Student Name"));
        Assert.assertTrue(validationtable.get(0).getText().contains(firstnamevalue + " " + lastnamevalue));

        Assert.assertTrue(validationtable.get(1).getText().contains("Student Email"));
        Assert.assertTrue(validationtable.get(1).getText().contains(emailvalue));

        Assert.assertTrue(validationtable.get(2).getText().contains("Gender"));
        Assert.assertTrue(validationtable.get(2).getText().contains(gendervalue));

        Assert.assertTrue(validationtable.get(3).getText().contains("Mobile"));
        Assert.assertTrue(validationtable.get(3).getText().contains(mobilevalue));

        Assert.assertTrue(validationtable.get(4).getText().contains("Date of Birth"));
        Assert.assertTrue(validationtable.get(4).getText().contains(dateofbirthvalue));

        Assert.assertTrue(validationtable.get(5).getText().contains("Subjects"));
        Assert.assertTrue(validationtable.get(5).getText().contains(subjectsvalue));

        Assert.assertTrue(validationtable.get(6).getText().contains("Hobbies"));
        Assert.assertTrue(validationtable.get(6).getText().contains(hobbiesvalue));

        //Assert.assertTrue(validationtable.get(7).getText().contains("Picture"));
       // Assert.assertTrue(validationtable.get(7).getText().contains(file.getName()));

        Assert.assertTrue(validationtable.get(8).getText().contains("Address"));
        Assert.assertTrue(validationtable.get(8).getText().contains(addressvalue));

        Assert.assertTrue(validationtable.get(9).getText().contains("State and City"));
        Assert.assertTrue(validationtable.get(9).getText().contains(statevalue + " " + cityvalue));
    }



}
