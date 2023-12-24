import java.util.Scanner;

public class funcionarioPrincipal {
    public static void main(String[] args) {
        String name;
        double salary;
        Scanner sc = new Scanner(System.in);
        int id, n = 0;
        System.out.println("Quantos funcionarios deseja cadastrar? ");
        n = sc.nextInt();

        Funcionarios vetor[];
        vetor = new Funcionarios[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Digite o nome, id e salario do funcionario " + i);
            sc.nextLine();
            name = sc.nextLine();
            id = sc.nextInt();
            salary = sc.nextDouble();
            vetor[i] = new Funcionarios(name, id, salary);
        }

        int idRaise, percentage;
        System.out.println("Digite o id do funcionario que recebera o aumento: ");
        idRaise = sc.nextInt();
        System.out.println("Digite a porcentagem de aumento: ");
        percentage = sc.nextInt();

        for(int j = 0; j < n; j++)
        {
            if(vetor[j].getId() == idRaise)
                vetor[j].salaryIncrease(percentage);
        }

        System.out.println("List of employees: ");

        for(int k = 0; k < n; k++)
        {
            System.out.println(vetor[k].getId() + ", " + vetor[k].getName() + ", " + vetor[k].getSalary());
        }

        sc.close();
    }
}
