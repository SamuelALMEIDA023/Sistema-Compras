Sistema de Gerenciamento de Compras com Cartão de Crédito

💡 Sobre o Projeto

Bem-vindo ao Sistema de Gerenciamento de Compras com Cartão de Crédito!
Este é um projeto focado no uso de Orientação a Objetos em Java para implementar um sistema completo que permite:
	1.	Cadastrar clientes e seus cartões de crédito.
	2.	Gerenciar compras de forma prática e eficiente.
	3.	Fornecer relatórios detalhados sobre compras e saldos.

 Esse projeto demonstra boas práticas de desenvolvimento, como Clean Code, encapsulamento, e reutilização de código,
 sendo ideal para aplicações do mundo real, como sistemas financeiros ou plataformas de e-commerce.

🚀 Funcionalidades Implementadas

👉🏼	Adicionar um cliente ao sistema:
    O sistema permite criar perfis para novos clientes, armazenando dados como nome e CPF.
    
👉🏼	Cadastrar um cartão de crédito para o cliente:
    Cada cliente pode ter um ou mais cartões de crédito com limite definido.
    
👉🏼	Realizar compras utilizando o cartão de crédito:
    O sistema gerencia o saldo disponível do cartão e bloqueia compras que excedem o limite.
    
👉🏼	Listar todas as compras realizadas por um cliente:
    Exibe um histórico completo das transações realizadas com seu cartão.
    
👉🏼	Mostrar o saldo disponível após cada compra:
    O sistema atualiza e exibe o saldo disponível em tempo real após cada transação.

👉🏼 Exibir um resumo detalhado das compras realizadas por um cliente
    Inclui informações como:
	  •	Produtos adquiridos.
	  •	Quantidade de itens.
	  •	Valor total gasto.
	  •	Saldo disponível no cartão.

🛠️ Tecnologias e Conceitos Utilizados

  •	Java: Linguagem principal para implementação do sistema.
	•	Paradigma de Orientação a Objetos (POO):
	•	Encapsulamento.
  •	Associação entre classes.
	•	Práticas de Clean Code: Código limpo e bem organizado para maior legibilidade e manutenção.
  •	Coleções Java (List): Para gerenciar clientes, cartões e compras.

📂 Estrutura do Projeto

  src/
├── aplication/
│   ├── Progarm.java  # Programa principal (Ponto de entrada do programa)
├── entities/
│   ├── Cliente.java  # Classe que representa o cliente.
│   ├── Compra.java   # Classe que representa a compra.
├── util/
│   ├── CartaoDeCredito.java  # Classe que representa o cartão de crédito.
│   ├── SistemaDeCompra.java   # Classe que gerencia as operações do Sistema de Compras.

👩‍💻 Como Executar o Projeto

  1.	Clone o repositório:
    git clone https://github.com/SamuelALMEIDA023/Sistema-Compras.git

  2.	Compile o projeto:
    javac src/**/*.java

  3.  Execute o programa:
     java src/Main --> MacOS/Linux
     javac -d bin src/**/*.java  --> Windows

📝 Demonstração do Sistema

  1. Adicionar Cliente e Cadastrar Cartão de Crédito
    SistemaDeCompras.cadastrarCartao(cliente, cartao);

  2. Identificar se cliente deseja realizar compras e realiza-la
    SistemaDeCompras.realizarCompra(cartao, compras);

  3. Listar Compras
    SistemaDeCompras.listarCompras(cliente);

  5. Exibir Resumo
   SistemaDeCompras.exibirResumo(cliente);


 📊 Resultados Esperados
	👉🏼 Após a execução, o sistema apresentará:
	1.	Uma lista detalhada de todas as compras realizadas.
	2.	O saldo atualizado do cartão após cada compra.
	3.	O total gasto pelo cliente.

  Exemplo de saída:
   Compras realizadas no cartao 1234-5678-9876-5432: 
   1. Mochila - 500.0
   2. Caderno - 140.0

   Resumo do cliente Samuel:
   Cartão: 1234-5678-9876-5432
   Total gasto: R$ 640.0
   Saldo disponivel: 4360.0

✨ Diferenciais do Projeto
	•	Código modular: Fácil de entender, testar e expandir.
	•	Boas práticas: Design limpo com foco na reutilização.
	•	Simulação realista: Ideal para sistemas financeiros ou de gerenciamento de clientes.
	•	Foco no aprendizado: Excelente exemplo de aplicação prática de conceitos de POO.

🏆 Por Que Este Projeto?
   Este projeto demonstra habilidades essenciais como:
	•	Resolução de problemas.
  •	Desenvolvimento de conhecimentos de POO.
	•	Design orientado a objetos.
	•	Manipulação de dados em coleções.
	•	Implementação de lógica de negócio realista.
-> Além disso, é uma solução clara e eficiente para um problema comum em sistemas financeiros e pode ser facilmente adaptada para projetos maiores.

📬 Contato
Gostou do projeto? Quer conversar mais? Entre em contato comigo!
📧 Email: sa_muelmarcos@hotmail.com
💼 LinkedIn: www.linkedin.com/in/samuel-marcos-almeida
📂 GitHub: www.linkedin.com/in/samuel-marcos-almeida




  
 





 


    
