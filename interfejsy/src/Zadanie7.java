import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie7 {
    public static void zrob_zadanie(){
        Student Kamil = new Student("Kamil", "Klemiato", "s30277");
        Student Krzyś = new Student("Krzys", "Babs", "s30333");
        Student Czarek = new Student("Czarek", "Krenke", "s30245");
        Student Stas = new Student("Stas", "Kowalski", "s30545");

        Student[] students={Kamil, Krzyś, Czarek, Stas};
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].imie + " "+students[i].nazwisko + " "+students[i].index);
        }
    }
}
