package src.br.com.dio.exercicios.loops;/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");
        for(int i = fatorial ; i >= 1 ; i --) { //i--  i = i - 1
            multiplicacao = multiplicacao * i; //fatorial 5! = 5*4*3*2*1 = 120
        }

        System.out.println(multiplicacao);
    }

}