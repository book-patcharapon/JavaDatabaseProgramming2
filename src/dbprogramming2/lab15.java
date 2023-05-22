/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbprogramming2;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
/**
 *
 * @author book
 */
public class lab15 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "Book1313@";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection =  DriverManager.getConnection(url, username, password);
              Statement statement = connection.createStatement();
              String sql ="SELECT * FROM student";
              ResultSet results = statement.executeQuery(sql);
              ResultSetMetaData rsMetaData = results.getMetaData();
//              System.out.println(rsMetaData.getColumnCount());

           for (int i = 1; i <= rsMetaData.getColumnCount(); i++){
               System.out.println(rsMetaData.getColumnName(i));
           }
           while (results.next()) {
for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
System.out.printf("%-12s\t", results.getObject(i));
System.out.println();
}
connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(lab15.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
