/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author hp
 */
public class InsertRegistrationData {
    public static void main(String[] args) {
        
    }
    
    public static void insert()
    {
        RegistrationVariable RegistrationVariableObject= new RegistrationVariable();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-JLHJV1C:1433;databaseName=school_management;user=rifat;password=rifat2221;";

            Connection connection;
            PreparedStatement pst;
            String query;
            connection = DriverManager.getConnection(connectionUrl);
            query = "insert into admin(a_user_name,a_name,a_institution_name,a_email,a_phone_number,a_password)values(?,?,?,?,?,?)";
            pst = connection.prepareStatement(query);
            pst.setString(1,RegistrationVariableObject.user_name);
            pst.setString(2, RegistrationVariableObject.name);
            pst.setString(3, RegistrationVariableObject.institution);
            pst.setString(4, RegistrationVariableObject.email);
            pst.setString(5, RegistrationVariableObject.phone_number);
            pst.setString(6, RegistrationVariableObject.password);
            pst.executeUpdate();
            //query="insert into UserAmount(Number,Amount)values(?,?)";
            //pst=connection.prepareStatement(query);
            //pst.setString(1, num);
            //pst.setInt(2, amnt);
            //pst.executeUpdate();

        } catch (Exception exc) {

        }
    }
    
}
