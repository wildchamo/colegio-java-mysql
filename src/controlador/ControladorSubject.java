/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.Subject;

/**
 *
 * @author wild.chamo
 */
public class ControladorSubject {

    public boolean insertSubject(Subject objs) {
        boolean t = false;
        String sql = "{call insertSubject('" + objs.getNameSub() + "')}";
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql);
        return t;
    }

    public LinkedList<Subject> consultarAsignaturas() {
        LinkedList<Subject> ls = null;
        String sql = "select * from subjects;";
        Subject objs = new Subject();
        ls = objs.consultarAsignaturas(sql);

        return ls;
    }
    
}


