import java.util.Scanner;

public class pensionatoPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, quarto;
        String name;

        System.out.println("Quantos quartos serao alugados?");
        n = sc.nextInt();

        Pensionato vetor[];
        vetor = new Pensionato[n];

        for(int i = 0; i < n; i++)
        {
            System.out.printf("Digite as informacoes do primeiro aluguel: ");
            sc.nextLine();
            name = sc.nextLine();
            quarto = sc.nextInt();
            vetor[i] = new Pensionato(name, quarto);
            System.out.println();
        }

        System.out.println("Quartos alugados: ");
        for(int j = 0; j < n; j++)
        {
            System.out.printf("%d: %s", vetor[j].getQuarto(), vetor[j].getName());
            System.out.println();
        }

        sc.close();
    }
}
