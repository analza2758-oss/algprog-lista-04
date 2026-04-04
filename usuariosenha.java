import java.util.Scanner;

public class usuariosenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;

        System.out.print("Informe seu nome de usuário: ");
        String nome = sc.nextLine();

        do {
            System.out.print("Informe uma senha válida: ");
            senha = sc.nextLine();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("SENHA INVÁLIDA.");
            }
        } while (nome.equalsIgnoreCase(senha));

        System.out.println("CADASTRO FEITO COM SUCESSO!");

        sc.close();
    }
}
