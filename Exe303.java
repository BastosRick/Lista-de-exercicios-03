import java.util.Locale;
import java.util.Scanner;
public class Exe303 {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, nm;
        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextInt();
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextInt();
        System.out.print("Digite a terceira nota: ");
        n3 = sc.nextInt();
        
        if (n1 < n2 && n1 < n3) {
            nm = n1;
        } else if (n2 < n1 && n2 < n3) {
            nm = n2;
        } else {
            nm = n3;
        }
        System.out.printf("MENOR : %d %n", nm);
        sc.close();
    }
}


