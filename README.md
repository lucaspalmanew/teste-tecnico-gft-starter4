# teste-tecnico-gft-starter4
1. Elabore um algoritmo para mostrar os números ímpares existentes em um intervalo.
O usuário deverá fornecer os valores inicial (inicial > 0) e final (inicial < final) e os
números ímpares existentes no intervalo ([inicial, final]) devem ser separados por um
espaço em branco.
Exemplo:

Entrada: 2 13
Saída: 3 5 7 9 11 13

2. Crie uma Classe Pessoa, contendo os atributos (nome, endereço e telefone)
encapsulados, com seus respectivos seletores (getters) e modificadores (setters), e
ainda o construtor padrão. Por fim, criar uma classe principal que instancie o objeto
Pessoa, adicione no mínimo um valor para cada atributo e imprima na tela.

3. Considerando os conceitos de Orientação a Objetos, crie uma classe abstrata Pai de
nome Conta com os seguintes atributos (número, titular e saldo) e mais duas classes
Filhas (ContaCorrente e ContaPoupanca). Na classe Conta deve existir um método
de nome rendimento que retorna o rendimento mensal da conta, nas classes filhas
deve existir o mesmo método rendimento, porém com as seguintes regras:
⦁ Para ContaCorrente, o método rendimento deve retornar o saldo * 0.03;
⦁ Para ContaPoupanca, o método rendimento deve retornar o saldo * 0.05;
Por fim, criar uma classe principal que instancie objetos de ContaCorrente e
ContaPoupanca, adicione no mínimo um valor para cada atributo e imprima cada
conta (ContaCorrente e ContaPoupanca) com seus devidos rendimentos.
Obs: Encapsular atributos das classes.

4. Aproveitando o seu código já escrito na questão 3, crie uma interface chamada
Imposto que contenha o método calcularImposto() e implemente ela em
ContaCorrente e ContaPoupanca com a seguinte regra:
⦁ Para ContaCorrente, o método calcularImposto() deve retornar o rendimento * 25%;
⦁ Para ContaPoupanca, o método calcularImposto() deve retornar o rendimento *
10%;
