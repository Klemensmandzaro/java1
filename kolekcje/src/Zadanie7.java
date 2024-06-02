import java.util.ArrayList;
import java.util.List;

public class Zadanie7 {
    public static void zrob_zadanie(){
        List<String> lista= new ArrayList<String>();
        lista.add("A");
        lista.add("Bb");
        lista.add("Cc");
        lista.add("Dde");
        System.out.println(metoda(lista));
    }
    public static List<String> metoda(List<String> lista)
    {
        List<String> lista2 = new ArrayList<String>();
        for (String s : lista)
        {
            if (s.length()%2== 0)
            {
                lista2.add(s);
            }
        }
        return lista2;
    }
}
