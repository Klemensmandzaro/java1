import java.util.*;

public class Zadanie2 {
    public static void zrob_zadanie(){
        Set<Integer> m = new HashSet<>();
        Random generator = new Random();
        Scanner cos = new Scanner(System.in);
        int f;
        int rrrr=0;
        while (m.size()<6)
        {
            m.add(generator.nextInt(50));
        }


        System.out.println(m);
        try
        {
            for (int i = 0; i < 6; i++) {
                f=Integer.parseInt(cos.next());
                if (f>0 && f<50)
                {
                    m.add(f);
                    rrrr++;
                }
                else
                {
                    System.out.println("Nie w zakresie");
                    i--;
                }


            }
        } catch(NumberFormatException e)
        {
            for (int i = 0; i < (6-rrrr); i++) {
                m.add(Integer.valueOf(cos.next()));

            }
        }



        System.out.println(12-m.size());
    }
}
