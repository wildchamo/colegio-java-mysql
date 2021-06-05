/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Score;
import modelo.BaseDatos;
/**
 *
 * @author wild.chamo
 */
public class ControladorScore {
       public boolean insertScore(Score objs) {
        boolean t = false;
        String sql = "{call insertScore(" + objs.getScore1()+","+objs.getScore2()+ "," + objs.getScore3() + ","
                + objs.getScore4() +","+objs.getIdsubject_by_courseIDfk()+","+objs.getStudentIDfk()+")}";
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql);
        return t;
    }
}
