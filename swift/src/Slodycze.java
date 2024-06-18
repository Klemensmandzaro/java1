public class Slodycze extends Produkty{
    public Slodycze(String nazwa, double cena, int stan) {
        super(nazwa, cena, stan);
    }

    @Override
    double getCena() {
        return this.cena*1.08;
    }

    @Override
    String getNazwa() {
        return this.nazwa;
    }
}
