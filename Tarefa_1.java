/**
 * Tarefa 1 - Ler do console nome das pessoas, separadas por virgula, 
 * armazenar numa variavel,
 * ordenar por ordem alfabetica,
 * exibir resultado na console.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Tarefa_1 {
    public static void main(String[] args) {
        // Ler do console
        Scanner scanner = new Scanner(System.in);

        // Nome das pessoas, separadas por virgula
        System.out.println("Digite os nomes das pessoas, separados por vírgula:");
        String input = scanner.nextLine();

        /*
        Com .split podemos separar atraves das virgulas e 
        remover os espaços em branco,
        \\s* serve para remover qualquer espaço em branco a volta da , (virgula)
        */
        String[] nomes = input.split("\\s*,\\s*");

        // Ordenar por ordem alfabetica
        Arrays.sort(nomes);

        // Exibir o resultado final
        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
