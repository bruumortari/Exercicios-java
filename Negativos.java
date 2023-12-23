import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean teste = true;

        System.out.println("Digite um numero (n) entre 0 e 10: ");
        n = sc.nextInt();

        while(teste == true)
        {
            if(n < 0 || n > 10)
            {
                System.out.println("Erro! Digite novamente...");
                System.out.println("Digite um numero (n) entre 0 e 10: ");
                n = sc.nextInt();
            }
            else
                teste = false;
        }

        int vetor[];
        vetor = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.printf("Digite o numero na posicao %d: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        System.out.println("NEGATIVOS: ");

        for(int j = 0; j < n; j++)
        {
            if(vetor[j] < 0)
            {
                System.out.printf("%d", vetor[j]);
                System.out.println();
            }
        }

        sc.close();
    }
}
