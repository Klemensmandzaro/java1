import java.util.Arrays;
import java.util.Scanner;

public class zadanie_1 {
    public static void zrobzadanie(){
        Scanner cos = new Scanner(System.in);
        System.out.println("Podaj rozmiar 1 tablicy");
        int rozmiar1 = cos.nextInt();
        int[] tablica1 = new int[rozmiar1];
        int[] tablica3 = new int[rozmiar1];
        for (int i=0; i<rozmiar1; i++)
        {
            System.out.println("Podaj "+(i+1)+" wyraz tablicy");
            tablica1[i]= cos.nextInt();
        }
        System.out.println("Podaj rozmiar 2 tablicy");
        int rozmiar2 = cos.nextInt();
        int[] tablica2 = new int[rozmiar2];
        for (int i=0; i<rozmiar2; i++)
        {
            System.out.println("Podaj "+(i+1)+" wyraz tablicy");
            tablica2[i]= cos.nextInt();
        }
        if (rozmiar1!=rozmiar2)
        {
            System.out.println(Arrays.toString(tablica3));
        }
        else
        {
            for (int i=0; i<rozmiar1; i++)
            {
                tablica3[i]= tablica1[i]+tablica2[i];

            }
            System.out.println(Arrays.toString(tablica3));
        }
    }
}
