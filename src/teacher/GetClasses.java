/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

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
public class GetClasses {
    public static String[] className=new String[99],key=new String[99];

    private static LoginVariable LoginVariableObject = new LoginVariable();

    private static ClassesVariable ClassesVariableObject = new ClassesVariable();

    public static void getClassInfo() {

        String query = "";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-JLHJV1C:1433;databaseName=school_management;user=rifat;password=rifat2221;";

            Connection connection;
            ResultSet rs;
            connection = DriverManager.getConnection(connectionUrl);

            query = "select * from class where t_user_name=?";

            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, LoginVariableObject.loginUser_name);

            rs = pst.executeQuery();
            int i = 0;
            
            while (rs.next()) {

                ClassesVariableObject.key[i] = rs.getString("c_key");
                ClassesVariableObject.className[i] = rs.getString("c_name");
                
//                ClassesVariableObject.classList.add(rs.getString("c_key"));
//                ClassesVariableObject.keyList.add(rs.getString("c_name"));
                
                System.out.println(ClassesVariableObject.key[i]+"data "+ClassesVariableObject.className[i]+LoginVariableObject.loginUser_name);
                i++;

            }
            ClassesVariableObject.counter=i;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("teacher.GetClasses.getClassInfo");

        }

    }
    public static void main(String[] args)
    {
        
    }

}
