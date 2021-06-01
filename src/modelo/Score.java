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
public class Score {
    private int idScore;
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int idsubject_by_courseIDfk;
    private int studentIDfk;

    public Score(int idScore, int score1, int score2, int score3, int score4, int idsubject_by_courseIDfk, int studentIDfk) {
        this.idScore = idScore;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.idsubject_by_courseIDfk = idsubject_by_courseIDfk;
        this.studentIDfk = studentIDfk;
    }

    public Score() {
    }

    public Score(int score1, int score2, int score3, int score4, int idsubject_by_courseIDfk, int studentIDfk) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.idsubject_by_courseIDfk = idsubject_by_courseIDfk;
        this.studentIDfk = studentIDfk;
    }

    public int getIdScore() {
        return idScore;
    }

    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public int getScore4() {
        return score4;
    }

    public void setScore4(int score4) {
        this.score4 = score4;
    }

    public int getIdsubject_by_courseIDfk() {
        return idsubject_by_courseIDfk;
    }

    public void setIdsubject_by_courseIDfk(int idsubject_by_courseIDfk) {
        this.idsubject_by_courseIDfk = idsubject_by_courseIDfk;
    }

    public int getStudentIDfk() {
        return studentIDfk;
    }

    public void setStudentIDfk(int studentIDfk) {
        this.studentIDfk = studentIDfk;
    }

    @Override
    public String toString() {
        return "Score{" + "idScore=" + idScore + ", score1=" + score1 + ", score2=" + score2 + ", score3=" + score3 + ", score4=" + score4 + ", idsubject_by_courseIDfk=" + idsubject_by_courseIDfk + ", studentIDfk=" + studentIDfk + '}';
    }
    
    
    
    
    
}
