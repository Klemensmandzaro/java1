public class Owoce_warzywa extends Produkty{
    public Owoce_warzywa(String nazwa, double cena, int stan) {
        super(nazwa, cena, stan);
    }

    @Override
    double getCena() {
        return this.cena*1.03;
    }

    @Override
    String getNazwa() {
        return this.nazwa;
    }
}
