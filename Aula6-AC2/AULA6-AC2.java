import java.util.Scanner;

public class Aula6_AC2 {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calcula da média. ");

        // Solicita e recebe o primeiro número do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da AC1: ");
        double AC1 = scanner.nextDouble();

        // Solicita e recebe o segundo número do usuário
        System.out.print("Digite o número da AC2: ");
        double AC2 = scanner.nextDouble();

        // Solicitar o terceiro numero
        System.out.print("Digite o número da AG: ");
        double AG = scanner.nextDouble();

        System.out.print("Digite o número AF: ");
        double AF = scanner.nextDouble();

        // Calcula a soma dos dois números
        double resultado = (AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);

        // Exibe o resultado para o usuário
        System.out.println("A média é " + resultado);

        if (resultado <= 5) {
            System.out.println(" Reprovou" );
        }else{
            System.out.println(" Passou" );
        }    
        // Fecha o scannner
        scanner.close();
    }
}                                                                              
