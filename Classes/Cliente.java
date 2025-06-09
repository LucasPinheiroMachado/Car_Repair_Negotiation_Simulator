package Classes;

public class Cliente {
    private String nome;
    private Carro carro;

    public Cliente(String nome, Carro carro){
        this.nome = nome;
        this.carro = carro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro getCarro() {
        return this.carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
