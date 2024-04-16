public class Zadanie_3 {
    public static void zrob_zadanie() {

        Punkt pierwszy = new Punkt(2, 1);
        Okrąg jeden = new Okrąg(pierwszy, 5);
        Punkt drugi = new Punkt(3, 4);

        System.out.println(jeden.czy_jest(drugi));
    }
}
