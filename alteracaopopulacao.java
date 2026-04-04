import java.util.Scanner;

public class alteracaopopulacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos = 0;

        System.out.print("Informe a populaçao do país A: ");
        double paisA = sc.nextDouble();
        System.out.print("Informe a taxa de crescimento do país A: ");
        double taxaA = sc.nextDouble();
        System.out.print("Informe a populaçao do país B: ");
        double paisB = sc.nextDouble();
        System.out.print("Informe a taxa de crescimento do país B: ");
        double taxaB = sc.nextDouble();

       while (paisA < paisB) {
            paisA = paisA + (paisA * (taxaA/100));
            paisB = paisB + (paisB * (taxaB/100));
            anos++;
       }


        System.out.println("Anos necessários: " + anos);
        System.out.println("Populaçao A: " + (int)paisA);
        System.out.println("Populaçao B: " + (int)paisB);

     sc.close();
    }
}
