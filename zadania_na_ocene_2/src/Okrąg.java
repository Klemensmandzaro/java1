public class Okrąg {
    Punkt punkt;
    double promien;

    public Okrąg(Punkt punkt, double promien) {
        this.punkt = punkt;
        this.promien = promien;
    }

    public boolean czy_jest(Punkt ten)
    {
        double odleglosc=Math.sqrt(Math.pow((this.punkt.x- ten.x), 2)+Math.pow((this.punkt.y-ten.y),2));
        if (odleglosc<this.promien)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
