import java.util.*;

public class Zadanie4 {
    public static void zrob_zadanie()
    {
        Scanner cos = new Scanner(System.in);
        String string = cos.nextLine();
        String[] stringi = string.split("");
        Map<String, List<Integer>> mapa = new LinkedHashMap<>();
        List<Integer> lista = new LinkedList<>();
        for (int i = 0; i < stringi.length; i++) {
           //nie ma w mapie? wloz tam liste
            if (!mapa.containsKey(stringi[i])) {
                //lista.clear();
                //lista.add(i);
                mapa.put(stringi[i], new ArrayList<Integer>(Collections.singletonList(i)));//zwykłe list.of nie działa chuj wie czemu
                //System.out.println(stringi[i]);
                //System.out.println(mapa);
                //System.out.println(lista);

                //lista.clear();
            }
            else
            {
                //lista=mapa.get(stringi[i]);
                //lista.add(i);
                //System.out.println(lista);
//                lista = mapa.get(stringi[i]);
//                lista.add(i);
//                mapa.put(stringi[i], lista);
                lista= mapa.get(stringi[i]);
                lista.add(i); // Add current index to existing list
                mapa.put(stringi[i], lista);
                //System.out.println(mapa.get(lista));
            }
            //jest w mapie? doloz do listy w mapie (get.lista.add)


        }
        System.out.println(mapa);
    }
}


