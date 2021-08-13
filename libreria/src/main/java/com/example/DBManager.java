package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager{

    Connection conexion;

    public void connect(){
        try {
            String url = "jdbc:sqlite:libreria.db";
            conexion = DriverManager.getConnection(url);
        } catch (SQLException e) {            
            e.printStackTrace();
        }
    }

    public void findID(int id){
        Statement stm=null;
        ResultSet rs=null;

        try {
            stm = conexion.createStatement();
            rs = stm.executeQuery("select * from libros where ISBN=" + id);
            while(rs.next()){
                String titulo = rs.getString("titulo");
                String fecha_publicacion = rs.getString("año_publicacion");
                System.out.println("Titulo " + titulo + ", Año " + fecha_publicacion);
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }

    }

    public void findAll(){
        Statement stm=null;
        ResultSet rs=null;

        try {
            stm = conexion.createStatement();
            rs = stm.executeQuery("select * from libros");
            while(rs.next()){
                int isbn = rs.getInt("ISBN");
                String titulo = rs.getString("titulo");
                String fecha_publicacion = rs.getString("año_publicacion");
                System.out.println("ISBN " + isbn + ", Titulo " + titulo + ", Año " + fecha_publicacion);
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }

    }

    public void getStock(int isbn){
        Statement stm=null;
        ResultSet rs=null;

        try {
            stm = conexion.createStatement();
            rs = stm.executeQuery("select * from libros_disponibles where ISBN = "+isbn);
            while(rs.next()){
                int cantidad_disponible = rs.getInt("cantidad");
                System.out.println("ISBN " + isbn + "Cantidad->" + cantidad_disponible);
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }

    }

    public void sellBook(int isbn, int cantidad){
        Statement stm=null;
        ResultSet rs=null;

        try {
            stm = conexion.createStatement();
            String sql = "insert into ventas_libros (ISBN, fecha_compra, unidades_vendidas) "+
            "values ("+isbn+",'2021-07-27',"+cantidad+")";
            int resultado = stm.executeUpdate(sql);
            System.out.println(resultado);
        } catch (SQLException e) {
            
            e.printStackTrace();
        }

    }

}