/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// import login packeg
import loginPage.LoginVariable;

/**
 *
 * @author hp
 */
public class ClassVerification {
    private static LoginVariable LoginVariableObject = new LoginVariable();
    
    public static int check(String user) {
        int check = 0;
        String query = "";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-JLHJV1C:1433;databaseName=school_management;user=rifat;password=rifat2221;";

            Connection connection;
            ResultSet rs;
            connection = DriverManager.getConnection(connectionUrl);
            

            
                query = "select * from teacher where t_user_name=? and a_user_name=?";
            
            
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, user);
            pst.setString(2, LoginVariableObject.loginUser_name);
            
            rs = pst.executeQuery();
            if (rs.next()) {
                
                check=1;

            } else {
                check = 0;
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return check;
    }
    
}


