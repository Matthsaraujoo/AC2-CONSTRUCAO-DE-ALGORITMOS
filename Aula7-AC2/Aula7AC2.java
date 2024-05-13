import java.util.Scanner;

public class Aula7AC2 {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calcula da média. ");

        // Solicita e recebe o primeiro número do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da AC1: ");
        double AC1 = scanner.nextDouble();
        if(AC1 <= 0 || AC1 >= 10){
            System.out.println("Número inváildo, digite um número entre 0 e 10");
            return;
         }
        
        // Solicita e recebe o segundo número do usuário
        System.out.print("Digite o número da AC2: ");
        double AC2 = scanner.nextDouble();
        if(AC2 <= 0 || AC2 >= 10){
            System.out.println("Número inváildo, digite um número entre 0 e 10");
            return;
         }

        // Solicitar o terceiro numero
        System.out.print("Digite o número da AG: ");
        double AG = scanner.nextDouble();
        if(AG <= 0 || AG >= 10){
            System.out.println("Número inváildo, digite um número entre 0 e 10");
            return;
         }

        System.out.print("Digite o número AF: ");
        double AF = scanner.nextDouble();
        if(AF <= 0 || AF >= 10){
            System.out.println("Número inváildo, digite um número entre 0 e 10");
            return;
         }

        // Calcula a soma dos dois números
        double resultado = (AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);

        // Exibe o resultado para o usuário
        System.out.println("A média é " + resultado);

        if (resultado >= 0 && resultado <= 2) {
            System.out.println(" Reprovou" );
        }else if (resultado >= 2.1  && resultado <= 4.9){
            System.out.println( " Precisa fazer substitutiva" );
        }else if (resultado >= 5){
            System.out.println( " Aprovado" );
        }else{
            System.out.println(" Resultado inválido");
        }
            
        // Fecha o scanner 
        scanner.close();
    }
}
