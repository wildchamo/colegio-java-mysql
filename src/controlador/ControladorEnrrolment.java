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
        public boolean asignarCurso(Enrrolment matricula,Student estudiante, int indexCurso){
        boolean t = false;
        String sql = "INSERT INTO enrollments(studyDay, idStudentfk, idCoursefk ) VALUE('" + matricula.getStudyDay() + "', " 
                + estudiante.getStudentID() + ", " +indexCurso+ ");";
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql); 
        return t;
    }
}
