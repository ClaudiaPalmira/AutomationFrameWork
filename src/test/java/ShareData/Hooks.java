package ShareData;

import PropertyUtility.PropertyUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.HashSet;

public class Hooks extends ShareData{  // va avea ca rol sa aduca impreuna toate componentele arhitecturii noastre

    public HashMap<String,String> testData;

    @BeforeMethod

    public void prepareEnvironment(){
        setUp();
        String testName = this.getClass().getSimpleName();
        PropertyUtility propertyUtility = new PropertyUtility(testName);
        testData = propertyUtility.getAllData();

    }

    @AfterMethod

    public void clearEnvironment(){
        clear();
    }
}
