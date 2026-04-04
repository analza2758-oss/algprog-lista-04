import java.util.Scanner;

public class somaemedia {
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

        int Soma = n1 + n2 + n3 + n4 + n5;
        int média = (n1 + n2 + n3 + n4 + n5) / 5;

        System.out.println("A soma dos números é: " + Soma);
        System.out.println("A média é: " + média);

        sc.close();
    }
}
