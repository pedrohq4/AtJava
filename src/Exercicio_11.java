import java.util.Random;
import java.util.Scanner;

public class Exercicio_11 {
    public void SimuladorLoteria() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int[] numerosAle = new int[6];
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < numerosAle.length; i++){
            numerosAle[i] = rand.nextInt(1, 60);
        }

        System.out.println("Digite 6 numeros de 1 a 60, ex(11,22,33,44,55,66)");
        String numeroUsuario = scan.nextLine();

        String[] numerosUsuario = numeroUsuario.split(",");

        int acertos = 0;

        for(var num : numerosUsuario){
            int numero = Integer.parseInt(num);

            for (int numeroSorteado : numerosAle) {
                if (numero == numeroSorteado) {
                    acertos++;
                    break;
                }
            }
        }
        if(acertos >= 1) {
            System.out.println("O usuario acertou " + acertos + (acertos == 1 ? " vez" : " vezes"));
        }
        else
            System.out.println("O usuario não acertou nenhuma vez");

    }
}
