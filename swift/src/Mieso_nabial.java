public class Mieso_nabial extends Produkty{

    public Mieso_nabial(String nazwa, double cena, int stan) {
        super(nazwa, cena, stan);
    }

    @Override
    double getCena() {
        return (this.cena*1.05);
    }

    @Override
    String getNazwa() {
        return this.nazwa;
    }
}
