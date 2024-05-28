import java.util.*;

public class Zadanie4 {
    public static void zrob_zadanie()
    {
        Scanner cos = new Scanner(System.in);
        String string = cos.nextLine();
        String[] stringi = string.split("");
        Map<String, List<Integer>> mapa = new LinkedHashMap<>();
        for (int i = 0; i < stringi.length; i++) {
           //nie ma w mapie? wloz tam liste

            //jest w mapie? doloz do listy w mapie (get.lista.add)

            mapa.put(stringi[i], arrList);
        }
        System.out.println(mapa);
    }
}
