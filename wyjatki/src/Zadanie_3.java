import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie_3 {
    public static void zrob_zadanie(){

        try {
            File plik = new File("plik333333.txt");
            Scanner cos = new Scanner(plik);
        } catch (FileNotFoundException e)
        {
            System.out.println("podaj dobry plik");
            System.out.println(e.getMessage());
        }

    }
}
