import java.util.Scanner;

public class Zadanie_3 {

    public static int compare (int pierwsza, int druga) {
        int liczba;
        if (pierwsza>druga)
        {
            liczba=-1;
        }
        else if (pierwsza==druga)
        {
            liczba=0;
        }
        else
        {
            liczba=1;
        }
        return liczba;

    }
}
