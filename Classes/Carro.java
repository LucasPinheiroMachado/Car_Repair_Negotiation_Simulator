package Classes;

import Classes.Pecas.*;

public class Carro {
    private String nome;
    private String fabricante;
    private int anoFabricacao;
    private double valor;
    private Motor motor;
    private Freio freio;
    private Bateria bateria;
    private Radiador radiador;
    private Escape escape;

    public Carro(String nome, String fabricante, int anoFabricacao, double valor) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
        this.motor = new Motor(valor * 0.30);
        this.freio = new Freio(valor * 0.10);
        this.bateria = new Bateria(valor * 0.05);
        this.radiador = new Radiador(valor * 0.08);
        this.escape = new Escape(valor * 0.07);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getanoFabricacao() {
        return this.anoFabricacao;
    }

    public void setanoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public Freio getFreio() {
        return this.freio;
    }

    public Bateria getBateria() {
        return this.bateria;
    }

    public Radiador getRadiador() {
        return this.radiador;
    }

    public Escape getEscape() {
        return this.escape;
    }
}
