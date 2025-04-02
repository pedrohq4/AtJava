package Exercicio8;

public class Funcionario {
        String nome;
        double salarioBase;

        Funcionario(double salarioBase){
                this.salarioBase = salarioBase;
        }

        public void ExibirSalario(){
                System.out.println(salarioBase);
        }
}
