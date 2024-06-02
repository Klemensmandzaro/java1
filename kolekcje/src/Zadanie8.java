import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zadanie8 {
    public static void zrob_zadanie(){
        Scanner cos = new Scanner(System.in);
        String ten = cos.nextLine();
        Set<String> to= new HashSet<>();
        for (String s : ten.split(" ")) {
            for (String t: s.split(""))
            {
                to.add(t);
            }
        }
        System.out.println(to.size());
    }
}
