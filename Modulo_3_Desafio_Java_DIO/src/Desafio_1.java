/*
Faça um programa que peça para 3 pessoas a sua idade,
ao final o programa deverá verificar se a média de idade
da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então,
dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
*/

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class Desafio_1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

        // TODO: Implemente um condição de verifique a média de idade da turma conforme a descrição do desafio.
        int media = (idade1 + idade2 + idade3) / 3;

        if (media < 25) {
            System.out.println("Jovem!");
        } else if (media>25 && media<60) {
            System.out.println("Adulta!");
        } else if (media > 60) {
            System.out.println("Idosa!");
        }
    }
}