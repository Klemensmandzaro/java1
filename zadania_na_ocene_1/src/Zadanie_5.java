import java.util.Scanner;

public class Zadanie_5 {
    public static void zrobzadanie(){
        Scanner cos = new Scanner(System.in);
        double[] tablica= new double[5];

        for(int i=0; i<5; i++)
        {
            tablica[i]=cos.nextDouble();
        }
        for(int i=0; i<5; i++)
        {

            System.out.printf(tablica[i]*3 + " ");
        }

    }
}
