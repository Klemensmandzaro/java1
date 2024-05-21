import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie1 {
    public static void zrob_zadanie() throws FileNotFoundException {
        File file = new File("interfejsy\\Input");
        int i=1;
        StringBuilder suma = new StringBuilder("");

        Scanner cos = new Scanner(file);

            while (cos.hasNext())
            {
                String plik=cos.nextLine();

                if (i%2==1)
                {
                    suma= new StringBuilder(suma +" "+ plik);


                }
                i++;
            }
        System.out.println(suma);



    }
}
