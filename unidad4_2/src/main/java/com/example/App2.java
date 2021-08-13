package com.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App2 
{
    public static void main( String[] args )
    {
        String url = "jdbc:sqlite:hr.db";
        Connection conn = null;
        /*Statement stmt = null;*/
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url);
            /*stmt = conn.createStatement();*/
            //stmt.executeUpdate(consulta);
            String sql = "INSERT INTO regions (region_name) VALUES ( ? )";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "South America");
            int i=pstmt.executeUpdate();  
            System.out.println(i+" records inserted");  
        } catch (SQLException e) {
        // Manejo de los errores
        } finally {
            try {
                if (rs != null){
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null){
                    conn.close();
                }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
        }
    }
}
