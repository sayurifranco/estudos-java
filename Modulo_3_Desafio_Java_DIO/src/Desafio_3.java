/*
Elabore um programa que simule uma fila de atendimento bancário.
O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.
 */

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class Desafio_3 {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        //TODO: Implemente uma condição que simule uma fila bancaria,
        // gerando o nome a posição do cliente na fila:

        nomesFila[0] = nome.nextLine();
        nomesFila[1] = nome.nextLine();
        nomesFila[2] = nome.nextLine();

        int novoIndice;
        for (int i = 0; i < 3; i++) {
            novoIndice = i + 1;
            System.out.println(nomesFila[i] + " - esta na posicao: " + novoIndice);

            // Outra forma:
            // for (int i = 0; i < 3; i++ ) {
            //      System.out.println(nomesFila[i] + " - esta na posicao: " + (i + 1));
        }
    }
}
