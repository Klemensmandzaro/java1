import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie2 {
    public static void zrob_zadanie() throws FileNotFoundException {
        File file = new File("interfejsy\\basedir");
        String[] kata = file.list();
        System.out.println(Arrays.toString(kata));
        String folder = "";
        int licznik=0;
        for (int i = 1; i < kata.length; i++)
        {
            File nowu=new File("interfejsy\\basedir\\"+kata[i]);
            String[] kata1 = nowu.list();
            if (kata1.length>licznik)
            {
                licznik= kata1.length;
                folder=kata[i];
            }

        }
        System.out.println(folder);
    }
}
