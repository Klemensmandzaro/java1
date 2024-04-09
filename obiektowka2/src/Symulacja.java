import java.util.Scanner;

public class Symulacja {
    public static void symulacja() {
        Scanner cos = new Scanner(System.in);
        System.out.println("Podaj ilosc prob rzutu moneta");
        double ile= cos.nextInt();
        double reszki =0;
        double orly=0;
        for (int i = 0; i < ile; i++)
        {
            if(Moneta.rzut()==Value.RESZKA)
            {
                reszki++;
            }
            else
            {
                orly++;
            }
        }
        double procent = Math.round((reszki/ile)*100);
        System.out.println("Procent na reszke: "+ procent+"%");
        System.out.println("Procent na orla: "+(100-procent)+"%");
    }
}
