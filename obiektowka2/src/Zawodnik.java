import java.util.Random;

public class Zawodnik {
    String imie;
    double predkosc_minimalna;
    double predkosc_maksymalna;
    double odleglosc;

    public Zawodnik(String imie, double predkosc_minimalna, double predkosc_maksymalna) {
        this.imie = imie;
        this.predkosc_minimalna = predkosc_minimalna;
        this.predkosc_maksymalna = predkosc_maksymalna;
        this.odleglosc = 0;
    }

    public void przedstawSie(){
        System.out.println("Jestem "+this.imie+ " biegne z predkoscia "+this.predkosc_minimalna+"-"+this.predkosc_maksymalna+"km/h");
    }

    public void biegnij(){
        Random gg = new Random();
        double dystans = gg.nextDouble(this.predkosc_maksymalna-this.predkosc_minimalna)+this.predkosc_minimalna;
        this.odleglosc+=dystans;
    }
}
