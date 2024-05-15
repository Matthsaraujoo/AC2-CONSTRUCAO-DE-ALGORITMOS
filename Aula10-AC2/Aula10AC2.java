import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula10AC2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       double media = 0.0;  
       double peso = 0.0;
       double notafinal = 0.0;

       int alunos = 0; 
       int notas = 0;
       String nome = null, condicao;

       System.out.print("Digite a quantidade de alunos: "); // Coloca quantos alunos você deseja calcular
       alunos = scn.nextInt();


       for(int m = 1; m <= alunos; m++ ){  // Inicia a repetição dos códigos abaixo
           System.out.print("Digite o nome do aluno: "); // Coloca o nome do aluno
           nome = scn.next();
           System.out.print("Digite a quantidade de notas: "); // Insere quantas notas você deseja 
           notas = scn.nextInt();

       int reinserir = 0;
	do {
           for(int a = 1; a <= notas; a++ ){
		do {
                    System.out.print("Digite a nota " + a + ": "); // Insere a nota que obteve
                    notafinal = scn.nextDouble();
              } while (notafinal < 0.0 || notafinal > 10.0);
               System.out.print("Digite o peso (em porcentagem) da nota " + a + ": "); // Insere o peso da nota
               peso = scn.nextDouble();
               media += notafinal * (peso/100); // Calcula a média 
             }
             System.out.print("Deseja reinserir as notas (S = sim, N = nao)"); 
             reinserir = scn.nextInt();
	} while (reinserir == 1);
       
       
    if (media >= 0 && media <= 2) {
        condicao = "Reprovado"; // Se sua média for até 2 aparece que você foi reprovado
    } else if (media >= 2.1  && media <= 4.9) {
        condicao = "Substitutiva"; // Se sua média for até 4,9 aparece que você poderá fazer a prova substitutiva
    } else {
        condicao = "Aprovado"; // Se sua média for até acima de 4,9 aparece que você foi aprovado
    }

          DecimalFormat ma= new DecimalFormat("#.#");

          System.out.println("\nNome do Aluno: " + nome); // Aparece o nome do aluno
          System.out.println("Media Final: " + ma.format(media)); // Aparece a média final
          System.out.println("Condicao: " + condicao); // Aparece se foi aprovado, substitutiva ou reprovado
        }

        scn.close();
    }
}
