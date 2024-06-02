import java.util.*;

public class Zadanie5 {
    public static void zrob_zadanie() {
        Scanner cos = new Scanner(System.in);
        String ten = cos.nextLine();
        String[] ta = ten.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("spolgloski", 0);
        map.put("samogloski", 0);
        List<String> samogloski = List.of("a","e","y","u","i","o", "A", "E", "Y", "U", "I", "O");
        for (String s : ta) {
            String[] t=s.split("");
            for (String k : t) {
                if (samogloski.contains(k)) {
                    map.put("samogloski", map.getOrDefault("samogloski", 0) + 1);
                }
                else
                {
                    map.put("spolgloski", map.getOrDefault("spolgloski", 0) + 1);
                }
            }
        }
        System.out.println(map);

    }
}
