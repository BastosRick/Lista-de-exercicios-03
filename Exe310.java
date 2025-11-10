import java.util.Locale;
import java.util.Scanner;

public class Exe310 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        
        
        if (n1 == 0 || n2 == 0) {
        System.out.println("Zero é múltiplo de qualquer número, exceto de si mesmo.");
        } else if ((n1 % n2 == 0) || (n2 % n1 == 0)) {
        System.out.printf("São multiplos");
        } else {
            System.out.println(" Não são múltiplos");
        }
        
        scanner.close();
    }
}

