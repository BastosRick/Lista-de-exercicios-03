import java.util.Locale;
import java.util.Scanner;
public class Exe309 {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double qc, vp;
        int id;
        System.out.print("Código do produto comprado :");
        id = sc.nextInt();
        System.out.print("Quantidade comprada :");
        qc = sc.nextDouble();

        switch (id) {
        case 1:
        vp = qc * 5.00;
        System.out.printf("Valor a pagar: R$ %.2f %n", vp);
        break;
        case 2:
        vp = qc * 3.50;
        System.out.printf("Valor a pagar: R$ %.2f %n", vp);
        break;
        case 3:
        vp = qc * 4.80;
        System.out.printf("Valor a pagar: R$ %.2f %n", vp);
        break;
        case 4:
        vp = qc * 8.90;
        System.out.printf("Valor a pagar: R$ %.2f %n", vp);
        break;
        case 5:
        vp = qc * 7.32;
        System.out.printf("Valor a pagar: R$ %.2f %n", vp);
        break;
        default:
        System.out.println("Código inválido!");
        break;
        }

        sc.close();
    }
}


