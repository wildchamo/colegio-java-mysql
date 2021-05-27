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
public class SubjectByCourse {
    private int idsubject_by_courseID;
    private int subjectIDfk;
    private int courseIDfk;
    private int teacherIDfk;

    public SubjectByCourse() {
    }

    public SubjectByCourse(int idsubject_by_courseID, int subjectIDfk, int courseIDfk, int teacherIDfk) {
        this.idsubject_by_courseID = idsubject_by_courseID;
        this.subjectIDfk = subjectIDfk;
        this.courseIDfk = courseIDfk;
        this.teacherIDfk = teacherIDfk;
    }

    public int getIdsubject_by_courseID() {
        return idsubject_by_courseID;
    }

    public void setIdsubject_by_courseID(int idsubject_by_courseID) {
        this.idsubject_by_courseID = idsubject_by_courseID;
    }

    public int getSubjectIDfk() {
        return subjectIDfk;
    }

    public void setSubjectIDfk(int subjectIDfk) {
        this.subjectIDfk = subjectIDfk;
    }

    public int getCourseIDfk() {
        return courseIDfk;
    }

    public void setCourseIDfk(int courseIDfk) {
        this.courseIDfk = courseIDfk;
    }

    public int getTeacherIDfk() {
        return teacherIDfk;
    }

    public void setTeacherIDfk(int teacherIDfk) {
        this.teacherIDfk = teacherIDfk;
    }

    @Override
    public String toString() {
        return "SubjectByCourse{" + "idsubject_by_courseID=" + idsubject_by_courseID + ", subjectIDfk=" + subjectIDfk + ", courseIDfk=" + courseIDfk + ", teacherIDfk=" + teacherIDfk + '}';
    }
    
    
    
}
