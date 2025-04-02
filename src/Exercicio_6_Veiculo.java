public class Exercicio_6_Veiculo {
        String placa;
        String modelo;
        int anoFabricacao;
        double quilometragem;

    public String ExibirDetalhes() {
        return "Placa: " + placa + ", modelo: " + modelo + ", ano de fabricação: " + anoFabricacao + ", quilometragem: " + quilometragem;
    }

    public void RegistarViagem(double kmrodados){
        quilometragem += kmrodados;
    }
}
