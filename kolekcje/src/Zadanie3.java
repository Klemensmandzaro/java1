import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Zadanie3 {
    public static void zrob_zadanie(){
        String string = "Ala ma kota a kot ma Ale";
        String[] stringi = string.split("[,\\.\\s]");
        Map<String, Integer> mapa = new LinkedHashMap<>();
        for (String ten:stringi)
        {
            if (mapa.containsKey(ten))
            {

                mapa.put(ten, mapa.get(ten)+1);
            }
            else
            {
                mapa.put(ten, 1);
            }
        }
        System.out.println(mapa);
    }
}
