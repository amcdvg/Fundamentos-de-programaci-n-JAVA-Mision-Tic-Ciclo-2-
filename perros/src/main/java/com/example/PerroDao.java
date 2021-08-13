package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PerroDao {

    Connection conexion;

    public void connect(){
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:mascotas.db");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Perro guardar(Perro perro){
        String sql = "insert into Perros (Nombre, Edad, Dueño) values (?,?,?)";
        try {
            PreparedStatement pstm = conexion.prepareStatement(sql);
            pstm.setString(1, perro.getNombre());
            pstm.setInt(2, perro.getEdad());
            pstm.setString(3, perro.getDueño());
            pstm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return perro;        
    }

    public void actualizar(Perro perro){
        String sql = "update Perros set Edad=?, Dueño=? where Nombre=?";
        try {
            PreparedStatement pstm = conexion.prepareStatement(sql);
            pstm.setInt(1, perro.getEdad());
            pstm.setString(2, perro.getDueño());
            pstm.setString(3, perro.getNombre());
            pstm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}
