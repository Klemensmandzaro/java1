import java.util.Scanner;

public class zadanie1 {
    public static void zrobzadanie(){
        Scanner cos = new Scanner(System.in);
        double promien=cos.nextDouble();
        double ob=Math.PI*promien;
        double pole=Math.PI*promien*promien;
        System.out.printf(ob+" "+pole);
    }
}
