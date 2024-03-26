import java.util.Scanner;

public class zadanie_2 {
    public static void zrobzadanie() {
        Scanner cos = new Scanner(System.in);
        int podaj=1;
        int i=0;
        while(podaj!=0)
        {
            podaj= cos.nextInt();
            kwadrat nowy = new kwadrat(podaj);
            System.out.println(nowy.obwod()+" "+ nowy.pole());

        }
    }
}
