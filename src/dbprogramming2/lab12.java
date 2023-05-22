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
import java.sql.PreparedStatement;
/**
 *
 * @author book
 */
public class lab12 {

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
              String sql ="insert into student values (?,?,?,?,?)";
              
              PreparedStatement preparedStatement = connection.prepareStatement (sql);
              preparedStatement.setString(1, "1111");
              preparedStatement.setString(2, "aaaa");
              preparedStatement.setString(3, "bbbb");
              preparedStatement.setString(4, "aaaaa@gmail.com");
              preparedStatement.setString(5, "IT");
              
              preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lab8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(lab8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
