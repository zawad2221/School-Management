/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import loginPage.LoginVariable;

/**
 *
 * @author hp
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import loginPage.LoginVariable;

/**
 *
 * @author hp
 */
public class SaveEditedProfile {

    private static LoginVariable LoginVariableObject = new LoginVariable();

    public static void update() {
        int check = 0;
        String query = "", query2 = "";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-JLHJV1C:1433;databaseName=school_management;user=rifat;password=rifat2221;";

            Connection connection;
            ResultSet rs,rs2;
            connection = DriverManager.getConnection(connectionUrl);
            if (LoginVariableObject.loginUser_type.equals("admin")) {
                query = "select * from admin where a_user_name=?";
            }

            if (LoginVariableObject.loginUser_type.equals("teacher")) {
                query = "select * from teacher where t_user_name=?";
            }
            if (LoginVariableObject.loginUser_type.equals("student")) {
                query = "select * from student where s_user_name=?";
            }
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, LoginVariable.loginUser_name);
            
            rs = pst.executeQuery();
            if (rs.next()) {
                if (LoginVariableObject.loginUser_type.equals("admin")) {
                    query2 = "UPDATE admin SET a_name =?, a_password=?,a_email=?,a_phone_number=? WHERE a_user_name = ?";
                }
                if (LoginVariableObject.loginUser_type.equals("teacher")) {
                    query2 = "UPDATE teacher SET t_name =?, t_password=?,t_email=?,t_phone_number=? WHERE t_user_name = ?";
                }
                if (LoginVariableObject.loginUser_type.equals("student")) {
                    query2 = "UPDATE student SET s_name =?, s_password=?,s_email=?,s_phone_number=? WHERE s_user_name = ?";
                }
                
                PreparedStatement pst2 = connection.prepareStatement(query2);
                pst2.setString(1, LoginVariable.loginName);
                pst2.setString(2, LoginVariable.loginPassword);
                pst2.setString(3, LoginVariable.loginEmail);
                pst2.setString(4, LoginVariable.loginPhone_number);
                pst2.setString(5, LoginVariable.loginUser_name);
                rs2 = pst2.executeQuery();

            } else {

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("profile_page.SaveEditProfile.update()");

        }

    }
    public static void main(String[] args) {

    }

}
