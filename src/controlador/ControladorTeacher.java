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
           public boolean insertTeacher(Teacher objt) {
        boolean t=false;
        // cadena para modificar
        //String sql="insert into teacher(name1T,name2T,surname1S,surname2S,mobileS,adressS,stratumS,institutionalEmailS,custodianMobile1,custodianMobile2,userS,passwordS,idCitiesfk,idGenderfk) values('"+objt.getName1S()+"','"+objt.getName2S()+"','"+objt.getSuname1S()+"','"+objs.getSuname2S()+"','"+objs.getMobileS()+"','"+objs.getAddressS()+"','"+objs.getStratumS()+"','"+objs.getInstitutionalEmailS()+"','"+objs.getCustodianMobile1()+"','"+objs.getCustodianMobile2()+"','"+objs.getUserS()+"','"+objs.getPasswordS()+"','"+objs.getIdCityfk()+"','"+objs.getIdGenderfk()+"');";
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;              
    }
}
