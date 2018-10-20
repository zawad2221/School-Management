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

/**
 *
 * @author hp
 */
public class SaveCreatedAccount {

    private CreatedAcountVariable CreatedAcountVariableObject = new CreatedAcountVariable();
    private LoginVariable LoginVariableObject = new LoginVariable();

    public static void main(String args[]) {

    }

    public void save(String user) {
        String query = "";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-JLHJV1C:1433;databaseName=school_management;user=rifat;password=rifat2221;";

            Connection connection;
            PreparedStatement pst;

            connection = DriverManager.getConnection(connectionUrl);
            if (CreatedAcountVariableObject.userType.equals("teacher")) {
                query = "insert into teacher(t_user_name,t_name,t_institution_name,t_email,t_phone_number,t_password,a_user_name)values(?,?,?,?,?,?,?)";
            }
            if (CreatedAcountVariableObject.userType.equals("student")) {
                query = "insert into student(s_user_name,s_name,s_institution_name,s_email,s_phone_number,s_password,a_user_name)values(?,?,?,?,?,?,?)";
            }
            pst = connection.prepareStatement(query);
            pst.setString(1, user);
            pst.setString(2, "");
            pst.setString(3, LoginVariableObject.loginInstitution);
            pst.setString(4, "");
            pst.setString(5, "");
            pst.setString(6, "1");
            pst.setString(7, LoginVariableObject.loginUser_name);
            pst.executeUpdate();
            //query="insert into UserAmount(Number,Amount)values(?,?)";
            //pst=connection.prepareStatement(query);
            //pst.setString(1, num);
            //pst.setInt(2, amnt);
            //pst.executeUpdate();

        } catch (Exception exc) {
            System.out.println("admin.SaveCreatedAccount.save");

        }

    }

}
