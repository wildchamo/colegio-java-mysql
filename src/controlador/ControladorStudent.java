/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.Student;

/**
 *
 * @author wild.chamo
 */
public class ControladorStudent {

    public boolean insertStudent(Student objs) {
        boolean t = false;
        String sql = "insert into students(name1S,name2S,surname1S,surname2S,mobileS,adressS,stratumS,institutionalEmailS,custodianMobile1,custodianMobile2,userS,passwordS,idCitiesfk,idGenderfk) values('" + objs.getName1S() + "','" + objs.getName2S() + "','" + objs.getSuname1S() + "','" + objs.getSuname2S() + "','" + objs.getMobileS() + "','" + objs.getAddressS() + "','" + objs.getStratumS() + "','" + objs.getInstitutionalEmailS() + "','" + objs.getCustodianMobile1() + "','" + objs.getCustodianMobile2() + "','" + objs.getUserS() + "','" + objs.getPasswordS() + "','" + objs.getIdCityfk() + "','" + objs.getIdGenderfk() + "');";
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql);
        return t;
    }

    public LinkedList<Student> consultarEstudiantes() {
        LinkedList<Student> ls = null;
        String sql = "select * from students;";
        Student objc = new Student();
        ls = objc.consultarEstudiantes(sql);
        return ls;
    }

    public LinkedList<Student> consultarEstudiantesPorCurso(int idCurso) {
        LinkedList<Student> ls = null;
        String sql = "SELECT *  FROM STUDENTS s, enrollments e WHERE s.studentID=e.idStudentfk and e.idCoursefk=" + idCurso + ";";
        Student objc = new Student();
        ls = objc.consultarEstudiantes(sql);
        return ls;
    }
    
    public boolean validarUsuario(String usuario,String contrasenia){
        boolean t=false;
        String sql= "SELECT * FROM STUDENTS WHERE userS='"+ usuario +"' AND passwordS='"+ contrasenia+ "';";
        BaseDatos objbd= new BaseDatos();
        t=objbd.ejecutarSQLQ(sql);
        return t;
        
    }
    
         public boolean MostrarNotas(int idEstudiante) {
        boolean t = false;
        String sql = "{call mostrarNotasEstudiante("+ idEstudiante + ");";
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql);
        return t;
    }

}
