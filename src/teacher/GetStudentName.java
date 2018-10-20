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

/**
 *
 * @author hp
 */
public class GetStudentName {
    
    private static ClassesVariable ClassesVariableObject = new ClassesVariable();
    
    public static void main(String[] args) {

    }

    public static   void get(int i) {
        int check = 0;
        String query = "";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-JLHJV1C:1433;databaseName=school_management;user=rifat;password=rifat2221;";

            Connection connection;
            ResultSet rs;
            connection = DriverManager.getConnection(connectionUrl);
            
                query = "select * from student where s_user_name=?";
            
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, ClassesVariable.studentUserName[i]);
            
            rs = pst.executeQuery();
            if(rs.next()) {
                
                    ClassesVariableObject.studentName[i]=rs.getString("s_name");
                
               

            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        
    }
    
}
