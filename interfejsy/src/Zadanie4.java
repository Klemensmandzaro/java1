import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie4 {
    public static void zrob_zadanie(){
        Scanner cos = new Scanner(System.in);
        LocalDateTime now= LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(cos.nextLine());

        System.out.println(now.format(formatter));
    }
}
