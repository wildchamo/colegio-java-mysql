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
public class MateriaId {
    private int idsubject_by_courseID;
    private String nameSub;

    public MateriaId(int idsubject_by_courseID, String nameSub) {
        this.idsubject_by_courseID = idsubject_by_courseID;
        this.nameSub = nameSub;
    }

    public MateriaId() {
    }

    public int getIdsubject_by_courseID() {
        return idsubject_by_courseID;
    }

    public void setIdsubject_by_courseID(int idsubject_by_courseID) {
        this.idsubject_by_courseID = idsubject_by_courseID;
    }

    public String getNameSub() {
        return nameSub;
    }

    public void setNameSub(String nameSub) {
        this.nameSub = nameSub;
    }

    @Override
    public String toString() {
        return "MateriaId{" + "idsubject_by_courseID=" + idsubject_by_courseID + ", nameSub=" + nameSub + '}';
    }
    
}
