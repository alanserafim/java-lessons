## Java

## Sintaxe Básica

    public class Programa{

        public static void main(String[] args){

            System.out.println("ola mundo");
        }
    }


## Lembretes
* O nome do arquivo salvo deve ser exatamente igual ao nome da classe criada, inclusive as letras maiúsculas e minúsculas! Lembre-se que o Java é case-sensitive.

* Para compilar / gerar o Bytecode: javac Programa.java

* Para executar: java Programa

* Variáveis devem ser declaradas dentro do escopo

* No java não existem valor padrão das variáveis, todas devem ser inicializadas.

## Atalhos do Eclipse

main + ctrl + espaço
    
    para gerar o método main

ctrl + shift + f
    
    para formatar o código fonte

sysout + ctrl + espaço
    
    para gerar a instrução System.out.println()


# Tipos primitivos em java

    int: inteiro (32 bits / positivos e negativos até 2 bilhões)

    double: número flutuante

    long: ...L (64 bits maior que dois bilhões)
        		long numeroGrande = 32323233232323L;

    short: (16 bits até 32 mil)
        short valorPequeno = 2131;

    byte: (até 127)
        byte b = 127;

    float (32 bits)
    float preco = 13.5f 

    char variavel = 'a'; ---> guarda um único caractere

    String variavel = "Nome Completo";

    boolean = true or false

    expressão booleana
        boolean = variavel == outraVariavel;

    
# Operações matemáticas

Divisão: para que o resulta seja um número de ponto flutuante deve-se declarara o divisor como ponto flutuante.

        // divisão inteira
        int divisao1 = 4/2;

        // divisão fracionária
        double divisao3 = 5.0 / 2;
        System.out.println(divisao3);



# Conversões matemáticas

Inteiro para double: compilador aceita (double numero = 1;)

double para inteiro: sem perda de precisão - compilador não aceita; 
                     com perda de precisão - por meio do casting (int valor = (int) flutuante)


# Instruções

## System.out.println()

Comando para imprimir algo na tela.

    System.out.println("Meu salário é " + salario);


## Relacionais e lógicos

    >= : maior ou igual
    <= : menor ou igual
    == : igual
    || : ou
    &&: e



## Condicionais

# IF

    if (variavel >= 10){
        primeira condição
    } else {
        if (variavel >= 20) {
            segunda condição
        } else {
            condição final
        }
    }


# SWITCH CASE

        int mes = 3;
		
		switch (mes) {
			case 1:
				System.out.println("O mês é Janeiro");
				break;
			case 2:
				System.out.println("O mês é Fevereiro");
				break;
			case 3: 
				System.out.println("O mês é Março");
				break;
			default:
				System.out.println("Mês inválido");
				break;
		}
    

# LAÇOS

## WHILE

        int contador = 1;
	    while(contador <= 10) {
			System.out.println(contador);
			//contador = contador + 1;
			//contador += 1;
			contador++;
		}

## FOR

        for(int contador = 0; contador <=10; contador++) {
			System.out.println(contador);
		}


# FOR ENCADEADO

    for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
		for(int contador = 1; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
		}
       	System.out.println();
	}

