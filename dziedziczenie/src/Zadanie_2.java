public class Zadanie_2 {
    public static void zrob_zadanie()
    {
        String[] ksiazki={"Haryy Potter", "Jak zostalem papiezem"};
        String[] przysmaki={"paczek", "sernik"};

        Bookshop ksiegarnia = new Bookshop("Warszawa", 50, ksiazki);
        Bakery piekarnia = new Bakery("Gdansk", 60, przysmaki);

        System.out.println(ksiegarnia.getInformation());
        System.out.println(piekarnia.getInformation());

    }
}
