import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Zadanie1 {
    public static void zrob_zadanie(){
        LinkedList<String> lista = new LinkedList<>();
        lista.add("1");
        lista.add("1");
        lista.add("12");
        System.out.println(duplikaty(lista));
        lista.add("1");
        lista.add("1");
        lista.add("12");
        System.out.println(brakdup((lista)));

    }

    public static LinkedList<String> duplikaty(LinkedList<String> lista)
    {
        LinkedList<String> lista2= new LinkedList<>();
        for (int i = 0; i < lista.size(); i++) {


            if (lista.lastIndexOf(lista.get(i))!=i)
            {
                lista2.add(lista.get(i));
            }
        }
        return lista2;
    }

    public static LinkedList<String> brakdup(LinkedList<String> lista)
    {
        Set<String> set = new LinkedHashSet<>();
        set.addAll(lista);
        LinkedList<String> lista2= new LinkedList<>();
        lista2.addAll(set);

        return lista2;
    }
}
