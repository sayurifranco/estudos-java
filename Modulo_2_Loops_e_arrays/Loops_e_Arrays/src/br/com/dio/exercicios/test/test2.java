package src.br.com.dio.exercicios.test;

public class test2 {

    public static void main(String[] args) {
        int num = 5, count = 1;
        // igual a
        // int num = 5
        // int count = 1;

        do {
            num += count;
            // igual a
            // num = num + 2
            // num += 2
            // += adicion a propria variavel o que esta depois do simbolo +=
            System.out.println(num);
        } while (count <= 3);
    }
}

//Array: É um objeto utilizado para armazenar sequencialmente dados do mesmo tipo.