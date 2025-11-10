import java.util.Locale;
import java.util.Scanner;
public class Exe306 {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double mg;
        System.out.print("Digite a medida da glicose: ");
        mg = sc.nextDouble();
    if (mg > 140) {
        System.out.println("Classificação: diabetes");
    } else if(mg > 100){
        System.out.println("Classificação: elevado");
    }else{
        System.out.println("Classificação: normal");
    }

        sc.close();
    }
}


