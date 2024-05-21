public class Romb implements Figura, Comparable {
    int x;
    int y;

    public Romb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int ObliczPole() {
        return (this.x*this.y);

    }

    @Override
    public int ObliczObwod() {
        return (this.x*4);
    }

    @Override
    public int compareTo(Object o) {
        return this.ObliczPole() - ((Figura)o).ObliczPole();
    }


}
