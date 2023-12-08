package PropertyUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertyUtility {

    public Properties properties;

    public PropertyUtility(String fileName){
        loadDataFile(fileName);

    }

    //Metoda care incarca un fisier de tip "Properties"

    private void loadDataFile(String filetName){
        properties = new Properties();  //initializam obiectul
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream( "src/test/resources/TestData/FormTableTestData.properties");
            properties.load(fileInputStream);
        } catch (IOException ignored) {
        }

    }

    //Metoda care returneaza toate datele din fisierul de "Properties"

    public HashMap<String, String> getAllData(){
        HashMap<String,String> testData = new HashMap<>();
        for(String Key:properties.stringPropertyNames()){ //parcurgem toate cheile din Properties
            testData.put(Key, properties.getProperty(Key)); // adaugam cheie-valoare in hahsmap-ul de mai sus

        }
        return testData; //returnam colectia
    }
}
