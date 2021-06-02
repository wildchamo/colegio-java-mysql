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
public class ProfesorCursoAsignatura {
    private int id;
    private String nombreProfesor;
    private String nombreCurso;
    private String nombreAsignatura;

    public ProfesorCursoAsignatura(int id, String nombreProfesor, String nombreCurso, String nombreAsignatura) {
        this.id = id;
        this.nombreProfesor = nombreProfesor;
        this.nombreCurso = nombreCurso;
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    @Override
    public String toString() {
        return "ProfesorCursoAsignatura{" + "id=" + id + ", nombreProfesor=" + nombreProfesor + ", nombreCurso=" + nombreCurso + ", nombreAsignatura=" + nombreAsignatura + '}';
    }
    
    
    
}
