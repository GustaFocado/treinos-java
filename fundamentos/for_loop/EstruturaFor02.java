import java.util.Scanner;

public class EstruturaFor02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, x;   

        System.out.println("Digite um número: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Digite um número: ");
            x = sc.nextInt();

            if(x % 2 == 0){
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }
        sc.close();
    }
    
}
