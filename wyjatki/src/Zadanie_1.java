import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie_1 {
    public static void zrob_zadanie(){
        Scanner cos = new Scanner(System.in);
        int a=pobierz_liczbe();
        int b=pobierz_liczbe();

        dzialanie(a, b);
    }

    public static int pobierz_liczbe()
    {
        Scanner cos = new Scanner(System.in);
        int liczba;
        try {
            liczba = cos.nextInt();
        } catch (InputMismatchException e)
        {
            System.out.println("Podaj liczbe jeszcze raz bo byla zla");
            liczba=pobierz_liczbe();
        }
        return liczba;
    }

    public static void dzialanie(int a, int b)
    {
        Scanner cos = new Scanner(System.in);
        String znak = cos.nextLine();

        switch (znak)
        {
            case "+":
                System.out.println((a+b));
                break;
            case "-":
                System.out.println((a-b));
                break;
            case "*":
                System.out.println((a*b));
                break;
            case "/":
                System.out.println((a/b));
                break;
            default:
                System.out.println("Podałeś zły znak, podaj dobry");
                dzialanie(a, b);
        }
    }
}

