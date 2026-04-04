import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < 51; i++) {
            if (i % 2 != 0) {
                 System.out.println(i);
            }
        }
        sc.close();
    }
}
