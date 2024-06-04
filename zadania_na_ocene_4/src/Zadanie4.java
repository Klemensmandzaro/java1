import java.util.*;

public class Zadanie4 {
    public static void zrob_zadanie(){
        Scanner cos = new Scanner(System.in);
        String ten = cos.nextLine();
        ten=ten.toUpperCase();
        String[] to=ten.split(" ");
        List<String> lista = List.of("A", "E", "Y", "U", "I", "O");
        Map<String, Integer> mapa= new HashMap<>();
        for (String s : to)
        {
            String[] k=s.split("");
            for (String ta : k)
            {
                if (lista.contains(ta))
                {
                    mapa.put(ta, mapa.getOrDefault(ta, 0) + 1);
                }
            }
        }
        System.out.println(mapa);

    }
}
