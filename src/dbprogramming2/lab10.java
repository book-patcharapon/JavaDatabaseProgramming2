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
/**
 *
 * @author book
 */
public class lab10 {

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
              String sql ="update  student set email ='patcharapon.kaeo@kmutt.ac.th' where studentID='64120' ";
              statement.executeUpdate(sql);
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lab8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(lab8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    

