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
        boolean t=false;
        String sql="insert into courses(nameCourse,classroom,imgCourse) value(?,?,?);";
        Course objbc=new Course();
        t=objbc.insertCourse(sql,objc);
        return t;
        } 
        
        public LinkedList<Course> consultarCursos() {
        LinkedList<Course> lg=null;
        String sql="select * from courses;";
        Course objc=new Course();
        lg=objc.consultarCursos(sql);
        
        return lg;
    }   
    
}
