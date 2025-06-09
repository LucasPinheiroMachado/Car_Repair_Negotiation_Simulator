package Classes.Pecas;

public class Radiador implements Peca {
    private String nome;
    private double valor;

    public Radiador(double valor){
        this.nome = "Radiador";
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
