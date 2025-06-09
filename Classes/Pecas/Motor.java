package Classes.Pecas;

public class Motor implements Peca {
    private String nome;
    private double valor;

    public Motor(double valor){
        this.nome = "Motor";
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
