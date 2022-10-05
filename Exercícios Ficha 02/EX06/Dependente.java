package entities;

import java.util.Date;

public class Dependente {
    private int sequencial;
    private String nomeCompleto;
    private Date dataNascimento;
    private char sexo;
    private boolean participaPlano;
    private Funcionario funcionario;

    public Dependente() {
    }

    public Dependente(int sequencial, String nomeCompleto, Date dataNascimento, char sexo, boolean participaPlano) {
        this.sequencial = sequencial;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.participaPlano = participaPlano;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isParticipaPlano() {
        return participaPlano;
    }

    public void setParticipaPlano(boolean participaPlano) {
        this.participaPlano = participaPlano;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
