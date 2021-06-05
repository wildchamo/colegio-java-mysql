/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wild.chamo
 */
public class Gender {

    private int idGender;
    private String nameG;

    public Gender() {
    }

    public Gender(int idGender, String nameG) {
        this.idGender = idGender;
        this.nameG = nameG;
    }

    public Gender(String nameG) {
        this.nameG = nameG;
    }

    public int getIdGender() {
        return idGender;
    }

    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    public String getNameG() {
        return nameG;
    }

    public void setNameG(String nameG) {
        this.nameG = nameG;
    }

    @Override
    public String toString() {
        return "Gender{" + "idGender=" + idGender + ", nameG=" + nameG + '}';
    }

    public LinkedList<Gender> consultarGeneros(String sql) {
        BaseDatos objbd = new BaseDatos();
        LinkedList<Gender> lg = new LinkedList<>();
        ResultSet rs;
        int idc;
        String nomc;

        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("idGender");
                    nomc = rs.getString("nameG");

                    lg.add(new Gender(idc, nomc));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gender.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return lg;
    }
    
    public boolean actualizarGenero(String sql, Gender objc) {

        boolean t = false;
        BaseDatos objbd = new BaseDatos();
        PreparedStatement pst = null;
        if(objbd.crearConexion()){
            try{
                pst = objbd.getConexion().prepareStatement(sql);
                pst.setString(1, objc.getNameG());
                pst.executeUpdate();
                t= true;

            }catch (SQLException ex){
                Logger.getLogger(Gender.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
        return t;
}
}


