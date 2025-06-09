package Classes;

public class Oficina {
    private String nome;
    private Mecanico mecanico;
    private double porcentagemDeLucroMinima;

    public Oficina(String nome, Mecanico mecanico, double porcentagemDeLucroMinima) {
        this.nome = nome;
        this.mecanico = mecanico;
        this.porcentagemDeLucroMinima = porcentagemDeLucroMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public double getPorcentagemDeLucroMinima() {
        return this.porcentagemDeLucroMinima;
    }

    public void setPorcentagemDeLucroMinima(double porcentagemDeLucroMinima) {
        this.porcentagemDeLucroMinima = porcentagemDeLucroMinima;
    }
}
