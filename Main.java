import Classes.*;
import Classes.Pecas.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Cliente registrarCliente(Scanner scanner){
        System.out.println("\n\nFaça o cadastro no nosso app:\n\nDigite seu nome:\n\n");

        String nomeCliente = scanner.nextLine();

        System.out.println("\n\nDigite o nome do seu carro:\n\n");
        String nomeCarro = scanner.nextLine();

        System.out.println("\n\nDigite o nome da fabricante do seu carro:\n\n");
        String nomeFabricante = scanner.nextLine();

        System.out.println("\n\nDigite o ano de fabricação do seu carro:\n\n");
        int anoFabricacao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n\nDigite o valor do seu carro:\n\n");
        double valorCarro = scanner.nextDouble();
        scanner.nextLine();

        Carro carro = new Carro(nomeCarro, nomeFabricante, anoFabricacao, valorCarro);

        Cliente cliente = new Cliente(nomeCliente, carro);

        return cliente;
    }

    public static List<Peca> pecasComDefeito(Scanner scanner, Cliente cliente){
        System.out.println("\n\nSelecione as peças que deseja consertar, separe por vírgula caso tenha mais de uma ex: (1,2,5)\n\n1- Motor\n2- Freio\n3- Bateria\n4- Escape\n5- Radiador\n\n");
        String stringPecas = scanner.nextLine();
        int[] arrayPecas = Arrays.stream(stringPecas.split(","))
                         .mapToInt(Integer::parseInt)
                         .toArray();
        
        List<Peca> listaPecas = new ArrayList<>();
        for (int peca : arrayPecas) {
            switch (peca) {
                case 1:
                    listaPecas.add(cliente.getCarro().getMotor());
                    break;

                case 2:
                    listaPecas.add(cliente.getCarro().getFreio());
                    break;

                case 3:
                    listaPecas.add(cliente.getCarro().getBateria());
                    break;

                case 4:
                    listaPecas.add(cliente.getCarro().getEscape());
                    break;

                case 5:
                    listaPecas.add(cliente.getCarro().getRadiador());
                    break;
            
                default:
                    System.out.println("Erro: Peça incorreta.");
                    System.exit(1);
                    break;
            }
        }

        return listaPecas;
    }

    public static Oficina escolherOficina(Scanner scanner, List<Oficina> oficinas){
        System.out.println("\n\nSelecione a oficina que você deseja solicitar um orçamento:\n\n");
        
        for (int i = 0; i < oficinas.size(); i++) {
            System.out.println((i + 1) + "- " + oficinas.get(i).getNome() + "\n");
        }

        int oficinaEscolhida = scanner.nextInt();
        scanner.nextLine();

        return oficinas.get(oficinaEscolhida - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mecanico m1 = new Mecanico("Carlos");
        Mecanico m2 = new Mecanico("Ana");
        Mecanico m3 = new Mecanico("João");

        List<Oficina> oficinas = new ArrayList<>();
        oficinas.add(new Oficina("Oficina Central", m1, 15));
        oficinas.add(new Oficina("Oficina Norte", m2, 10));
        oficinas.add(new Oficina("Oficina Sul", m3, 20));

        boolean negociacaoAtiva = true;
        Cliente cliente = registrarCliente(scanner);
        List<Peca> pecasComDefeito = pecasComDefeito(scanner, cliente);
        Oficina oficinaEscolhida;
        Orcamento orcamento;
        int opcaoEscolhida;
        boolean contraPropostaAtiva = false;
        double valorContraProposta;
        boolean avaliacaoContraProposta;

        while (negociacaoAtiva) {
            oficinaEscolhida = escolherOficina(scanner, oficinas);
            orcamento = new Orcamento(oficinaEscolhida, cliente, pecasComDefeito);
            
            System.out.println("\n\nO orçamento na oficina " + oficinaEscolhida.getNome() + " dado pelo mecânico " + oficinaEscolhida.getMecanico().getNome() + " foi de R$" + orcamento.valorOrcamentoInicial() + "\n\n");
            System.out.println("O que você deseja fazer?\n\n1- Fechar esse orçamento\n\n2- Fazer uma contra proposta\n\n3- Escolher outra oficina\n\n4 - Sair\n\n");
            opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("\n\nNegociação finalizada, você já pode levar seu carro na " + oficinaEscolhida.getNome());
                    negociacaoAtiva = false;
                    break;

                case 2:
                    contraPropostaAtiva = true;
                    while (contraPropostaAtiva) {
                        System.out.println("\n\nDigite o valor da sua contra proposta:\n\n");
                        valorContraProposta = scanner.nextDouble();
                        scanner.nextLine();
                        avaliacaoContraProposta = orcamento.avaliarContraProposta(valorContraProposta);
                        if (avaliacaoContraProposta) {
                            System.out.println("\n\nSua contra proposta foi aceita, você já pode levar seu carro na " + oficinaEscolhida.getNome());
                            contraPropostaAtiva = false;
                            negociacaoAtiva = false;
                        } else {
                            System.out.println("\n\nSua contra proposta foi recusada, o que você deseja fazer?\n\n1- Fazer uma nova contra proposta\n\n2- Escolher outra oficina\n\n3- Sair\n\n");
                            opcaoEscolhida = scanner.nextInt();
                            scanner.nextLine();
                            switch (opcaoEscolhida) {
                                case 1:
                                    
                                    break;
                                
                                case 2:
                                    contraPropostaAtiva = false;
                                    break;

                                case 3:
                                    System.out.println("\n\nSistema finalizado");
                                    negociacaoAtiva = false;
                                    break;
                            
                                default:
                                    System.out.println("Erro: Opção inválida.");
                                    System.exit(1);
                                    break;
                            }
                        }
                    }
                    break;

                case 3:
                    
                    break;

                case 4:
                    System.out.println("\n\nSistema finalizado");
                    negociacaoAtiva = false;
                    break;
            
                default:
                    System.out.println("Erro: Opção inválida.");
                    System.exit(1);
                    break;
            }
        }

        scanner.close();
    }
    
}