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

    public LinkedList<Course> consultarCursoPorID(int cursoID) {
        LinkedList<Course> lc = null;
        String sql = "select * from courses WHERE courseID=" + cursoID + ";";
        Course objco = new Course();
        lc = objco.consultarCursos(sql);

        return lc;
    }
    
        public LinkedList<Course> MostrarCursosSbc(int idProfe) {
         LinkedList<Course> ls = null;
        String sql = "call mostrarCursos("+ idProfe + ");";
        Course objc = new Course();
        ls = objc.consultarCursos(sql);
        return ls;
    }
         public boolean actualizarCourse(Course objc, int id) {
        boolean t = false;
        String sql = "UPDATE courses SET `nameC`= ? WHERE idCourse = " + id;
        t = objc.actualizarCourse(sql, objc);

        return t;
    }
}
