/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
    public static Connection getConnection(){
    Connection con=null;
    try{
       // Class.forName("com.mysql.jdbc.Driver");  
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        con= DriverManager.getConnection("jdbc:mysql://localhost:81/java_login_register?" +"user=root&password=Tubelight2");
        
    }
    catch(Exception e){
    System.out.println(e.getMessage());
    }
    return con;
    }
    
}
