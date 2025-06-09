package Classes.Pecas;

public class Freio implements Peca {
    private String nome;
    private double valor;

    public Freio(double valor){
        this.nome = "Freio";
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
