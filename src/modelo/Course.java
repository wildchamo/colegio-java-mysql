/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public boolean insertCourse(String sql, Course objc) {

        boolean t = false;
        FileInputStream fis = null;
        File file = new File(objc.getImgCourse());
        PreparedStatement pst = null;

        BaseDatos objbd = new BaseDatos();
        if (objbd.crearConexion()) {
            try {
                fis = new FileInputStream(file);
                pst = objbd.getConexion().prepareStatement(sql);
                pst.setString(1, objc.getNameC());
                pst.setString(2, objc.getClassroom());
                pst.setBinaryStream(3, fis, (int) file.length());
                pst.executeUpdate();
             //   objbd.getConexion().commit();
                t=true;
            } catch (SQLException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return t;
    }

}
