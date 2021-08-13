package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App3 {
    public static void main (String args []){
        String url = "jdbc:sqlite:hr.db";
        Connection conn = null;        
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            conn = DriverManager.getConnection(url);
            String sql = "update regions set region_name=? where region_id=8";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Center America");
            int filasModificadas = pstmt.executeUpdate();
            System.out.println(filasModificadas);
        }catch(SQLException exception){
            System.out.println(exception.getMessage());
        }
    }
}
