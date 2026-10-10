import java.util.Scanner;

public class EstruturaWhile01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int senha, valida;

        System.out.println("Crie uma senha numérica: ");
        senha = sc.nextInt();  
        
        do {
            System.out.println("Digite a senha para validação: ");
            valida = sc.nextInt();
            if(valida != senha){
                System.out.println("Senha incorreta, tente novamente.");
            }
        } while(valida != senha);

        System.out.println("Senha correta!");
     sc.close();    
    }
}