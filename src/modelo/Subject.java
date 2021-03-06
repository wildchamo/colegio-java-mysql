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

    public Subject() {
//To change body of generated methods, choose Tools | Templates.
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

    public LinkedList<Subject> consultarAsignaturas(String sql) {
        BaseDatos objbd = new BaseDatos();
        LinkedList<Subject> lcs = new LinkedList<>();
        ResultSet rs;
        int ids;
        String noms;

        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    ids = rs.getInt("subjectID");
                    noms = rs.getString("nameSub");
                    lcs.add(new Subject(ids, noms));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Gender.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return lcs;
    }

    public LinkedList<MateriaId> MostrarMateriaID(String sql) {
        LinkedList<MateriaId> listaMI = new LinkedList<>();
        ResultSet rs;
        int id;
        String nameS;

        BaseDatos objbd = new BaseDatos();
        if(objbd.crearConexion()){
            try{
                PreparedStatement st=objbd.getConexion().prepareStatement(sql);
                rs= st.executeQuery();
                while(rs.next()){
                    id= rs.getInt("idsubject_by_courseID");
                    nameS= rs.getString("nameSub");
                    listaMI.add(new MateriaId(id,nameS));
                }
            }catch(SQLException ex){
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        return listaMI;
    }
    
         public boolean actualizarAsignatura(String sql, Subject objc) {

        boolean t = false;
        BaseDatos objbd = new BaseDatos();
        PreparedStatement pst = null;
        if(objbd.crearConexion()){
            try{
                pst = objbd.getConexion().prepareStatement(sql);
                pst.setString(1, objc.getNameSub());
                pst.executeUpdate();
                t= true;

            }catch (SQLException ex){
                Logger.getLogger(Subject.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
        return t;
}
}
