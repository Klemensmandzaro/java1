import java.util.Scanner;

public class Zadanie_5 {
    public static void zrob_zadanie() {
        Scanner cos = new Scanner(System.in);
        String ulamek1 = cos.nextLine();
        String ulamek2 = cos.nextLine();
        char[] ulamekk1=ulamek1.toCharArray();
        char[] ulamekk2=ulamek2.toCharArray();
        int licznik1=ulamekk1[0]-48;
        int mianownik1=ulamekk1[2]-48;
        int licznik2=ulamekk2[0]-48;
        int mianownik2=ulamekk2[2]-48;
        Ułamek.wyswietlanie(licznik1, mianownik1);
        System.out.println();
        Ułamek.wyswietlanie(licznik2, mianownik2);
        System.out.println();

        int [] ulamki=Ułamek.dopasowanie(licznik1, mianownik1, licznik2, mianownik2);

        Ułamek.dodawanie(ulamki);
        Ułamek.odejmowanie(ulamki);

        Ułamek.mnozenie(licznik1, mianownik1, licznik2, mianownik2);
        Ułamek.dzielenie(licznik1, mianownik1, licznik2, mianownik2);
    }
}
