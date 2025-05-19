/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import essentails.config;
import java.sql.*;

/**
 *
 * @author new
 */
public class dbContext {
    
    private static Connection con = null;
    public static String message = "Connected";
    public static Connection Connect(config c){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(""+c.getDbHost()+""
                + "/"+c.getDbName()+"",""+c.getDbuser()+"",""+c.getDbpass()+"");
        }
       catch(SQLException | ClassNotFoundException e){
           message = e.getMessage();
       }
      return con;  
    }
    
}
