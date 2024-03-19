import java.util.Scanner;

public class Zadanie_1 {
        public static void zrobzadanie(){
            Scanner cos = new Scanner(System.in);
            double pierwsza=cos.nextDouble();
            double druga=cos.nextDouble();
            if(druga==0)
            {
                System.out.print("Nie dzieli sie przez 0");
                return;
            }
            System.out.print(pierwsza/druga);
        }


}
