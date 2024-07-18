import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        // Leitura do console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes e sexos separados por vírgula (ex: Maria,F;João,M;Ana,F):");
        String input = scanner.nextLine();
        scanner.close();

        // Dividindo a string de entrada em uma lista de strings (cada elemento é "nome,sexo")
        List<String> pessoas = Arrays.asList(input.split(";"));

        // Filtrando as mulheres usando lambda e stream
        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.split(",")[1].equalsIgnoreCase("F"))
                .map(pessoa -> pessoa.split(",")[0])
                .collect(Collectors.toList());

        // Imprimindo a lista de mulheres
        System.out.println("Mulheres na lista:");
        mulheres.forEach(System.out::println);
    }
}
