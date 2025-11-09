import java.util.Locale;
import java.util.Scanner;
public class Exe301 {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double n1, n2, nf;
        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        nf = (n1 + n2);

        System.out.printf("Nota final: %.2f %n", nf);
        if (nf<60.00) {
            System.out.println("REPROVADO");
            
        }

        sc.close();
    }
}


