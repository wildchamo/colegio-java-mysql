/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.BaseDatos;
import modelo.Subject;

/**
 *
 * @author wild.chamo
 */
public class ControladorSubject {

    public boolean insertCity(Subject objs) {
        boolean t = false;
        String sql =  "call escuela.insertSubject('" + objs.getNameSub() + "');";
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql);
        return t;
    }
}
