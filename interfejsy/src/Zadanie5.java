import java.util.Arrays;

public class Zadanie5 {
    public static void zrob_zadanie(){
        Kwadrat kwadrat = new Kwadrat(5);
        Prostokat prostokat= new Prostokat(4, 5);
        Romb romb=new Romb(5, 5);
        Figura[] figura= {kwadrat, prostokat, romb};
//        for (int i = 0; i < 3; i++) {
//            System.out.println(figura[i].ObliczObwod());
//            System.out.println(figura[i].ObliczPole());
//        }

        Arrays.sort(figura);
        for (int i = 0; i < 3; i++) {
            System.out.println(figura[i].ObliczObwod());
            System.out.println(figura[i].ObliczPole());
        }
    }
}
