package Tests;

import ObjectData.FormTableObject;
import Pages.Forms.FormsPage;
import Pages.HomePage;
import Pages.Forms.PracticeFormsPage;
import org.testng.annotations.Test;
import ShareData.ShareData;
import ShareData.Hooks;
import java.util.List;




public class FormTableTest extends Hooks { //in loc de Share Data am pus Hooks

    //public WebDriver driver;

    @Test
    public void testmethod(){

        FormTableObject formTableObject = new FormTableObject(testData);


       HomePage homePage = new HomePage(getDriver());
       homePage.clickForms();

       FormsPage formsPage = new FormsPage(getDriver());
       formsPage.clickPracticeForm();


//        String firstnamevalue= "Claudia";
//        String lastnamevalue= "Gologan";
//        String emailvalue= "palmira_clau@yahoo.com";
//        String mobilevalue= "0755555000";
//        String subjectsvalue = "English";
//        String addressvalue = " Eroilor 31";
//        String statevalue = "NCR";
//        String cityvalue = "Delhi";
//        String expectedmessage = "Thanks for submitting the form";

//        practiceFormsPage.fillPracticeForm(firstnamevalue, lastnamevalue, emailvalue, mobilevalue, subjectsvalue, addressvalue,
//                statevalue, cityvalue);

        PracticeFormsPage practiceFormsPage = new PracticeFormsPage(getDriver());
        practiceFormsPage.fillPracticeForm(formTableObject);

        List<String> Formvalues = practiceFormsPage.getValuesForm();
        practiceFormsPage.fillsubmit();

//        practiceFormsPage.validatePracticeForm(expectedmessage, firstnamevalue, lastnamevalue, emailvalue, Formvalues.get(0),
//                mobilevalue, subjectsvalue, Formvalues.get(1), addressvalue, statevalue, cityvalue);


       // WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
        //File file = new File("src/test/resources/gopro contact.PNG");
       // uploadPicture.sendKeys(file.getAbsolutePath());

        practiceFormsPage.clickClose();


    }

}
