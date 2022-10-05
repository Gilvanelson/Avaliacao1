package entities;

import java.util.Date;

public class Carro extends Modelo {
    protected String chassi;
    protected String cor;
    protected int anoFabricacao;
    protected int anoModelo;
    protected Date dataEntrada;

    public Carro(int codigo, String nome, String descricao, int codigo2, String marca, String nome2, double motor,
            int serie, String chassi, String cor, int anoFabricacao, int anoModelo, Date dataEntrada) {
        super(codigo, nome, descricao, codigo2, marca, nome2, motor, serie);
        this.chassi = chassi;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.dataEntrada = dataEntrada;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

}
