import java.util.Scanner;

public class EstruturaSequencial02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double preco, total;
        String produto;



        System.out.println("Digite o código do produto: ");
        codigo = sc.nextInt();

        if (codigo == 1) {
            produto = "Cachorro Quente";    
            preco = 5.00;
        } else if (codigo == 2) {
            produto = "Bauru";
            preco = 3.50;
        } else if (codigo == 3) {
            produto = "Kibe";
            preco = 4.80;
        } else if (codigo == 4) {
            produto = "Hambúrguer";
            preco = 8.90;
        } else if (codigo == 5) {
            produto = "Cheeseburguer";
            preco = 7.32;
        } else {
            preco = 0.0;
            System.out.println("Código inválido!");
        }


        System.out.println("Digite a quantidade comprada: ");
        quantidade = sc.nextInt();

    
        total = quantidade * preco;

        System.out.println("Total: " + total);

        sc.close();
    }
    
}
