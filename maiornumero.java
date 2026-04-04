import java.util.Scanner;

public class maiornumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Informe o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Informe o terceiro número: ");
        int n3 = sc.nextInt();
        System.out.print("Informe o quarto número: ");
        int n4 = sc.nextInt();
        System.out.print("Informe o quinto número: ");
        int n5 = sc.nextInt();
        

        int maior = n1;
        if (n2 > maior) {
            maior = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }

        if (n4 > maior) {
            maior = n4;
        }

        if (n5 > maior) {
            maior = n5;
        }

        System.out.println("O maior dos números é: " + maior);

        sc.close();
    }
}
