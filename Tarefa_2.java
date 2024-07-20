/**
 * Tarefa 2 - Ler do console nome das pessoas - sexo da pessoa, separadas por virgula,
 * separar por grupos, masculino / feminino,
 * mostar resultado.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa_2 {
    public static void main(String[] args) {
        // Ler da Console
        Scanner scanner = new Scanner(System.in);

        // Nome das pessoas - sexo, separadas por virgula
        System.out.println("Digite os nomes e sexos das pessoas (Nome-Sexo), separados por vírgula:");
        String input = scanner.nextLine();

        /*
        Aqui separamos os nomes por virgula, 
        \\s* serve para remover qualquer espaço em branco a volta da , (virgula)
        */ 
        String[] nomes = input.split("\\s*,\\s*");

        // Aqui criamos os grupos, mas ainda não separamos
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        // Aqui já fazemos o processo de separação por sexo
        for (String sexo : nomes) {
            /*
            No primeiro .split separamos as pessoas, 
            mas aqui separamos a pessoa singular por tipo de sexo,
            \\s* serve para remover qualquer espaço em branco a volta do - (traço)
            */
            String[] separar = sexo.split("\\s*-\\s*");

            /*
            Aqui, depois de tirarmos a virgula e o traço, 
            juntamos o nome da pessoa e o sexo, 
            vemos o tipo de sexo da pessoa,
            e juntamos ao grupo correto.

            if (separar.length == 2), serve para confirmar que o split anterior,
            devolveu duas partes, nome e sexo,
            caso não deu, vai para o else.

            tambem fiz um outro, tipo error, caso o usuario meta outro tipo de sexo,
            para além de M ou F.
            */
            if (separar.length == 2) {
                String nome = separar[0];
                String tipo_sexo = separar[1].toLowerCase();
                if (tipo_sexo.equals("m") || tipo_sexo.equals("masculino")) {
                    masculino.add(nome);
                } else if (tipo_sexo.equals("f") || tipo_sexo.equals("feminino")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Sexo inválido para " + nome + ": " + tipo_sexo);
                }
            } else {
                System.out.println("Entrada inválida: " + sexo);
            }
        }

        // Parte final, exibir o resultado
        System.out.println("Grupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("Grupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
