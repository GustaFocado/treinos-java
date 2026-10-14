package fundamentos.sequencial;
import java.util.Scanner;

public class EstruturaSequencial03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double salario, imposto;

        System.out.println("Digite o valor do salário: ");
        salario = sc.nextDouble();

        if(salario <= 2000){
            imposto = 0;
            System.out.println("Isento de imposto");
        } else if(salario <= 3000){
            imposto = salario * 0.08;
            System.out.println("Imposto: " + imposto);
        } else if(salario <= 4000){
            imposto = salario * 0.18;
            System.out.println("Imposto: " + imposto);  
        } else {
            imposto = salario * 0.28;
            System.out.println("Imposto: " + imposto);
        }
        sc.close();
    }
}