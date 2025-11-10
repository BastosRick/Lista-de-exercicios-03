import java.util.Locale;
import java.util.Scanner;
public class Exe305 {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double pu, vp,vc,  ft;
        int qt;
        System.out.print("Preço unitário do produto: ");
        pu = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qt = sc.nextInt();
        System.out.print("Dinheiro recebido:");
        vp = sc.nextDouble();

        vc = pu * qt;

        if (vp > vc) {
            ft = vp - vc;
            System.out.printf("TROCO = R$ %.2f %n", ft);
            
        } else if (vp == qt) {
            System.out.printf("Valor pago corretamente. %n");
        } else {
            ft = vc - vp;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$ %.2f %n", ft);
        }

        sc.close();
    }
}


