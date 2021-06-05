/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.City;

/**
 *
 * @author wild.chamo
 */
public class ControladorCity {

    public boolean insertCity(City objc) {
        boolean t = false;
        String sql = "insert into cities(nameC) value('" + objc.getNameC() + "');";
        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql);
        return t;
    }

    public LinkedList<City> consultarCiudades() {
        LinkedList<City> lg = null;
        String sql = "select * from cities;";
        City objc = new City();
        lg = objc.consultarCiudades(sql);

        return lg;
    }
        public boolean actualizarCiudad(City objc, int id) {
        boolean t = false;
        String sql = "UPDATE cities SET `nameC`= ? WHERE idCity = " + id;
        t = objc.actualizarCiudad(sql, objc);

        return t;
    }

        public LinkedList<City> consultarUnaCiudad(String nombreCiudad) {

        LinkedList<City> lc=null;
        String sql = "SELECT * FROM cities WHERE nameC='" + nombreCiudad +"'";
        City objc=new City();
        lc=objc.consultarCiudades(sql);
        return lc;
    }
            public boolean EliminarCiudad(int IDCiudad) {
        boolean E = false;
        String sql = "delete from cities where idCity= "+IDCiudad+ ";";
        BaseDatos objbd = new BaseDatos();
        E = objbd.ejecutarSQL(sql);
        return E;
    }
}
