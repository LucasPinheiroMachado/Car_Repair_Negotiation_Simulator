package Classes.Pecas;

public class Escape implements Peca {
    private String nome;
    private double valor;

    public Escape(double valor){
        this.nome = "Escape";
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
