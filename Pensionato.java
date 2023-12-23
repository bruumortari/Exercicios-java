public class Pensionato {

    private String name;
    private int quarto;

    public Pensionato(String name, int quarto)
    {
        this.name = name;
        this.quarto = quarto;
    }

    public String getName()
    {
        return name;
    }

    public int getQuarto()
    {
        return quarto;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setQuarto(int quarto)
    {
        this.quarto = quarto;
    }
}
