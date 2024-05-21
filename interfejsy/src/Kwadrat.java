public class Kwadrat implements Figura, Comparable {
    int x;

    public Kwadrat(int x) {
        this.x = x;
    }

    @Override
    public int ObliczPole() {
        return (this.x*this.x);
    }

    @Override
    public int ObliczObwod() {
        return (this.x*4);
    }

    @Override
    public int compareTo(Object o) {
        return this.ObliczPole() - ((Kwadrat) o).ObliczPole();
    }
}
