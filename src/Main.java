public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: My Own Private Idaho");

        int anoDeLancamento = 1991;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8;

        double media = (9 + 6 + 3) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                 Filme de drama norte americano
                 Muito bom!
                 Ano de lançamento
                 """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}