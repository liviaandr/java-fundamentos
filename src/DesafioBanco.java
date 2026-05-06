import java.util.Scanner;

public class DesafioBanco {
    static void main() {
        Scanner dados = new Scanner(System.in);

        String nome = "Jacqueline";
        String tipoDeConta = "Corrente";
        float saldo = 2500;
        float alterarValor = 0;
        int tipoDeOperação = 0;




        System.out.println("""
                ********************************************************
                Dados iniciais do cliente:
                """);
        System.out.println("Nome:                " + nome);
        System.out.println("Tipo de conta:       " + tipoDeConta);
        System.out.println("Saldo:               " + saldo);


        while(tipoDeOperação != 4) {

            System.out.println("""
                
                ********************************************************
                
                Operações:
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a operação desejada:
                """);
            tipoDeOperação = dados.nextInt();

            switch (tipoDeOperação) {
                case 1:
                    System.out.println("O saldo da conta é: " + saldo);
                    break;

                case 2:
                    System.out.println("Qual o valor que você vai receber? ");
                    alterarValor = dados.nextFloat();

                    saldo += alterarValor;
                    System.out.println("O novo saldo é: " + saldo);
                    break;

                case 3:
                    System.out.println("Qual o valor que você vai transferir? ");
                    alterarValor = dados.nextFloat();

                    saldo -= alterarValor;
                    System.out.println("O novo saldo é: " + saldo);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Operação inválida, tente novamente: ");
                    break;
            }
        }

        System.out.println("""
                
                Fim da operação.
                ********************************************************
                """);
    }
}
