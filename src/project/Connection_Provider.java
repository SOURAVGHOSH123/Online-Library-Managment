/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

/**
 *
 * @author sourav ghosh
 */
public class Connection_Provider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","SouravGho@123");
            return con;
        }
        catch(Exception e)     
        {
            System.out.println(e);
            return null;
        }
    }
    
}
