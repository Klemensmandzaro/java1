import java.util.Scanner;

public class Zadanie_4 {
    public static void zrob_zadanie(){
        tworzenie_osoby();
    }

    public static void tworzenie_osoby()
    {
        Scanner cos = new Scanner(System.in);
        String imie= cos.nextLine();
        String nazwisko = cos.nextLine();
        int rok_urodzenia= cos.nextInt();

        try {
            Osoba o = new Osoba(imie, nazwisko, rok_urodzenia);
        } catch (CotoException e) { // 1
            System.out.println("Nieprawidlowa wartosc: " + e.getMessage());
            tworzenie_osoby();
        } catch (WiekException e) { // 2
            System.out.println("Nieprawidlowy wiek!");
            tworzenie_osoby();
        }
    }
}
