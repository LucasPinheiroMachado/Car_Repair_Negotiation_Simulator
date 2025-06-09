package Classes.Pecas;

public class Bateria implements Peca {
    private String nome;
    private double valor;

    public Bateria(double valor){
        this.nome = "Bateria";
        this.valor = valor;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
