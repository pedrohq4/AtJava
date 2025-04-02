import java.util.Scanner;

public class Exercicio_3 {
    Scanner scan = new Scanner(System.in);
    public void calcularSalarioLiquido(){
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite seu Salario mensal:");
        double salarioMensal = scan.nextDouble();

        double imposto = CalcularImpostos(salarioMensal);
        double salarioLiquido = salarioMensal - (salarioMensal * imposto);

        System.out.println("Seu imposto é de: " + (String.format("Porcentagem: %.1f%%", imposto * 100)) + "% e seu salario liquido é de: " + salarioLiquido + ".");
    }

    private double CalcularImpostos(double salario){
        if(salario <= 22847.76){
            return 0;
        }
        else if(salario >= 22847.77 && salario <= 33919.80){
            return 0.075;
        } else if (salario >= 33919.81 && salario <= 45012.60) {
            return 0.15;
        } else {
            return 0.275;
        }
    }
}
