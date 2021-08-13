package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductoDAO {
    Connection conexion;

    public ProductoDAO(){
        String url = "jdbc:sqlite:tienda.db";
        try {
            conexion = DriverManager.getConnection(url);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String insertar(Producto producto){
        try {
            String sql = "insert into Productos (ID, Nombre, Categoria) values (?,?,?)";
            PreparedStatement pstm = conexion.prepareStatement(sql);
            pstm.setInt(1, producto.getID());
            pstm.setString(2, producto.getNombre());
            pstm.setString(3, producto.getCategoria());
            pstm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Producto creado con exito";
    }

    public String modificar(Producto producto){
        String sql = "update Productos set Nombre=?, Categoria=? where ID=?";

        try {
            PreparedStatement pstm = conexion.prepareStatement(sql);
            pstm.setString(1, producto.getNombre());
            pstm.setString(2, producto.getCategoria());
            pstm.setInt(3, producto.getID());
            pstm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Producto actualizado con exito";
    }

    public String eliminar(Producto producto){
        String sql = "delete from Productos where ID=?";

        try {
            PreparedStatement pstm = conexion.prepareStatement(sql);
            pstm.setInt(1, producto.getID());            
            pstm.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Producto actualizado con exito";
    }

    public ModeloProducto consultar(){
        ModeloProducto modelo=null;
        String sql = "SELECT * from Productos";
        try {
            Statement stmt = conexion.createStatement();
            ResultSet resultado= stmt.executeQuery(sql);
            ArrayList<Producto>lista=new ArrayList<>();
            while(resultado.next()){
                int id = resultado.getInt(1);
                String nombre = resultado.getString(2);
                String categoria = resultado.getString(3);
                Producto producto = new Producto(id,nombre,categoria);
                lista.add(producto);
            }
            Object listaObjectos [][] = new Object [lista.size()][3];
            for(int i = 0; i < lista.size();i++){
                listaObjectos[i][0]=lista.get(i).getID();
                listaObjectos[i][1]=lista.get(i).getNombre();
                listaObjectos[i][2]=lista.get(i).getCategoria();
            }
            modelo = new ModeloProducto();
            modelo.datos = listaObjectos;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return modelo;
    }

}
