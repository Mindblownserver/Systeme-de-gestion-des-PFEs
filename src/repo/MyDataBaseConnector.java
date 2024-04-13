/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author yassine
 */
public class MyDataBaseConnector {
    public Connection conn;
    public Statement stmt;
    public ResultSet rs;
    public ResultSetMetaData rsMetadata;
    public int columnCount;


    public MyDataBaseConnector() throws SQLException, ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        this.conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "C##yassine", "yassine");
        this.stmt = conn.createStatement();
    
    }
    /**
     * This method does a query and returns its column count
     * @param sqlQuery
     * @see columnCount
     * @throws SQLException
     */
    public void query(String sqlQuery)throws SQLException{
        rs = stmt.executeQuery(sqlQuery);
        rsMetadata = rs.getMetaData();
        columnCount= rsMetadata.getColumnCount();
    }

}
