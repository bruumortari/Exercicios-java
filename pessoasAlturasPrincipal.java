import java.util.Scanner;

public class pessoasAlturasPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, idade;
        String name;
        double altura, alturaMedia = 0;

        System.out.println("Quantas pessoas serao digitadas?");
        n = sc.nextInt();

        Pessoas[] vetor = new Pessoas[n];

        for(int i = 0; i < n; i++)
        {
            System.out.printf("Dados da pessoa %d: ", i+1);
            sc.nextLine();
            name = sc.nextLine();
            idade = sc.nextInt();
            altura = sc.nextDouble();
            vetor[i] = new Pessoas(name, idade, altura);
        }

        for(int j = 0; j < n; j++)
        {
            alturaMedia = alturaMedia + vetor[j]. getAltura();
        }

        alturaMedia = alturaMedia/n;

        System.out.printf("Media das alturas = %.2f", alturaMedia);
        System.out.println();

        double menor16 = 0;

        for(int k = 0; k < n; k++)
        {
            if(vetor[k].getIdade() < 16)
            {
                System.out.printf("%s tem menos de 16 anos", vetor[k].getName());
                System.out.println();
                menor16++;
            }
        }

        menor16 = menor16/n * 100;

        System.out.printf("%.2f por cento das pessoas tem menos de 16 anos", menor16);

        sc.close();
    }
}
