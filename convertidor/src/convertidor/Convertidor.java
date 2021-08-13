/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

/**
 *
 * @author User
 */
public class Convertidor implements ConvertidorPeso{

    @Override
    public double KilogramoAGramo(double unidad) {
        return unidad*1000;
    }

    @Override
    public double OnzaAGramo(double unidad) {
        return unidad*0.91428;
    }

    @Override
    public double LibraAOnza(double unidad) {
        return unidad*16;
    }

    @Override
    public double ToneladaALibra(double unidad) {
        return unidad*2000;
    }

    
    
}
