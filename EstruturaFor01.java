import java.util.Scanner;

public class EstruturaFor01 {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int n, x;

         System.out.println("Digite um número: ");  
         n = sc.nextInt();


         int dentro = 0, fora = 0;

         for(int i = 1; i <= n; i++){

            System.out.println("Digite um número: ");
             x = sc.nextInt();

             if(x >= 10 && x <= 20){
                 dentro++;
             } else {
                 fora++;
             }

             System.out.println("Quantidade de números dentro do intervalo: " + dentro);
             System.out.println("Quantidade de números fora do intervalo: " + fora);

             sc.close();

         }
    }
}