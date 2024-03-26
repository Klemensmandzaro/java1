import static java.lang.Math.pow;

public class MyCircle {
    double radius;

    public MyCircle(double radius){
        this.radius=radius;
    }

    public double pole(){
        double pole=pow(this.radius,2)*Math.PI;
        return pole;
    }

    public double obwod(){
        double obwod=(this.radius*2)*Math.PI;
        return obwod;
    }

    public double srednica(){
        double srednica=this.radius*2;
        return srednica;
    }
}
