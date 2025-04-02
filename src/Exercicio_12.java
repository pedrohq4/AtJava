import java.util.Scanner;

public class Exercicio_12 {

    public void trocaDeMensagens() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuario: ");
        String usuario1 = scan.nextLine();

        System.out.print("Digite o nome do segundo usuario: ");
        String usuario2 = scan.nextLine();

        String[] mensagens = new String[10];

        for (int i = 0; i <= 10; i++) {
            String remetente = (i % 2 == 0) ? usuario1 : usuario2;
            System.out.print(remetente + ", digite sua mensagem: ");
            mensagens[i] = remetente + ": " + scan.nextLine();
        }

        System.out.println("===== Histórico de Mensagens =====");
        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }

        System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");
    }

}
