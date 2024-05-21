import java.time.LocalDate;

public class Zadanie3 {
    public static void zrob_zadanie(){
        LocalDate dateTime= LocalDate.now();
        int rok=dateTime.getYear();
        for (int i = 0; i < 100; i++) {
            if (rok%4==0)
            {
                rok+=4;
                System.out.println(rok);

            } else if (rok%4==3)
            {
                rok+=1;
                System.out.println(rok);

            }   else if (rok%4==2)
            {
                rok+=2;
                System.out.println(rok);

            }else if (rok%4==1)
            {
                rok+=3;
                System.out.println(rok);

            }

        }
    }
}
