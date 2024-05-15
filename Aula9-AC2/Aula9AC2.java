import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula9AC2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double media = 0.0;  
        double peso = 0.0;
        double notafinal = 0.0;

        int alunos = 0; 
        int notas = 0;
        String nome = null, condicao;

        System.out.print("Digite a quantidade de alunos: ");
        alunos = scn.nextInt();

        for(int m = 1; m <= alunos; m++ ){  
            System.out.print("Digite o nome do aluno: ");
            nome = scn.next();
            System.out.print("Digite a quantidade de notas: ");
            notas = scn.nextInt();

            for(int a = 1; a <= notas; a++ ){
                do {
                    System.out.print("Digite a nota " + a + ": ");
                    notafinal = scn.nextDouble();
                } while (notafinal < 0.0 || notafinal > 10.0);
                System.out.print("Digite o peso (em porcentagem) da nota " + a + ": ");
                peso = scn.nextDouble();
                media += notafinal * (peso/100);
            }
             
            if (media >= 0 && media <= 2) {
                condicao = "Reprovado";
            } else if (media >= 2.1  && media <= 4.9) {
                condicao = "Substitutiva";
            } else {
                condicao = "Aprovado";
            }

            DecimalFormat ma = new DecimalFormat("#.#");

            System.out.println("\nNome do Aluno: " + nome);
            System.out.println("Media Final: " + ma.format(media));
            System.out.println("Condicao: " + condicao);
        }

        scn.close();
    }
}
