package ObjectData;

import java.util.HashMap;

public class FormTableObject {

    private String firstNameValue;
    private String lastNameValue;
    private String emailvalue;
    private String mobilevalue;
    private String subjectsvalue;
    private String addressvalue;
    private String statevalue;
    private String cityvalue;
    private String expectedmessage;

    public FormTableObject (HashMap<String, String> testData){
        populateObject(testData);

    }

    //Facem o metoda care sa mapeze valorile din Properties la variabilele din clasa

    private void populateObject(HashMap<String, String> testData){
        for(String Key:testData.keySet()){
            switch (Key){
                case "firstNameValue":
                    setFirstNameValue(testData.get(Key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(Key));
                    break;
                case "emailvalue":
                    setEmailvalue(testData.get(Key));
                    break;
                case "mobilevalue":
                    setMobilevalue(testData.get(Key));
                    break;
                case "subjectsvalue":
                    setSubjectsvalue(testData.get(Key));
                    break;
                case "addressvalue":
                    setAddressvalue(testData.get(Key));
                    break;
                case "statevalue":
                    setStatevalue(testData.get(Key));
                    break;
                case "cityvalue":
                    setCityvalue(testData.get(Key));
                    break;
                case "expectedmessage":
                    setExpectedmessage(testData.get(Key));
                    break;

            }
        }

    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getEmailvalue() {
        return emailvalue;
    }

    public void setEmailvalue(String emailvalue) {
        this.emailvalue = emailvalue;
    }

    public String getMobilevalue() {
        return mobilevalue;
    }

    public void setMobilevalue(String mobilevalue) {
        this.mobilevalue = mobilevalue;
    }

    public String getSubjectsvalue() {
        return subjectsvalue;
    }

    public void setSubjectsvalue(String subjectsvalue) {
        this.subjectsvalue = subjectsvalue;
    }

    public String getAddressvalue() {
        return addressvalue;
    }

    public void setAddressvalue(String addressvalue) {
        this.addressvalue = addressvalue;
    }

    public String getStatevalue() {
        return statevalue;
    }

    public void setStatevalue(String statevalue) {
        this.statevalue = statevalue;
    }

    public String getCityvalue() {
        return cityvalue;
    }

    public void setCityvalue(String cityvalue) {
        this.cityvalue = cityvalue;
    }

    public String getExpectedmessage() {
        return expectedmessage;
    }

    public void setExpectedmessage(String expectedmessage) {
        this.expectedmessage = expectedmessage;
    }
}
