import java.util.Scanner;

public class Zadanie2 {
    public static void zrobzadanie(){
        Scanner cos = new Scanner(System.in);
        int n= cos.nextInt();
        int[] tablica= new int[n];
        for (int i=0; i<n; i++)
        {
            int m= cos.nextInt();
            tablica[i]=m;
        }
        for (int i=n-1; i>=0; i--)
        {
            System.out.println(tablica[i]);
        }
    }
}
