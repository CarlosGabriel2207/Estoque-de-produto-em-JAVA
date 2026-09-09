Controle de Estoque de Produto

Programa em Java, aplicando conceitos de Programação Orientada a Objetos (POO), para gerenciar os dados de um produto em estoque.

Sobre o projeto:

O programa lê os dados de um produto (nome, preço e quantidade em estoque) e permite:

Exibir os dados do produto, incluindo o valor total em estoque;
Realizar uma entrada no estoque (aumentar a quantidade);
Realizar uma saída no estoque (diminuir a quantidade);
Exibir novamente os dados do produto após as movimentações.
Tecnologias:
Java
Scanner (leitura de dados via console)
Estrutura:
applicationProduct/
├── Main.java      // Classe principal, responsável pela interação com o usuário
└── Product.java   // Classe que representa o produto e suas regras de negócio
Classe Product

Atributos:

name (String)
price (double)
quantity (int)

Métodos:

totalValueInStock(): calcula o valor total em estoque (preço × quantidade)
AddProducts(quantity): adiciona uma quantidade ao estoque
RemoveProducts(quantity): remove uma quantidade do estoque
Como executar
Clone o repositório
Compile e execute a classe Main
Informe o nome, o preço e a quantidade do produto quando solicitado

Status:

Projeto de estudo, desenvolvido como exercício de fixação de POO em Java (classes, atributos e métodos).
