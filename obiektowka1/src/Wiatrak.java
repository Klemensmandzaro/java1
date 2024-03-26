public class Wiatrak {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    int speed;
    boolean on;
    int radius;
    String color;

    public Wiatrak(int speed, boolean on, int radius, String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }

    public Wiatrak(){
        this.speed=0;
        this.on=false;
        this.radius=10;
        this.color="bialy";
    }

    public String informacje(){
        String informacje="predkosc wiatraka: "+this.speed+", status odpalenia "+this.on+", promien "+this.radius+", kolor "+this.color;
        return informacje;
    }
}
