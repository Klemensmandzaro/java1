public class Koszyk {
    Produkty produkt;
    int ilosc;

    public Koszyk(Produkty produkt, int ilosc) {
        this.produkt = produkt;
        this.ilosc = ilosc;
    }

    public void kup(){
        this.produkt.stan-=this.ilosc;
    }

    public void cena(){
        this.produkt.cena*=this.ilosc;
    }
}
