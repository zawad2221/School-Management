/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import loginPage.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import registration.RegistrationVariable;

/**
 *
 * @author hp
 */
public class SaveClass {
    
    private static LoginVariable LoginVariableObject = new LoginVariable();

    public static void insert(String name, String key, String teacher) {
        //RegistrationVariable RegistrationVariableObject = new RegistrationVariable();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-JLHJV1C:1433;databaseName=school_management;user=rifat;password=rifat2221;";

            Connection connection;
            PreparedStatement pst;
            String query;
            connection = DriverManager.getConnection(connectionUrl);
            query = "insert into class(c_key,c_name,c_institution_name,a_user_name,t_user_name)values(?,?,?,?,?)";
            pst = connection.prepareStatement(query);
            pst.setString(1, key);
            pst.setString(2, name);
            pst.setString(3, LoginVariableObject.loginInstitution);
            pst.setString(4, LoginVariableObject.loginUser_name);
            pst.setString(5, teacher);

            pst.executeUpdate();
            

        } catch (Exception exc) {

        }

    }
}
