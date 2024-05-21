public class Kwadrat implements Figura{
    int x;

    public Kwadrat(int x) {
        this.x = x;
    }

    @Override
    public void ObliczPole() {
        System.out.println(this.x*this.x);
    }

    @Override
    public void ObliczObwod() {
        System.out.println(this.x*4);
    }
}
