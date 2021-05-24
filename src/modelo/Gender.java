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
}
