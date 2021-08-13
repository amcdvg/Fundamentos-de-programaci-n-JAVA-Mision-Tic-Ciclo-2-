package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;


public class LiderDao {

    Connection conexion;

    public LiderDao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Lider> requerimiento1() throws SQLException {
        ArrayList<Lider> lista = new ArrayList<>();
        String sql = "select Nombre, Primer_Apellido, Segundo_Apellido from Lider where Primer_Apellido='Perez' or Segundo_Apellido='Perez'";
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while(resultados.next()){
            Lider lider = new Lider();
            lider.setNombre(resultados.getString(1));
            lider.setPrimer_Apellido(resultados.getString(2));
            lider.setSegundo_Apellido(resultados.getString(3));
            lista.add(lider);
        }
        return lista;
    }
}