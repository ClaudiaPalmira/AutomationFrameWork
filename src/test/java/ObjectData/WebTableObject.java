package ObjectData;

import java.util.HashMap;

public class WebTableObject {

    private String firstnamevalue;
    private String lastnamevalue;
    private String emailvalue;
    private String agevalue;
    private String salaryvalue;
    private String departmentvalue;

    public WebTableObject(HashMap<String, String> testData){
        populateObject(testData);

    }

    private void populateObject (HashMap<String, String> testData){
        for (String Key: testData.keySet()){
            switch (Key){
                case "firstnamevalue":
                    setFirstnamevalue(testData.get(Key));
                    break;
                case "lastnamevalue":
                    setLastnamevalue(testData.get(Key));
                    break;
                case "emailvalue":
                    setEmailvalue(testData.get(Key));
                    break;
                case "agevalue":
                    setAgevalue(testData.get(Key));
                    break;
                case "salaryvalue":
                    setSalaryvalue(testData.get(Key));
                    break;
                case "departmentvalue":
                    setDepartmentvalue(testData.get(Key));
                    break;


            }
        }
    }

    public String getFirstnamevalue() {
        return firstnamevalue;
    }

    public void setFirstnamevalue(String firstnamevalue) {
        this.firstnamevalue = firstnamevalue;
    }

    public String getLastnamevalue() {
        return lastnamevalue;
    }

    public void setLastnamevalue(String lastnamevalue) {
        this.lastnamevalue = lastnamevalue;
    }

    public String getEmailvalue() {
        return emailvalue;
    }

    public void setEmailvalue(String emailvalue) {
        this.emailvalue = emailvalue;
    }

    public String getAgevalue() {
        return agevalue;
    }

    public void setAgevalue(String agevalue) {
        this.agevalue = agevalue;
    }

    public String getSalaryvalue() {
        return salaryvalue;
    }

    public void setSalaryvalue(String salaryvalue) {
        this.salaryvalue = salaryvalue;
    }

    public String getDepartmentvalue() {
        return departmentvalue;
    }

    public void setDepartmentvalue(String departmentvalue) {
        this.departmentvalue = departmentvalue;
    }
}
