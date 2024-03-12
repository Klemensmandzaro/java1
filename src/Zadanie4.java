import java.util.Scanner;

public class Zadanie4 {
    public static void zrobzadanie(){
        Scanner cos = new Scanner(System.in);
        String slowo= cos.next();
        int dl = slowo.length();
        char[] slowo1= slowo.toCharArray();
        for (int i=0; i<dl-1; i++)
        {
            if (slowo1[i]!=slowo1[dl-1-i])
            {
                System.out.print("Nie jest");
                return;
            }
        }
        System.out.print("jest");
    }
}
