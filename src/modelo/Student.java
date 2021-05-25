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
public class Student {
    private int studentID;
    private String name1S;
    private String name2S;
    private String suname1S;
    private String suname2S;
    private String mobileS;
    private String addressS;
    private String stratumS;
    private String institutionalEmailS;
    private String custodianMobile1;
    private String custodianMobile2;
    private String userS;
    private String passwordS;
    private int idCityfk;
    private int idGenderfk;

    public Student() {
    }

    public Student(String name1S, String name2S, String suname1S, String suname2S, String mobileS, String addressS, String stratumS, String institutionalEmailS, String custodianMobile1, String custodianMobile2, String userS, String passwordS, int idCityfk, int idGenderfk) {
        this.name1S = name1S;
        this.name2S = name2S;
        this.suname1S = suname1S;
        this.suname2S = suname2S;
        this.mobileS = mobileS;
        this.addressS = addressS;
        this.stratumS = stratumS;
        this.institutionalEmailS = institutionalEmailS;
        this.custodianMobile1 = custodianMobile1;
        this.custodianMobile2 = custodianMobile2;
        this.userS = userS;
        this.passwordS = passwordS;
        this.idCityfk = idCityfk;
        this.idGenderfk = idGenderfk;
    }

    public Student(int studentID, String name1S, String name2S, String suname1S, String suname2S, String mobileS, String addressS, String stratumS, String institutionalEmailS, String custodianMobile1, String custodianMobile2, String userS, String passwordS, int idCityfk, int idGenderfk) {
        this.studentID = studentID;
        this.name1S = name1S;
        this.name2S = name2S;
        this.suname1S = suname1S;
        this.suname2S = suname2S;
        this.mobileS = mobileS;
        this.addressS = addressS;
        this.stratumS = stratumS;
        this.institutionalEmailS = institutionalEmailS;
        this.custodianMobile1 = custodianMobile1;
        this.custodianMobile2 = custodianMobile2;
        this.userS = userS;
        this.passwordS = passwordS;
        this.idCityfk = idCityfk;
        this.idGenderfk = idGenderfk;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName1S() {
        return name1S;
    }

    public void setName1S(String name1S) {
        this.name1S = name1S;
    }

    public String getName2S() {
        return name2S;
    }

    public void setName2S(String name2S) {
        this.name2S = name2S;
    }

    public String getSuname1S() {
        return suname1S;
    }

    public void setSuname1S(String suname1S) {
        this.suname1S = suname1S;
    }

    public String getSuname2S() {
        return suname2S;
    }

    public void setSuname2S(String suname2S) {
        this.suname2S = suname2S;
    }

    public String getMobileS() {
        return mobileS;
    }

    public void setMobileS(String mobileS) {
        this.mobileS = mobileS;
    }

    public String getAddressS() {
        return addressS;
    }

    public void setAddressS(String addressS) {
        this.addressS = addressS;
    }

    public String getStratumS() {
        return stratumS;
    }

    public void setStratumS(String stratumS) {
        this.stratumS = stratumS;
    }

    public String getInstitutionalEmailS() {
        return institutionalEmailS;
    }

    public void setInstitutionalEmailS(String institutionalEmailS) {
        this.institutionalEmailS = institutionalEmailS;
    }

    public String getCustodianMobile1() {
        return custodianMobile1;
    }

    public void setCustodianMobile1(String custodianMobile1) {
        this.custodianMobile1 = custodianMobile1;
    }

    public String getCustodianMobile2() {
        return custodianMobile2;
    }

    public void setCustodianMobile2(String custodianMobile2) {
        this.custodianMobile2 = custodianMobile2;
    }

    public String getUserS() {
        return userS;
    }

    public void setUserS(String userS) {
        this.userS = userS;
    }

    public String getPasswordS() {
        return passwordS;
    }

    public void setPasswordS(String passwordS) {
        this.passwordS = passwordS;
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
        return "Student{" + "studentID=" + studentID + ", name1S=" + name1S + ", name2S=" + name2S + ", suname1S=" + suname1S + ", suname2S=" + suname2S + ", mobileS=" + mobileS + ", addressS=" + addressS + ", stratumS=" + stratumS + ", institutionalEmailS=" + institutionalEmailS + ", custodianMobile1=" + custodianMobile1 + ", custodianMobile2=" + custodianMobile2 + ", userS=" + userS + ", passwordS=" + passwordS + ", idCityfk=" + idCityfk + ", idGenderfk=" + idGenderfk + '}';
    }
    
    
    
    
}
