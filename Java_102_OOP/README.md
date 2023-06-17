# Java_102_OOP
This repository holds the content produced in a Java OOP class

<br>

## Java OO: Introdução à Orientação a Objetos

Instructor: Paulo Silveira

Learning institution: Alura

<br>

# Destaques
<br>

## Ideia central do paradigma da Orientação a Objetos

    Dado e funcionalidade sobre ele andam juntos.

<br>

## Trabalho em equipe

    Como diz o ditado popular "Cachorro que tem muitos donos acaba morrendo de fome". 

Para que várias equipes consigam trabalhar em um mesmo projeto, é necessário que as responsabilidades de cada código estejam bem definidas e claras, evitando conflitos na hora de realizar mudanças e evoluções. Código com responsabilidades coesas é sinal do paradigma OO.

<br>

## Modelagem de dados

Conta
    
    Atributos
        -saldo
        -agencia
        -numero
        -titular

    Comportamentos
        -Sacar
        -Depositar
        -Transferir


<br>

## Definições

Classe ou referência:

    Uma classe é uma especificação de um tipo, definindo atributos e comportamentos.

    Especificação do que pode ser feito. Como um planta de uma casa. A planta não é uma casa, pode ser entendida como um modelo ou até um molde.

Objeto ou instância: 

    Um objeto é uma instância de uma classe onde podemos definir valores para seus atributos.

    Em nosso exemplo, seria a casa produzida a partir da planta, sendo que essa casa possui atributos que podem variar em seus valores.

Atributos:

    Os atributos são as características que especificam uma classe. Também podem ser chamados de campo ou propriedades.

<br>

## Primeira Classe

Classe com atributos

    class Conta {
        double saldo;
        int agencia;
        int numero;
        String titular;
    }

Definindo valores para os atributos

    public class CriarConta {
        public static void main(String[] args) {
            Conta primeiraConta = new Conta();
            primeiraConta.saldo = 200;
            
            System.out.println(primeiraConta.saldo);
	    }
    }


Obs: Diferente das variáveis presentes no código main, os atributos das classes em Java são inicializadas com o valor 0 para propriedades do tipo numérica, com o valor null para propriedades do tipo String, com false para valores boleanos.

<br>

## Referência

As variáveis nas quais atribuímos um novo objeto através da palavra reservada new guardam as referências (na memória) para aquele objeto e não o objeto em si.


## Comportamentos ==> Métodos
    
    tipo retorno nome(argumentos){
        código
    }

    public class Conta {

        //ATRIBUTOS
        double saldo;
        int agencia;
        int numero;
        String titular;

        //METODOS	
        public void deposita(double valor) {
            this.saldo += valor;
        }

        public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else { 
			return false;
		}

        public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			//destino.saldo += valor;
			destino.deposita(valor);
			return true;
		}
		return false;
		
	    }
	}
	


Invocando o método

        // ===> nomeDaReferencia.nomeDoMetodo();
        
        Conta contaDaBia = new Conta();
		contaDaBia.saldo = 200;
		contaDaBia.deposita(100);
		contaDaBia.saca(17);
		System.out.println("Bia, seu saldo é: " + contaDaBia.saldo);


Obs: o método com retorno boolean pode ser atribuído a uma variável booleana como expressão booleana.





