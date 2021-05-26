/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Enrrolment;
import modelo.BaseDatos;
import modelo.Course;
import modelo.Student;
/**
 *
 * @author wild.chamo
 */
public class ControladorEnrrolment {
        public boolean asignarCurso(Enrrolment matricula,Student estudiante, Course curso){
        boolean t = false;
        String sql = "INSERT INTO enrrolments (studyDay,studentIDfk,courseIDfk ) VALUE(" + matricula.getStudyDay() + "," + estudiante.getStudentID() + "," + curso.getCourseID() + ")";
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql); 
        return t;
    }
}
