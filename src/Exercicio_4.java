import java.util.Scanner;

public class Exercicio_4 {
    Scanner scan = new Scanner(System.in);
    public void SimularEmprestimoBancario(){
        System.out.print("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite o valor do emprestimo: ");
        double emprestimo = scan.nextDouble();
        System.out.print("Quantas parcelas desja pagar o emprestimo: ");
        int nParcelas = scan.nextInt();

        double taxa = 0.03;
        double valorTotal = emprestimo * (1 + (taxa * nParcelas));
        double valorDaParcela = valorTotal / nParcelas;

        System.out.printf("Valor total pago: %.2f Valor da parcela mensal: %.2f", valorTotal, valorDaParcela);
    }
}
