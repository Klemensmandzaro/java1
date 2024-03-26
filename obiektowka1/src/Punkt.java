import static java.lang.Math.sqrt;

public class Punkt {
    double x;
    double y;

    public Punkt(){
        this.x=0;
        this.y=0;
    }
    public Punkt(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public double odlegloscod0(double x, double y){
        double odleglosc=sqrt(((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y)));
        return odleglosc;
    }

    public double odlegloscodp(Punkt nazwa){
        double odleglosc=sqrt(((nazwa.x-this.x)*(nazwa.x-this.x))+((nazwa.y-this.y)*(nazwa.y-this.y)));
        return odleglosc;
    }
}
