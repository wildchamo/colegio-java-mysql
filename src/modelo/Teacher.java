/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wild.chamo
 */
public class Teacher {

    private int teacherID;
    private String name1T;
    private String name2T;
    private String suname1T;
    private String suname2T;
    private String mobileT;
    private String addressT;
    private String stratumT;
    private String institutionalEmailT;
    private String businessPositionT;
    private String workDay;
    private String userT;
    private String passwordT;
    private int idCityfk;
    private int idGenderfk;

    public Teacher() {
    }

    public Teacher(String name1T, String name2T, String suname1T, String suname2T, String mobileT, String addressT, String stratumT, String institutionalEmailT, String businessPositionT, String workDay, String userT, String passwordT, int idCityfk, int idGenderfk) {
        this.name1T = name1T;
        this.name2T = name2T;
        this.suname1T = suname1T;
        this.suname2T = suname2T;
        this.mobileT = mobileT;
        this.addressT = addressT;
        this.stratumT = stratumT;
        this.institutionalEmailT = institutionalEmailT;
        this.businessPositionT = businessPositionT;
        this.workDay = workDay;
        this.userT = userT;
        this.passwordT = passwordT;
        this.idCityfk = idCityfk;
        this.idGenderfk = idGenderfk;
    }

    public Teacher(int teacherID, String name1T, String name2T, String suname1T, String suname2T, String mobileT, String addressT, String stratumT, String institutionalEmailT, String businessPositionT, String workDay, String userT, String passwordT, int idCityfk, int idGenderfk) {
        this.teacherID = teacherID;
        this.name1T = name1T;
        this.name2T = name2T;
        this.suname1T = suname1T;
        this.suname2T = suname2T;
        this.mobileT = mobileT;
        this.addressT = addressT;
        this.stratumT = stratumT;
        this.institutionalEmailT = institutionalEmailT;
        this.businessPositionT = businessPositionT;
        this.workDay = workDay;
        this.userT = userT;
        this.passwordT = passwordT;
        this.idCityfk = idCityfk;
        this.idGenderfk = idGenderfk;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getName1T() {
        return name1T;
    }

    public void setName1T(String name1T) {
        this.name1T = name1T;
    }

    public String getName2T() {
        return name2T;
    }

    public void setName2T(String name2T) {
        this.name2T = name2T;
    }

    public String getSuname1T() {
        return suname1T;
    }

    public void setSuname1T(String suname1T) {
        this.suname1T = suname1T;
    }

    public String getSuname2T() {
        return suname2T;
    }

    public void setSuname2T(String suname2T) {
        this.suname2T = suname2T;
    }

    public String getMobileT() {
        return mobileT;
    }

    public void setMobileT(String mobileT) {
        this.mobileT = mobileT;
    }

    public String getAddressT() {
        return addressT;
    }

    public void setAddressT(String addressT) {
        this.addressT = addressT;
    }

    public String getStratumT() {
        return stratumT;
    }

    public void setStratumT(String stratumT) {
        this.stratumT = stratumT;
    }

    public String getInstitutionalEmailT() {
        return institutionalEmailT;
    }

    public void setInstitutionalEmailT(String institutionalEmailT) {
        this.institutionalEmailT = institutionalEmailT;
    }

    public String getBusinessPositionT() {
        return businessPositionT;
    }

    public void setBusinessPositionT(String businessPositionT) {
        this.businessPositionT = businessPositionT;
    }

    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public String getUserT() {
        return userT;
    }

    public void setUserT(String userT) {
        this.userT = userT;
    }

    public String getPasswordT() {
        return passwordT;
    }

    public void setPasswordT(String passwordT) {
        this.passwordT = passwordT;
    }

    public int getIdCityfk() {
        return idCityfk;
    }

    public void setIdCityfk(int idCityfk) {
        this.idCityfk = idCityfk;
    }

    public int getIdGenderfk() {
        return idGenderfk;
    }

    public void setIdGenderfk(int idGenderfk) {
        this.idGenderfk = idGenderfk;
    }

    @Override
    public String toString() {
        return "Teacher{" + "teacherID=" + teacherID + ", name1T=" + name1T + ", name2T=" + name2T + ", suname1T=" + suname1T + ", suname2T=" + suname2T + ", mobileT=" + mobileT + ", addressT=" + addressT + ", stratumT=" + stratumT + ", institutionalEmailT=" + institutionalEmailT + ", businessPositionT=" + businessPositionT + ", workDay=" + workDay + ", userT=" + userT + ", passwordT=" + passwordT + ", idCityfk=" + idCityfk + ", idGenderfk=" + idGenderfk + '}';
    }

    public LinkedList<Teacher> consultarProfesores(String sql) {
        BaseDatos objbd = new BaseDatos();
        LinkedList<Teacher> lt = new LinkedList<>();
        ResultSet rs;

         int idt;
        String nomt;
        String nomt2;
        String surnamet;
        String surname2t;
        String mobilet;
        String addresst;
        String stratumt;
        String insEmailt;
        String busPosT;
        String workDayT;
        String userT;
        String passT;
        int IdGender;
        int IdCity;
        
                if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idt = rs.getInt("teacherID");
                    nomt = rs.getString("name1T");
                    nomt2 = rs.getString("name2T");
                    surnamet = rs.getString("surname1T");
                    surname2t = rs.getString("surname2T");
                    mobilet = rs.getString("mobileT");
                    addresst = rs.getString("adressT");
                    stratumt=rs.getString("stratumT");
                    insEmailt = rs.getString("institutionalEmailT");
                    busPosT = rs.getString("businessPositionT");
                    workDayT = rs.getString("workDayT");
                    userT = rs.getString("userT");
                    passT = rs.getString("passwordT");
                    IdGender = rs.getInt("idGenderfk");
                    IdCity = rs.getInt("idcitiesfk");

                    lt.add(new Teacher(idt, nomt, nomt2, surnamet, surname2t,mobilet,addresst,stratumt,insEmailt,busPosT,workDayT,userT,passT,IdGender,IdCity));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gender.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return lt;
    }
    
    
        public LinkedList <ProfesorCursoAsignatura> buscarProfeCursoAsig(String sql){
        LinkedList<ProfesorCursoAsignatura> listaPCA= new LinkedList<>();
        ResultSet rs;
        int id;
        String nombreProfesor;
        String nombreCurso;
        String nombreAsignatura;
        BaseDatos objbd= new BaseDatos();
        if(objbd.crearConexion()){
            try{
                PreparedStatement st=objbd.getConexion().prepareStatement(sql);
                rs= st.executeQuery();
                while(rs.next()){
                    id= rs.getInt("ID");
                    nombreProfesor= rs.getString("NombreProfesor");
                    nombreCurso= rs.getString("NombreCurso");
                    nombreAsignatura= rs.getString("NombreAsignatura");
                    listaPCA.add(new ProfesorCursoAsignatura(id,nombreProfesor,nombreCurso,nombreAsignatura));
                }
            }catch(SQLException ex){
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        return listaPCA;
    }

}
