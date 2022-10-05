package entities;

import java.util.ArrayList;

public class Turma {

    private String codigoDaTurma;
    private String turno;
    private Integer sala;

    ArrayList<Aluno> aluno;

    public Turma() {
    }

    public Turma(String codigoDaTurma, String turno, Integer sala, Aluno aluno) {
        this.codigoDaTurma = codigoDaTurma;
        this.turno = turno;
        this.sala = sala;
    }

    public String getCodigoDaTurma() {
        return codigoDaTurma;
    }

    public void setCodigoDaTurma(String codigoDaTurma) {
        this.codigoDaTurma = codigoDaTurma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

}
