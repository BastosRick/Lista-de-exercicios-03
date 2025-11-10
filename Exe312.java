import java.util.Scanner;
import java.util.Locale;

public class Exe312 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int hi, hf, dur;
        
        System.out.print("Digite a hora inicial do jogo: ");
        hi = scanner.nextInt();
        System.out.print("");
        System.out.print("Digite a hora final do jogo: ");
        hf = scanner.nextInt(); 
        
        if (hi < hf) {
            dur = hf - hi;
        } else {
            dur = (24 - hi) + hf;
        }
        
        if (dur < 1 || dur > 24) {
            System.out.println("Duração inválida! O jogo deve ter entre 1 e 24 horas.");
        } else {
            System.out.println("O jogo durou " + dur + " hora(s)");
        }
        
        scanner.close();
    }
}
