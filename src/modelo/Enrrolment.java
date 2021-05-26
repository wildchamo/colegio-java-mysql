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
    private String date;
    private String studyDay;
    private int courseIDfk;
    private int studentIDfk;

    public Enrrolment() {
    }

    public Enrrolment(int enrrolmentID, String date, String studyDay, int courseIDfk, int studentIDfk) {
        this.enrrolmentID = enrrolmentID;
        this.date = date;
        this.studyDay = studyDay;
        this.courseIDfk = courseIDfk;
        this.studentIDfk = studentIDfk;
    }

    public Enrrolment(String date, String studyDay, int courseIDfk, int studentIDfk) {
        this.date = date;
        this.studyDay = studyDay;
        this.courseIDfk = courseIDfk;
        this.studentIDfk = studentIDfk;
    }

    public int getEnrrolmentID() {
        return enrrolmentID;
    }

    public void setEnrrolmentID(int enrrolmentID) {
        this.enrrolmentID = enrrolmentID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStudyDay() {
        return studyDay;
    }

    public void setStudyDay(String studyDay) {
        this.studyDay = studyDay;
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
        return "Enrrolment{" + "enrrolmentID=" + enrrolmentID + ", date=" + date + ", studyDay=" + studyDay + ", courseIDfk=" + courseIDfk + ", studentIDfk=" + studentIDfk + '}';
    }



 
    
    
}
