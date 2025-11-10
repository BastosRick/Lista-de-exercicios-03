import java.util.Locale;
import java.util.Scanner;
public class Exe304 {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double vp;
        int qm;
        System.out.print("Digite a quantidade de minutos: ");
        qm = sc.nextInt();
        
        if (qm > 100) {
            vp = (50.00 + (qm - 100) * 2);
            System.out.printf("Valor a pagar: R$ %.2f %n", vp);
            
        } else {
            System.out.printf("Valor a pagar: R$50.00 %n");
            
        }
            
        

        sc.close();
    }
}


