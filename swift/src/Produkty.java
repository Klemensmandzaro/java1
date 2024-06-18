public abstract class Produkty {
    String nazwa;
    double cena;
    int stan;

    public Produkty(String nazwa, double cena, int stan) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.stan = stan;
    }

    abstract double getCena();

    abstract String getNazwa();
}
