import java.util.Scanner;

public class Ułamek {
    Scanner cos = new Scanner(System.in);

    public static void wyswietlanie(int licznik, int mianownik)
    {
        System.out.println(licznik);
        System.out.println("---");
        System.out.println(mianownik);
    }

    public static int[] dopasowanie(int licznik1, int mianownik1, int licznik2, int mianownik2)
    {
        if (mianownik1!=mianownik2)
        {
            int b=mianownik1;
            licznik1*=mianownik2;
            mianownik1*=mianownik2;
            licznik2*=b;
            mianownik2*=b;
        }
        int[] ulamki= new int [4];
        ulamki[0]=licznik1;
        ulamki[1]=mianownik1;
        ulamki[2]=licznik2;
        ulamki[3]=mianownik2;
        return ulamki;
    }

    public static void dodawanie(int ulamki[])
    {
        System.out.println();
        System.out.println((ulamki[0]+ulamki[2]));
        System.out.println("---");
        System.out.println(ulamki[1]);
    }

    public static void odejmowanie(int ulamki[])
    {
        System.out.println();
        System.out.println((ulamki[0]-ulamki[2]));
        System.out.println("---");
        System.out.println(ulamki[1]);
    }

    public static void mnozenie(int licznik1, int mianownik1, int licznik2, int mianownik2)
    {
        System.out.println();
        System.out.println((licznik1*licznik2));
        System.out.println("---");
        System.out.println((mianownik1*mianownik2));
    }

    public static void dzielenie(int licznik1, int mianownik1, int licznik2, int mianownik2)
    {
        System.out.println();
        System.out.println((licznik1*mianownik2));
        System.out.println("---");
        System.out.println((licznik2*mianownik1));
    }
}
