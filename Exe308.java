import java.util.Locale;
import java.util.Scanner;

public class Exe308 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual escala você usará para inserir a temperatura? (C para Celsius ou F para Fahrenheit): ");
        String escala = scanner.next().toUpperCase();
        
        double temp, conv;
        
        if (escala.equals("C")) {
            System.out.print("Digite a temperatura em Celsius: ");
            temp = scanner.nextDouble();
            conv = (temp * 9/5) + 32;
            
            System.out.printf("Temperatura em Celsius: %.2f°C%n", temp);
            System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", conv);
            
        } else if (escala.equals("F")) {
            // Converter de Fahrenheit para Celsius
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temp = scanner.nextDouble();
            conv = (temp - 32) * 5/9;
            
            System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", temp);
            System.out.printf("Temperatura em Celsius: %.2f°C%n", conv);
            
        } else {
            System.out.println("Escala inválida! Digite 'C' para Celsius ou 'F' para Fahrenheit.");
        }
        
        scanner.close();
    }
}
