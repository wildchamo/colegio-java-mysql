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
public class Enrrolment {

    private int enrrolmentID;
    private int courseIDfk;
    private int studentIDfk;

    public Enrrolment() {
    }

    public Enrrolment(int courseIDfk, int studentIDfk) {
        this.courseIDfk = courseIDfk;
        this.studentIDfk = studentIDfk;
    }

    public Enrrolment(int enrrolmentID, int courseIDfk, int studentIDfk) {
        this.enrrolmentID = enrrolmentID;
        this.courseIDfk = courseIDfk;
        this.studentIDfk = studentIDfk;
    }

    public int getEnrrolmentID() {
        return enrrolmentID;
    }

    public void setEnrrolmentID(int enrrolmentID) {
        this.enrrolmentID = enrrolmentID;
    }

    public int getCourseIDfk() {
        return courseIDfk;
    }

    public void setCourseIDfk(int courseIDfk) {
        this.courseIDfk = courseIDfk;
    }

    public int getStudentIDfk() {
        return studentIDfk;
    }

    public void setStudentIDfk(int studentIDfk) {
        this.studentIDfk = studentIDfk;
    }

    @Override
    public String toString() {
        return "Enrrolment{" + "enrrolmentID=" + enrrolmentID + ", courseIDfk=" + courseIDfk + ", studentIDfk=" + studentIDfk + '}';
    }
    
    
    
}
