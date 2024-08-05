/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author BAHZAD
 */
public class db {
    public static Connection mycon(){
        Connection con=null;
       try {
    // Register the driver (for older versions of MySQL Connector/J)
    Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL Connector/J 8.x and later

    // Establish the connection
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
    
    
} catch (HeadlessException | ClassNotFoundException | SQLException e) {
    System.out.println(e);
}
        
        return con;
    }
}
