/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.MateriaId;
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

    public LinkedList<MateriaId> MostrarMateriaID(int idProfe,int idCurso) {
        LinkedList<MateriaId> ls = null;
        String sql = "call VerMateriasProfe(" + idProfe +","+idCurso+ ");";
        Subject objc = new Subject();
        ls = objc.MostrarMateriaID(sql);
        return ls;
    }
    
      public boolean actualizarAsignatura(Subject objc, int id) {
        boolean t = false;
        String sql = "UPDATE subjects SET `nameSub`= ? WHERE subjectID = " + id;
        t = objc.actualizarAsignatura(sql, objc);

        return t;
    }
          public boolean EliminarSubject(int IDsub) {
        boolean E = false;
        String sql = "delete from subjects where subjectID= "+IDsub+ ";";
        BaseDatos objbd = new BaseDatos();
        E = objbd.ejecutarSQL(sql);
        return E;
    }

}
