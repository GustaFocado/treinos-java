import java.util.Scanner;

public class TreinoJava03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double a, b, c, areaTriangulo, areaTrapezio, areaQuadrado, areaRetangulo, areaCirculo;


        System.out.println("Digite o valor do lado A: ");
        a = sc.nextDouble();

        System.out.println("Digite o valor do lado B: ");
        b = sc.nextDouble();

        System.out.println("Digite o valor do lado C: ");
        c = sc.nextDouble();

        areaTriangulo = (a * c) / 2;
        areaTrapezio = ((a + b) * c) / 2;
        areaQuadrado = b * b;
        areaRetangulo = a * b;  
        areaCirculo = 3.14159 * (c * c);
        
        System.out.println("A área do triângulo é: " + String.format("%.2f", areaTriangulo));
        System.out.println("A área do trapézio é: " + String.format("%.2f", areaTrapezio));
        System.out.println("A área do quadrado é: " + String.format("%.2f", areaQuadrado));
        System.out.println("A área do retângulo é: " + String.format("%.2f", areaRetangulo));
        System.out.println("A área do círculo é: " + String.format("%.2f", areaCirculo));
        sc.close(); 



    }
    
}
