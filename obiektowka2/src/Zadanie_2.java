public class Zadanie_2 {
    public static void zrob_zadanie() {
        Figura[] figury = Figura.values();
        Kolor[] kolory = Kolor.values();

        for (int i = 0; i < figury.length; i++) {
            for (int j = 0; j < kolory.length; j++)
            {
                Karta karta = new Karta(kolory[j], figury[i]);
                System.out.println(karta);

            }

        }
    }
}
