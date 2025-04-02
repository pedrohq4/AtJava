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
        String numerosStr = scan.nextLine();

        String[] numeros = numerosStr.split(",");

        int acertos = 0;

        for(var num : numeros){
            int numeroUsuario = Integer.parseInt(num.trim());

            for (int numeroSorteado : numerosAle) {
                if (numeroUsuario == numeroSorteado) {
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
