public class Funcionarios {
    
    private String name;
    private int id;
    private double salary;

    public Funcionarios(String name, int id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void salaryIncrease(double percentage)
    {
        double result;
        result = percentage/100;
        result = result + 1;
        salary = salary * result;
    }
}
