/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import loginPage.LoginVariable;

/**
 *
 * @author hp
 */
public class SaveJoinClass {
    
    private static LoginVariable LoginVariableObject = new LoginVariable();
    
    public static void insert(String key) {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-JLHJV1C:1433;databaseName=school_management;user=rifat;password=rifat2221;";

            Connection connection;
            PreparedStatement pst;
            String query;
            connection = DriverManager.getConnection(connectionUrl);
            query = "insert into taken_class(c_key,s_user_name)values(?,?)";
            pst = connection.prepareStatement(query);
            pst.setString(1, key);
            
            
            pst.setString(2, LoginVariableObject.loginUser_name);
            

            pst.executeUpdate();
            

        } catch (Exception exc) {

        }

    }
    
}
