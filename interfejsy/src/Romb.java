public class Romb implements Figura{
    int x;
    int y;

    public Romb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void ObliczPole() {
        System.out.println("nie wiem");
    }

    @Override
    public void ObliczObwod() {
        System.out.println(this.x*2+this.y*2);
    }
}
