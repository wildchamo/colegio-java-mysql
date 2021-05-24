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
public class Course {
    private int courseID;
    private String nameC;
    private String classroom;
    private String imgCourse;

    public Course() {
    }

    public Course(String nameC, String classroom, String imgCourse) {
        this.nameC = nameC;
        this.classroom = classroom;
        this.imgCourse = imgCourse;
    }

    public Course(int courseID, String nameC, String classroom, String imgCourse) {
        this.courseID = courseID;
        this.nameC = nameC;
        this.classroom = classroom;
        this.imgCourse = imgCourse;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getImgCourse() {
        return imgCourse;
    }

    public void setImgCourse(String imgCourse) {
        this.imgCourse = imgCourse;
    }

    @Override
    public String toString() {
        return "course{" + "courseID=" + courseID + ", nameC=" + nameC + ", classroom=" + classroom + ", imgCourse=" + imgCourse + '}';
    }

}
