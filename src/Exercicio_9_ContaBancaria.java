public class Exercicio_9_ContaBancaria {
    String titular;
    private double saldo;

    public void Depositar(double valor){
        saldo += valor;
    }

    public void Sacar(double valor){
        saldo -=  valor;
    }

    public void ExibirSaldo(){
        System.out.println(saldo);
    }
}
