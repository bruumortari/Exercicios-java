import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        //Não pode List<int>
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Ana");
        list.add(2, "Marco");
        //list.remove("Ana");
        //list.remove(1)
        //list.removeIf(x -> x.charAt(0) == 'M');
        //Filtrar
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        for(String nome : list)
        {
            System.out.println(nome);
        }

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
    
         for(String nome : result)
        {
            System.out.println(nome);
        }

        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);

    }
}
