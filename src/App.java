import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ui.EmptyWindow;
import ui.ViewGroupePanel;
public class App {

    public static void main(String[] args) throws Exception {
        //new EmptyWindow(new ViewGroupePanel(null));
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish connection to the Oracle database
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "yassine", "yassine");

            // Create a statement
            Statement stmt = con.createStatement();

            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
            while(rs.next()){
                System.out.println(rs.getString(1)+" " +rs.getString(2)+ " "+ rs.getString(3)+" "+ rs.getString(4));
            }
    }
}
