/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class LoginVerification {

    private static LoginVariable LoginVariableObject = new LoginVariable();

    public static void main(String[] args) {

    }

    public static int chack(String user, String password) {
        int check = 0;
        String query = "";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-JLHJV1C:1433;databaseName=school_management;user=rifat;password=rifat2221;";

            Connection connection;
            ResultSet rs;
            connection = DriverManager.getConnection(connectionUrl);
            if (LoginVariableObject.loginUser_type.equals("admin")) {
                query = "select * from admin where a_user_name=? and a_password=?";
            }

            if (LoginVariableObject.loginUser_type.equals("teacher")) {
                query = "select * from teacher where t_user_name=? and t_password=?";
            }
            if (LoginVariableObject.loginUser_type.equals("student")) {
                query = "select * from student where s_user_name=? and s_password=?";
            }
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, user);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                if (LoginVariableObject.loginUser_type.equals("admin")) {
                    LoginVariableObject.loginUser_name = rs.getString("a_user_name");
                    LoginVariableObject.loginName = rs.getString("a_name");
                    LoginVariableObject.loginInstitution = rs.getString("a_institution_name");
                    LoginVariableObject.loginEmail = rs.getString("a_email");
                    LoginVariableObject.loginPhone_number = rs.getString("a_phone_number");
                    LoginVariableObject.loginPassword = rs.getString("a_password");
                }
                if (LoginVariableObject.loginUser_type.equals("teacher")) {
                    LoginVariableObject.loginUser_name = rs.getString("t_user_name");
                    LoginVariableObject.loginName = rs.getString("t_name");
                    LoginVariableObject.loginInstitution = rs.getString("t_institution_name");
                    LoginVariableObject.loginEmail = rs.getString("t_email");
                    LoginVariableObject.loginPhone_number = rs.getString("t_phone_number");
                    LoginVariableObject.loginPassword = rs.getString("t_password");
                    LoginVariableObject.loginUserAdmin=rs.getString("a_user_name");
                }
                if (LoginVariableObject.loginUser_type.equals("student")) {
                    LoginVariableObject.loginUser_name = rs.getString("s_user_name");
                    LoginVariableObject.loginName = rs.getString("s_name");
                    LoginVariableObject.loginInstitution = rs.getString("s_institution_name");
                    LoginVariableObject.loginEmail = rs.getString("s_email");
                    LoginVariableObject.loginPhone_number = rs.getString("s_phone_number");
                    LoginVariableObject.loginPassword = rs.getString("s_password");
                    LoginVariableObject.loginUserAdmin=rs.getString("a_user_name");
                }
                check=1;

            } else {
                check = 0;
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return check;
    }

}
