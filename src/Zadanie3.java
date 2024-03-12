import java.util.Scanner;

public class Zadanie3 {
    public static void zrobzadanie(){
        Scanner cos = new Scanner(System.in);
        String czas=cos.nextLine();
        String[] czasek= czas.split(":");
        int godz= Integer.parseInt(czasek[0]);
        if (godz>12)
        {
         System.out.printf(godz-12 + ":" + czasek[1] + " " + "PM");
        }
        else
        {
         System.out.printf(czas + " AM");
        }
    }
}
