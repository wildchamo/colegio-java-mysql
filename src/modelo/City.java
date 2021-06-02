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
public class City {

    private int idCity;
    private String nameC;

    public City() {
    }

    public City(int idCity, String nameC) {
        this.idCity = idCity;
        this.nameC = nameC;
    }

    public City(String nameC) {
        this.nameC = nameC;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    @Override
    public String toString() {
        return "City{" + "idCity=" + idCity + ", nameC=" + nameC + '}';
    }

    public LinkedList<City> consultarCiudades(String sql) {
        BaseDatos objbd = new BaseDatos();
        LinkedList<City> lc = new LinkedList<>();
        ResultSet rs;
        int idc;
        String nomc;

        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("idCity");
                    nomc = rs.getString("nameC");

                    lc.add(new City(idc, nomc));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gender.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return lc;

    }
    public boolean actualizarCiudad(String sql, City objc) {

        boolean t = false;
        BaseDatos objbd = new BaseDatos();
        PreparedStatement pst = null;
        if(objbd.crearConexion()){
            try{
                pst = objbd.getConexion().prepareStatement(sql);
                pst.setString(1, objc.getNameC());
                pst.executeUpdate();
                t= true;

            }catch (SQLException ex){
                Logger.getLogger(City.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
        return t;
}

}
