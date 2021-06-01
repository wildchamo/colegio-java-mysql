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
public class vistaEstudianteCurso {
    
    private String nombreEstudiante;
    private String  nameCourse;

    public vistaEstudianteCurso(String nombreEstudiante, String nameCourse) {
        this.nombreEstudiante = nombreEstudiante;
        this.nameCourse = nameCourse;
    }
    
    

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    @Override
    public String toString() {
        return "vistaEstudianteCurso{" + "nombreEstudiante=" + nombreEstudiante + ", nameCourse=" + nameCourse + '}';
    }
    
    
}
