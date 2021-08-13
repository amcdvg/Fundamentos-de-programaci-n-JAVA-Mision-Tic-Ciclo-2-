package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpleadoDao {

    Connection conexion;

    public EmpleadoDao(){
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:empleado.db");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void insertar(Empleado empleado){
        String sql = "insert into Empleado (nombre, edad, email) values (?,?,?)";
        try {
            PreparedStatement pstm = conexion.prepareStatement(sql);
            pstm.setString(1, empleado.getNombre());
            pstm.setInt(2, empleado.getEdad());
            pstm.setString(3, empleado.getEmail());
            pstm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void actualizar(Empleado empleado){
        String sql = "update Empleado set edad=?, email=? where nombre=?";
        try {
            PreparedStatement pstm = conexion.prepareStatement(sql);
            pstm.setInt(1,empleado.getEdad());
            pstm.setString(2, empleado.getEmail());
            pstm.setString(3, empleado.getNombre());
            pstm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void eliminar(Empleado empleado){
        String sql = "delete from Empleado where nombre=?";
        try {
            PreparedStatement pstm = conexion.prepareStatement(sql);            
            pstm.setString(1, empleado.getNombre());
            pstm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ModeloDatos consultar(){
        ModeloDatos modelo = new ModeloDatos();
        String sql = "select * from Empleado";
        try {
            Statement stmt = conexion.createStatement();
            ResultSet resultado = stmt.executeQuery(sql);
            ArrayList<Empleado> listaEmpleados = new ArrayList<>();            
            
            while(resultado.next()){
                String nombre = resultado.getString(1);
                int edad = resultado.getInt(2);
                String email = resultado.getString(3);
                Empleado empleado = new Empleado(nombre, email, edad);
                listaEmpleados.add(empleado);
            }
            Object [][] lista= new Object[listaEmpleados.size()][3];
            for(int i = 0; i < listaEmpleados.size();i++){
                lista[i][0]=listaEmpleados.get(i).getNombre();
                lista[i][1]=listaEmpleados.get(i).getEmail();
                lista[i][2]=listaEmpleados.get(i).getEdad();
            }
            
            modelo.datos = lista;            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return modelo;
    }
    
}
