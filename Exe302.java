import java.util.Locale;
import java.util.Scanner;
public class Exe302 {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double ca, cb, cc, x1, x2, delta;
        System.out.print("Coeficiente a: ");
        ca = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        cb = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        cc = sc.nextDouble();

        delta = Math.pow(cb, 2) - (4 * ca * cc);

        if (delta < 0) {
            System.out.println("Esta equacao nao possui raizes reais");
        } else {
            x1 = (-cb + Math.sqrt(delta)) / (2 * ca);
            x2 = (-cb - Math.sqrt(delta)) / (2 * ca);

            if (delta == 0) {
                System.out.printf("x1 = %.4f %n", x1);
                
                System.out.printf("x2 = %.4f %n", x1);
            } else {
                System.out.printf("x1 = %.4f %n", x1);
                
                System.out.printf("x2 = %.4f %n", x2);
            }
        }

        

        
            
        

        sc.close();
    }
}