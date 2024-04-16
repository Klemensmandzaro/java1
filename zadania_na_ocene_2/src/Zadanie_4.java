public class Zadanie_4 {
    public static void zrob_zadanie() {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.oblicz(Ulga.NORMALNY, Czas.JEDNORAZOWY);
        kalkulator.oblicz(Ulga.NORMALNY, Czas.DOBOWY);
        kalkulator.oblicz(Ulga.ULGOWY, Czas.GODZINNY);
        kalkulator.oblicz(Ulga.ULGOWY, Czas.DOBOWY);
    }
}
