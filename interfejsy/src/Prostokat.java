public class Prostokat implements Figura {
    int x;
    int y;

    public Prostokat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void ObliczPole() {
        System.out.println(this.x*this.y);
    }

    @Override
    public void ObliczObwod() {
        System.out.println(this.x*2+this.y*2);
    }
}
