package src.br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_Arrays_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //posição 0, 1, 2, 3, 4, 5, mas existem 6 posições.

        //System.out.println(vetor.length);

        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {

            //lenght-1 porque inicia o vetor em zero, pode utilizar
            // count < (vetor.length-1)

            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --)
            System.out.print(vetor[i] + " ");
    }
}