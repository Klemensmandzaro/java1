import java.util.Arrays;

public class Zadanie3 {
    public static void zrob_zadanie(){
        Osoba rafal = new Osoba("Radal", "Kowalski");
        Osoba krzys = new Osoba("Krzys","Babs");
        Osoba kamil = new Osoba("Kamil", "Klemiato");

        Osoba[] osoby={rafal, krzys, kamil};
        for (int i = 0; i < 3; i++) {
            System.out.println(osoby[i]);
        }
        Arrays.sort(osoby);

        for (int i = 0; i < 3; i++) {
            System.out.println(osoby[i]);
        }
    }
}
