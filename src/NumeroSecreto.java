import java.util.Scanner;
import java.util.Random;

public class NumeroSecreto {
    static void main() {
        Scanner numero = new Scanner(System.in);

        int numeroSecreto;
        int tentativa;


        numeroSecreto = new Random().nextInt(10);
        System.out.println(numeroSecreto);


        System.out.printf("""
                ----------------------------- Número Secreto ----------------------------------
                Um número entre 1 e 10 foi sorteado, tente acertar: 
                """);
        tentativa = numero.nextInt();


        while (tentativa != numeroSecreto) {
            if (tentativa > numeroSecreto) {
                System.out.println("O número secreto é menor, tente novamente: ");
                tentativa = numero.nextInt();

            } else {
                System.out.printf("O número secreto é maior, tente novamente: ");
                tentativa = numero.nextInt();

            }
        }
        System.out.println("Você acertou! O número secreto era:" + numeroSecreto);

    }
}
