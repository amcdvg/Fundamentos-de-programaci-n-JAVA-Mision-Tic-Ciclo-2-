package com.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
/*import java.sql.ResultSetMetaData;*/

public class App 
{
    public static void main( String[] args )
    {
        String url = "jdbc:sqlite:hr.db";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees");
            /*ResultSetMetaData meta = rs.getMetaData();
            int contadorColumnas = meta.getColumnCount();
            System.out.println(contadorColumnas);
            for(int i = 1 ; i < contadorColumnas;i++){
                System.out.println(meta.getColumnName(i));
            }*/
            
            while (rs.next()) {                
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");
                String telefono = rs.getString("phone_number");
                System.out.println(nombre+"-"+apellido+"-"+telefono);
            }
            rs.close();
        } catch (SQLException e) {
        // Manejo de los errores
        } finally {
            try {
                if (rs != null){
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
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
