/*
O gerente de uma loja resolveu aplicar descontos em todos os seus produtos!
A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos.
A entrada deverá ser feita por dois valores M e D, onde a primeira linha deverá
receber o valor marcado do produto, e na segunda linha o valor do produto com o
desconto já aplicado.
A saída deverá retornar o percentual de desconto que foi aplicado no produto.
 */

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class Desafio_4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();
        float valorInicial = M;
        float valorFinal = S;

        float descontof = (((valorInicial-valorFinal)/valorInicial)*100);
        int desconto = (int)descontof;

        System.out.println("O desconto foi de " + desconto + "%");

        //TODO:  Retorne o percentual de desconto que foi aplicado no produto
        // Casting
    }
}
