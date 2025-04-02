import java.io.*;
import java.util.Scanner;

public class Exercicio_10 {
    public void Compras(){
        Scanner scanner = new Scanner(System.in);
        String Arquivo = "compras.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Arquivo))) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Cadastro da compra " + i);

                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                System.out.print("Preço unitário: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                writer.write(produto + "," + quantidade + "," + preco);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }

        System.out.println("Compras registradas:");
        try (BufferedReader reader = new BufferedReader(new FileReader(Arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                String nome = partes[0];
                int quantidade = Integer.parseInt(partes[1]);
                double preco = Double.parseDouble(partes[2]);

                System.out.printf("Produto: " + nome + " | Quantidade: " + quantidade + " | Preço unitário: R$ %.2f%n", preco);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
