import java.util.Scanner;

public class informacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nome;
        int idade;
        double salario;
        String EstadoCivil;

        do {
            System.out.print("Informe o seu nome: ");
             nome = sc.nextLine();

            if (nome.length() <= 3) {
                System.out.println("Nome inválido.");
            }
        } while (nome.length() <= 3);

        do {
            System.out.print("Informe a sua idade: ");
            idade = sc.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("IDADE INVÁLIDA.");
            }
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Informe o seu salário: ");
            salario = sc.nextDouble();

            if (salario < 0) {
                System.out.println("SALÁRIO INVÁLIDO.");
            }
        } while (salario < 0);

        sc.nextLine();
    String sexo;
   
        do {
        System.out.println("Informe seu sexo:");
        System.out.println("F= FEMININO");
        System.out.println("M=MASCULINO");
        sexo = sc.nextLine().toUpperCase();

        switch (sexo) {
            case "F":
            case "M":
                break;  
        
            default: 
            System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
        } while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M"));

        do {
        System.out.println("Informe seu Estado Civil:");
        System.out.println("S-SOLTEIRO(A)");
        System.out.println("C-CASADO(A)");
        System.out.println("V-VIÚVO(A)");
        System.out.println("D-DIVORCIADO(A)");
        EstadoCivil = sc.nextLine();

        switch (EstadoCivil) {
            case "S":
            case "C":
            case "V":
            case "D":        
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
    } while (!EstadoCivil.equalsIgnoreCase("S") && !EstadoCivil.equalsIgnoreCase("C") && !EstadoCivil.equalsIgnoreCase("V") && !EstadoCivil.equalsIgnoreCase("V"));
    sc.close();
}
}
