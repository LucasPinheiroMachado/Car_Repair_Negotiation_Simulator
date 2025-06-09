package Classes;
import Classes.Pecas.*;
import java.util.List;

public class Orcamento {
    private Oficina oficina;
    private Cliente cliente;
    private double valor;
    private List<Peca> pecasComDefeito;

    public Orcamento(Oficina oficina, Cliente cliente, List<Peca> pecasComDefeito) {
        this.oficina = oficina;
        this.cliente = cliente;
        this.pecasComDefeito = pecasComDefeito;
        double totalPecas = 0;
        for (Peca peca : this.pecasComDefeito) {
            totalPecas += peca.getValor();
        }
        this.valor = totalPecas + (totalPecas * (oficina.getPorcentagemDeLucroMinima() / 100));
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double valorOrcamentoInicial() {
        return this.valor + (this.valor * 0.3);
    }

    public boolean avaliarContraProposta(double valorContraProposta) {
        if(this.valor > valorContraProposta){
            return false;
        }
        return true;
    }
}
