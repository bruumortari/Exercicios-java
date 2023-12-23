public class Pessoas {

    private String name;
    private int idade;
    private double altura;

    public Pessoas(String name, int idade, double altura)
    {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String getName()
    {
        return name;
    }

        public int getIdade()
    {
        return idade;
    }

        public double getAltura()
    {
        return altura;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }
}
