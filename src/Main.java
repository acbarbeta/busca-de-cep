import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BuscaPorCep buscaCep = new BuscaPorCep();

        System.out.println("Insira um CEP para a busca (formato 000000-000): ");
        var cepParaConsulta = scanner.nextLine();

        try {
            Endereco novoEndereco = buscaCep.buscaEndereco(cepParaConsulta);
            System.out.println(novoEndereco);
            GerenciadorArquivo gerenciador = new GerenciadorArquivo();
            gerenciador.salvaJson(novoEndereco);
        } catch(RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Aplicação finalizada.");
        }

    }
}