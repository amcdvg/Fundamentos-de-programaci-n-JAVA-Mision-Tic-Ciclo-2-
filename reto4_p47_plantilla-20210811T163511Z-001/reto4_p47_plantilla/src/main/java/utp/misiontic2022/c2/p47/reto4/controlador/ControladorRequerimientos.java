package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.LiderDao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;

/*import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;*/


public class ControladorRequerimientos {
    
    LiderDao dao = new LiderDao();
    
    public ArrayList<Lider> consultarRequerimiento1() throws SQLException {
        return dao.requerimiento1();
    }

    /*public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        // Su código
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        // Su código
    }*/
}
