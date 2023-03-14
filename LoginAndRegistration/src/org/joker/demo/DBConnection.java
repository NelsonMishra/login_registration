/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.joker.demo;
import java.sql.*;


/**
 *
 * @author ASUS
 */
public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost/LoginDB";
    static final String USER = "root";
    static final String PASS = "joker@sqlpassword";
    
    
    public static Connection connectDB(){
        Connection con = null ;

        try{
            //register jdbc driver...
           //Class.forName("com.mysql.cj.jdbc.Driver");
          //  System.out.println("Driver is loaded");
            //open a connection...
            con = DriverManager.getConnection(DB_URL,USER,PASS);
           // System.out.println("Connection establish");
            return con;
            
        }catch(Exception e){
            System.out.println("Error in connection");
            return null;
        }
    }
}

