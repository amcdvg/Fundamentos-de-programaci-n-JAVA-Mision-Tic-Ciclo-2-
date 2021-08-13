package com.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App4 {
    public static void main (String args []){
        String url = "jdbc:sqlite:hr.db";
        Connection conn = null;
        Statement stmt = null;        
        try{
            conn = DriverManager.getConnection(url);
            stmt = (Statement) conn.createStatement();
            int id = 8;
            String sql = "delete from regions where region_id="+id;
            int filasModificadas = stmt.executeUpdate(sql);
            System.out.println(filasModificadas+" filas borradas");
        }catch(SQLException exception){
            System.out.println(exception.getMessage());
        }
    }
}
