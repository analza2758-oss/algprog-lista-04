import java.util.Scanner;

public class umevinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("--- NÚMERO UM ABAIXO DO OUTRO ---");
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }
    System.out.println("--- NÚMERO UM AO LADO DO OUTRO ---");
        for (int i = 0; i < 21; i++) {
            System.out.print(i + " ");
        }
        sc.close();
}

}
