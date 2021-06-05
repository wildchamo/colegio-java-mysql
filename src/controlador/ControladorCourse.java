/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.Course;

/**
 *
 * @author wild.chamo
 */
public class ControladorCourse {

    public boolean insertCourse(Course objc) {
        boolean t = false;
        String sql = "insert into courses(nameCourse,classroom,imgCourse) value(?,?,?);";
        Course objbc = new Course();
        t = objbc.insertCourse(sql, objc);
        return t;
    }

    public LinkedList<Course> consultarCursos() {
        LinkedList<Course> lc = null;
        String sql = "select * from courses;";
        Course objco = new Course();
        lc = objco.consultarCursos(sql);

        return lc;
    }
public boolean EliminarCourse(int IDCourse) {
        boolean E = false;
        String sql = "delete from courses where courseID= "+IDCourse+ ";";
        BaseDatos objbd = new BaseDatos();
        E = objbd.ejecutarSQL(sql);
        return E;
    }
    public LinkedList<Course> consultarCursoPorID(int cursoID) {
        LinkedList<Course> lc = null;
        String sql = "select * from courses WHERE courseID=" + cursoID + ";";
        Course objco = new Course();
        lc = objco.consultarCursos(sql);

        return lc;
    }

}
