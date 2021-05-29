/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.BaseDatos;
import modelo.Course;
import modelo.Subject;
import modelo.SubjectByCourse;
import modelo.Teacher;
/**
 *
 * @author wild.chamo
 */
public class ControladorSubjectByCourse {
        public boolean asignarMateriaCurso(int materia,int curso,int profesor){
        boolean t = false;
        String sql = "INSERT INTO subjects_by_course(subjectIDfk, courseIDfk, teacherIDfk ) VALUE(" + materia + ", " 
                + curso + ", " +profesor+ ");";
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql); 
        return t;
    }
    
}
