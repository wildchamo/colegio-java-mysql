/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.BaseDatos;
import modelo.Teacher;

/**
 *
 * @author wild.chamo
 */
public class ControladorTeacher {

    public boolean insertTeacher(Teacher objs) {
        boolean t = false;
        String sql = "insert into teachers(name1T,name2T,surname1T,surname2T,mobileT,adressT,stratumT,institutionalEmailT,businessPositionT,workDayT,userT,passwordT,idCitiesfk,idGenderfk) values('" + objs.getName1T() + "','" + objs.getName2T() + "','" + objs.getSuname1T() + "','" + objs.getSuname2T() + "','" + objs.getMobileT() + "','" + objs.getAddressT() + "','" + objs.getStratumT() + "','" + objs.getInstitutionalEmailT() + "','" + objs.getBusinessPositionT() + "','" + objs.getWorkDay() + "','" + objs.getUserT() + "','" + objs.getPasswordT() + "','" + objs.getIdCityfk() + "','" + objs.getIdGenderfk() + "');";
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql);
        return t;
    }
}
