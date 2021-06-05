/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.Gender;
/**
 *
 * @author wild.chamo
 */
public class ControladorGender {
        public boolean insertGender(Gender objg) {
        boolean t=false;
        String sql="insert into genders(nameG) value('"+objg.getNameG()+"');";
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;              
    }
        public boolean actualizarGenero(Gender objc, int id) {
        boolean t = false;
        String sql = "UPDATE genders SET `nameG`= ? WHERE idGender = " + id;
        t = objc.actualizarGenero(sql, objc);

        return t;
    }
        
      public LinkedList<Gender> consultarGeneros() {
        LinkedList<Gender> lg=null;
        String sql="select * from genders;";
        Gender objc=new Gender();
        lg=objc.consultarGeneros(sql);
        
        return lg;
    }      
        
}
