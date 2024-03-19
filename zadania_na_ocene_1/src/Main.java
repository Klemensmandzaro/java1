import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zadanie_1.zrobzadanie();
        Zadanie_2.zrobzadanie();
        //Zadanie 3
        Scanner cos = new Scanner(System.in);
        int pierwsza=cos.nextInt();
        int druga=cos.nextInt();
        System.out.println(Zadanie_3.compare(pierwsza, druga));
        Zadanie_4.zrobzadanie();
        Zadanie_5.zrobzadanie();
        Zadanie_6.zrobzadanie();
    }
}