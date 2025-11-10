import java.util.Locale;
import java.util.Scanner;
public class Exe307 {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double d1, d2, d3, dm;
        System.out.println("Digite as três distâncias : ");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        d3 = sc.nextDouble();
        
        if (d1 > d2 && d1 > d3) {
            dm = d1;
        } else if(d2 > d3){
            dm = d2;
        } else {
            dm = d3;
            
        }
        System.out.printf("MAIOR DITÂNCIA = %.2f %n", dm);
        sc.close();
    }
}


