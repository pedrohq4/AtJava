import java.util.Scanner;

public class Exercicio_2 {
    Scanner scan = new Scanner(System.in);
    public void DefinirSenha() {
        int escolha = 0;
        boolean senhaCorreta = false;
        do {
            System.out.print("Digite a senha: ");
            String senha = scan.nextLine();

            boolean temMaiuscula = false;
            boolean temNumero = false;
            boolean temEspecial = false;
            String especiais = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

            for (char c : senha.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    temMaiuscula = true;
                } else if (Character.isDigit(c)) {
                    temNumero = true;
                } else if (especiais.indexOf(c) != -1) {
                    temEspecial = true;
                }
            }

            if (senha.length() < 8) {
                System.out.println("A senha deve ter no mínimo 8 caracteres.");
            }

            if (!temMaiuscula) {
                System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
            }

            if (!temNumero) {
                System.out.println("A senha deve conter pelo menos um número.");
            }

            if (!temEspecial) {
                System.out.println("A senha deve conter pelo menos um caractere especial.");
            }
            if (!temMaiuscula || !temNumero || !temEspecial) {
                System.out.println("Digite 1 para tentar novamente");
                escolha = scan.nextInt();
            } else {
                senhaCorreta = true;
                System.out.println("Senha Valida!");
            }

        } while (escolha == 1 || !senhaCorreta);

    }
}
