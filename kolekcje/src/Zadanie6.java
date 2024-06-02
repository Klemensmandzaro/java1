import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zadanie6 {
    public static void zrob_zadanie(){
        Scanner cos = new Scanner(System.in);
        int suma=0;
        Set<Integer> set = new HashSet<Integer>();
        while (set.size()<10)
        {
            int ten = cos.nextInt();
            set.add(ten);
        }
        for (int a : set) {
            suma+=a;
        }
        System.out.println(suma);
    }
}
