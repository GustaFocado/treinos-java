import java.util.Scanner;
public class EstruturaWhile02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         int codigo;

         System.out.println("Digite o código do produto: ");
         codigo = sc.nextInt();

         int alcool = 0, gasolina = 0, diesel = 0;

            while(codigo != 4){
                if(codigo == 1){
                    System.out.println("Gasolina");
                    gasolina++; 
                } else if(codigo == 2){
                    System.out.println("Álcool");
                    alcool++;
                } else if(codigo == 3){
                    System.out.println("Diesel");
                    diesel++;
                } else {
                    System.out.println("Código inválido!");
                }
                System.out.println("Digite o código do produto: ");
                codigo = sc.nextInt();
            }


         
    }
    
}
