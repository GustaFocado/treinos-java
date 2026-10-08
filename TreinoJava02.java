import java.util.Scanner;

public class TreinoJava02 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int a, h;
        double valorHora , salario;

        System.out.println("Digite o número do funcionário: ");
        a = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas: ");
        h = sc.nextInt();

        System.out.println("Digite o valor da hora: ");
        valorHora = sc.nextDouble();

        salario = h * valorHora;

        System.out.println("O salário do funcionário é R$ " + String.format("%.2f", salario));

        sc.close();
    }
    
}
