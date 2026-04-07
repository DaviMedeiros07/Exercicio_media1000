public class Principal {

    public static void main(String[] args) {
        int soma = 0;
        int i = 1;

        while (i <= 1000) {
            soma = soma + i;
            i = i + 1;
        }

        float media = (float) soma / 1000;
        System.out.println("A media é: " + media);
    }
}