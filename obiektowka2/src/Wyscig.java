public class Wyscig {
    public static void wyscig() {
        Zawodnik Robert= new Zawodnik("Robert", 2, 12);
        Zawodnik Adam= new Zawodnik("Adam", 3, 11);
        Zawodnik Marek= new Zawodnik("Marek", 2, 14);

        while (Marek.odleglosc<50 && Robert.odleglosc<50 && Adam.odleglosc<50)
        {
            Marek.biegnij();
            Robert.biegnij();
            Adam.biegnij();
        }
        if (Marek.odleglosc>Robert.odleglosc && Marek.odleglosc>Adam.odleglosc)
        {
            Marek.przedstawSie();
        }
        else if (Robert.odleglosc>Adam.odleglosc && Robert.odleglosc>Marek.odleglosc)
        {
            Robert.przedstawSie();
        }
        else
        {
            Adam.przedstawSie();
        }
    }
}
