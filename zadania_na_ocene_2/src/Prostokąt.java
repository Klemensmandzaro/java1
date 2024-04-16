public class Prostokąt {
    int a;
    int b;

    public Prostokąt(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Prostokąt(int a) {
        this.a = a;
        this.b = a;
    }

    public void obwod()
    {
        int ob=(this.a*2)+(this.b*2);
        System.out.println("Obwod jest rowny: "+ob);
    }

    public void pole()
    {
        int pole=this.a*this.b;
        System.out.println("Pole jest rowne: "+pole);
    }
}
