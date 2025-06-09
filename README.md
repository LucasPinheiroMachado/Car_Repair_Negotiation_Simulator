# 🛠️ Simulador de Negociação com Oficinas Mecânicas

Este projeto é um **simulador de negociação de orçamentos entre clientes e oficinas mecânicas**, desenvolvido em Java. O sistema permite ao usuário cadastrar seu carro, identificar peças com defeito, solicitar orçamentos em diferentes oficinas e até realizar contra propostas de valor. Ideal para fins educacionais e prática de **POO (Programação Orientada a Objetos)**, entrada de dados e lógica de controle.

---

## 🔧 Funcionalidades

- **Cadastro de Cliente**  
  O usuário informa seu nome, o nome do carro, a fabricante, o ano de fabricação e o valor estimado do veículo.

- **Seleção de Peças com Defeito**  
  O cliente escolhe quais peças precisam de manutenção dentre as seguintes opções:
  - Motor
  - Freio
  - Bateria
  - Escape
  - Radiador

- **Escolha de Oficina**  
  São disponibilizadas três oficinas fictícias, cada uma com um mecânico e um fator de lucro diferente.

- **Geração de Orçamento**  
  O sistema gera um orçamento com base nas peças selecionadas, valor do veículo e fator de lucro da oficina.

- **Negociação**  
  O cliente pode:
  - Aceitar o orçamento;
  - Fazer uma contra proposta (a oficina pode aceitar ou recusar);
  - Escolher outra oficina;
  - Encerrar o sistema.
