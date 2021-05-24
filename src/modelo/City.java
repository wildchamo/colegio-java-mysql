/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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

}
