import java.util.Scanner;

public class Gra {
    public static void gra(){
        Scanner cos = new Scanner(System.in);
        System.out.println("Podaj zakres liczb");
        int start = cos.nextInt();
        int koniec= cos.nextInt();
        double liczba = Math.round(((Math.random()*(koniec-start))+start));
        System.out.println("Podaj jaka liczbe wylosowalo");

        for (int i=0; i<5; i++)
        {
            double zgadnij = cos.nextDouble();
            if (zgadnij==liczba)
            {
                System.out.println("Zgadłeś!!!");
                return;
            }
            else if (zgadnij<liczba)
            {
                System.out.println("Za mało");
            }
            else
            {
                System.out.println("Za duzo");
            }
        }
        System.out.println("Nie zgadles");

    }
}
