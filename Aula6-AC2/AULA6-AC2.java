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
1. Classe Funcionario
Atributos:

nome: Armazena o nome do funcionário.
salarioBase: Armazena o salário base do funcionário.
Construtor:

Inicializa o nome e o salarioBase com os valores fornecidos.
Métodos:

calcularSalario(): Retorna o salário base do funcionário. (Este método pode ser sobrescrito em subclasses para cálculo mais específico.)
setSalarioBase(double salarioBase): Define um novo valor para o salário base.
setSalarioBase(): Define um valor padrão para o salário base (3000), se nenhum valor for passado. Note que este método não é utilizado no código, pois o salário base é definido diretamente no construtor ou pelo método setSalarioBase(double salarioBase).
getNome(): Retorna o nome do funcionário.
setNome(String nome): Define um novo nome para o funcionário.
getSalarioBase(): Retorna o salário base do funcionário.
2. Classe Gerente
Herança:

Gerente herda de Funcionario, o que significa que um Gerente é um tipo especializado de Funcionario.
Atributos Adicionais:

bonus: Armazena o valor do bônus do gerente. Esse valor é uma porcentagem que será aplicada ao salário base.
Construtor:

Inicializa o nome e o salarioBase através do construtor da superclasse (Funcionario) e define o bonus.
Métodos:

calcularSalario(): Sobrescreve o método da classe Funcionario para incluir o bônus. Calcula o salário total como o salário base mais o bônus (bônus é uma porcentagem do salário base).
setBonus(double bonus): Define um novo valor para o bônus.
getBonus(): Retorna o valor do bônus.
3. Classe Diretor
Herança:

Diretor herda de Gerente, que por sua vez herda de Funcionario. Assim, um Diretor é um tipo especializado de Gerente e, por consequência, de Funcionario.
Atributos Adicionais:

auxilioMoradia: Armazena o valor do auxílio-moradia do diretor.
Construtor:

Inicializa o nome, salarioBase, e bonus através do construtor da superclasse (Gerente), e define o auxilioMoradia.
Métodos:

calcularSalario(): Sobrescreve o método da classe Gerente para incluir o auxílio-moradia além do salário base e do bônus. Calcula o salário total como o salário base mais o bônus, mais o auxílio-moradia.
setAuxilioMoradia(double auxilioMoradia): Define um novo valor para o auxílio-moradia.
getAuxilioMoradia(): Retorna o valor do auxílio-moradia.
4. Classe Main
Objetivo:

Testa as funcionalidades das classes Funcionario, Gerente, e Diretor.
Objetos Criados:

Funcionario funcionario = new Funcionario("João", 3000);: Cria um funcionário com o nome "João" e um salário base de 3000.
Gerente gerente = new Gerente("Maria", 5000, 0.20);: Cria um gerente com o nome "Maria", um salário base de 5000 e um bônus de 20% (0.20).
Diretor diretor = new Diretor("Carlos", 10000, 0.15, 2000);: Cria um diretor com o nome "Carlos", um salário base de 10000, um bônus de 15% (0.15) e um auxílio-moradia de 2000.
Saída:

Calcula e imprime os salários de cada funcionário, gerente e diretor usando o método calcularSalario().
