public class Karta {
    Kolor kolor;
    Figura figura;

    public Karta(Kolor kolor, Figura figura) {
        this.kolor = kolor;
        this.figura = figura;
    }

    public String toString(){
        String tak = kolor.toString()+" "+figura.toString();
        return tak;
    }
}
