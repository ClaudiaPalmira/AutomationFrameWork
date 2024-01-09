package ShareData;

import Logger.LoggerUtility;
import PropertyUtility.PropertyUtility;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.HashSet;

public class Hooks extends ShareData{  // va avea ca rol sa aduca impreuna toate componentele arhitecturii noastre

    public HashMap<String,String> testData;
    public String testName;

    @BeforeMethod
    public void prepareEnvironment(){
        testName = this.getClass().getSimpleName();
        PropertyUtility propertyUtility = new PropertyUtility(testName);
        testData = propertyUtility.getAllData();
        LoggerUtility.startTestCase(testName); //apelam METODA STATICA pentru log-uri, nu avem nevoie de obiect
        setUp();  //apare metoda de setup fiindca avem extends ShareData
    }

    @AfterMethod
    public void clearEnvironment(ITestResult result){
        if(result.getStatus()==ITestResult.FAILURE) {
            LoggerUtility.error(result.getThrowable().getMessage());
        }
        else {
            clear();  // tot asa, apare clear fiindca avem extends ShareData
            LoggerUtility.endTestCase(testName); //apelam METODA STATICA pentru log-uri, nu avem nevoie de obiect

            //adaugam un listener pe statusul testului pentru a ne ajuta sa printam in log-uri eroare daca apare
        }

    }
    @AfterSuite
    public void finishArtifacts(){
        LoggerUtility.mergeLogsIntoOne();
    }

}
