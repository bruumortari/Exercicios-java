import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite o numero de pessoas (n): ");
        n = sc.nextInt();

        double vetor[], media = 0;
        vetor = new double[n];

        for(int i = 0; i < n; i++)
        {
            System.out.printf("Digite a altura da pessoa %d em cm: ", i+1);
            vetor[i] = sc.nextDouble();
        }

        for(int j = 0; j < n; j++)
        {
            media = media + vetor[j];
        }

        System.out.printf("A media das alturas eh %.2f cm", media/n);

        sc.close();
    }
}
