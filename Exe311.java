import java.util.Locale;
import java.util.Scanner;
public class Exe311 {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double sal, nsal, asal;
        System.out.print("Digite o salário atual: ");
        sal = sc.nextDouble();
        if (sal <= 1000.00) {
            nsal = sal + (sal * 0.20);
            asal = nsal - sal;
        } else if (sal <= 3000.00) {
            nsal = sal + (sal * 0.15);
            asal = nsal - sal;
        } else if (sal <= 8000.00) {
            nsal = sal + (sal * 0.10);
            asal = nsal - sal;
        } else {
            nsal = sal + (sal * 0.05);
            asal = nsal - sal;
        }
        System.out.printf("Novo salário R$ %.2f %n", nsal);
        System.out.printf("Aumento: R$ %.2f %n", asal);
        System.out.printf("Porcentagem %.0f %% %n", (asal / sal) * 100);
        
        

        sc.close();
    }
}


