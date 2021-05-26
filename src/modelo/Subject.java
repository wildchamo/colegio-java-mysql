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
public class Subject {
    private int subjectID;
    private String nameSub;

    public Subject(String nameSub) {
        this.nameSub = nameSub;
    }

    public Subject(int subjectID, String nameSub) {
        this.subjectID = subjectID;
        this.nameSub = nameSub;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getNameSub() {
        return nameSub;
    }

    public void setNameSub(String nameSub) {
        this.nameSub = nameSub;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectID=" + subjectID + ", nameSub=" + nameSub + '}';
    }
}
