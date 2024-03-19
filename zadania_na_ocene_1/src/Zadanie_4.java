import java.util.Scanner;

public class Zadanie_4 {
    public static void zrobzadanie(){
        Scanner cos = new Scanner(System.in);
        String pierwsza=cos.next();
        char[] ten = pierwsza.toCharArray();
        int dlugi= ten.length;
        for(int i=dlugi-1; i>=0; i--)
        {
            System.out.print(ten[i]);
        }


    }
}
