/*
Dado um inteiro positivo n , retorne o menor inteiro positivo que é um múltiplo 2 de e n .
A entrada consiste em um int, do qual podemos calcular seu menor multiplo.
A entrada consiste em um retorno, que será o menor multiplo digitado e 2.
 */
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class Desafio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

//TODO: Crie as outras condições necessárias para a resolução do desafio.
        int minimoMultiplo = 0;
        if (numero % 2 == 0) {
            minimoMultiplo = numero;
        } else {
            minimoMultiplo = numero * 2;
        }

        System.out.println("O resultado eh:" + minimoMultiplo);
    }

}