import java.util.Scanner;

public class Perfil {
    public static void main() {
        Scanner perfil = new Scanner(System.in);

        int numeroDeAlunos;

        String mensagemInicial;
        mensagemInicial = """
                ----------------------------- Leitura de Dados ----------------------------------
                Este programa irá ler as notas de um aluno e mostrar a média dele na tela.
                ...
                Escreva quantos alunos você deseja armazenas os dados: 
                """;
        System.out.println(mensagemInicial);
        numeroDeAlunos = perfil.nextInt();
        int numeroTemporário = 0;

        do {
            float notasALunos = 0;

            for (int i = 0; i < 3; i++) {
                System.out.println("Escreva a " + (i + 1) + "° nota do " + (numeroTemporário + 1) + "° aluno: ");
                float notasTemporária = perfil.nextFloat();
                notasALunos += notasTemporária;
            }

            System.out.println("A média da nota dele é: " + (notasALunos / 3));

            numeroTemporário++;
        } while (numeroDeAlunos > numeroTemporário);
    }
}
