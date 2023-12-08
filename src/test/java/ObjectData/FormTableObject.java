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

    public FormTableObject (HashMap<String, String> tesData){
        populateObject(tesData);

    }

    //Facem o metoda care sa mapeze valorile din Properties la variabilele din clasa

    private void populateObject(HashMap<String, String> tesData){
        for(String Key:tesData.keySet()){
            switch (Key){
                case "firstNameValue":
                    setFirstNameValue(tesData.get(Key));
                    break;
                case "lastNameValue":
                    setLastNameValue(tesData.get(Key));
                    break;
                case "emailvalue":
                    setEmailvalue(tesData.get(Key));
                    break;
                case "mobilevalue":
                    setMobilevalue(tesData.get(Key));
                    break;
                case "subjectsvalue":
                    setSubjectsvalue(tesData.get(Key));
                    break;
                case "addressvalue":
                    setAddressvalue(tesData.get(Key));
                    break;
                case "statevalue":
                    setStatevalue(tesData.get(Key));
                    break;
                case "cityvalue":
                    setCityvalue(tesData.get(Key));
                    break;
                case "expectedmessage":
                    setExpectedmessage(tesData.get(Key));
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
