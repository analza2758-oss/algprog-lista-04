public class populacao {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaoB = 200000;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA = populacaoA + (populacaoA * 0.3);
            populacaoB = populacaoB + (populacaoB * 1.5);
            anos++;
        } 

        System.out.println("Anos necessários: " + anos);
        System.out.println("População A: " + (int)populacaoA);
        System.out.println("População B: " + (int)populacaoB);

    }
}
