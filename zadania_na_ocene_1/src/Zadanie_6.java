import java.util.Scanner;

public class Zadanie_6 {
    public static void zrobzadanie(){
        Scanner cos = new Scanner(System.in);
        System.out.println("Podaj rozmiar tabeli");
        int rozmiar=cos.nextInt();
        double[] tablica= new double[rozmiar];
        double suma = 0;
        for(int i=0; i<rozmiar; i++)
        {
            System.out.println("Podaj "+ (i+1) +" numer w tabeli");
            tablica[i]=cos.nextDouble();
            suma+=tablica[i];
        }
        if(suma%5==0)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}
