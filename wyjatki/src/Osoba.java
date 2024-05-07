public class Osoba {
    String imie;
    String nazwisko;
    int rok_urodzenia;

    public Osoba(String imie, String nazwisko, int rok_urodzenia) throws CotoException, WiekException{
        if (imie.isEmpty())
        {
            throw new CotoException ("Imie nie moze byc puste");
        }
        if (nazwisko.isEmpty())
        {
            throw new CotoException ("Nazwisko nie moze byc puste");
        }
        if (rok_urodzenia<1900 || rok_urodzenia>2020)
        {
            throw new WiekException("Wiek nie moze byc wiekszy od 2020 i mniejszy niz 1900");
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rok_urodzenia = rok_urodzenia;
    }
}
