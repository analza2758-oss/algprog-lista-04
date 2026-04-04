import java.util.Scanner;

public class zeroedez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Digite uma nota (0 a 10): ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
             System.out.println("NÚMERO INVÁLIDO.");
            }
        } while ( nota < 0 || nota > 10);

        System.out.print("NÚMERO VÁLIDO.");

        sc.close();
    }
}
