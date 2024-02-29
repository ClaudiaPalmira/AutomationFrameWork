package Database.Queries;

import ObjectData.WebTableObject;

import java.sql.SQLException;
import java.sql.Statement;

public class WebTable extends BaseTable{

    // In aceasta clasa vom defini diferite Queries pe care sa le executam pe acest tabel (webtable)

    public synchronized void insertWebtableData(WebTableObject webTableObject){
        try {
            // Ca sa facem un INSERT avem nevoie de un obiect de tipul STATEMENT
            Statement statement = databaseConnection.getConnection().createStatement();
            String query = "insert into Webtable (firstname, lastname, email, age, salary, department, entrydate)\n" +
                    "values ('" + webTableObject.getFirstnamevalue() + "', '" + webTableObject.getLastnamevalue() + "', " +
                    "'" + webTableObject.getEmailvalue() + "', '" + webTableObject.getAgevalue() + "', " +
                    "'" + webTableObject.getSalaryvalue() + "', '" + webTableObject.getDepartmentvalue() + "'," +
                    "'" + getCurrentDate() + "' );";
            statement.execute(query);
        }
        catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
