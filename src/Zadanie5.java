import java.util.Scanner;

public class Zadanie5 {
    public static void zarobzadanie(){
        Scanner cos = new Scanner(System.in);
        int[][] miejsca = new int[10][10];
        String wej = cos.nextLine();
        while(!wej.equals("x"))
        {
            String[] koordynaty= wej.split(" ");
            if (miejsca[Integer.parseInt(koordynaty[0])-1][Integer.parseInt(koordynaty[1])-1]!=1)
            {
                miejsca[Integer.parseInt(koordynaty[0])-1][Integer.parseInt(koordynaty[1])-1]=1;
            }
            else
            {
                System.out.print("zajete");
            }
            wej=cos.nextLine();
        }
        for (int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
                if (miejsca[i][j]==1)
                {
                    System.out.print("| z |");
                }
                else
                {
                    System.out.print("| w |");
                }
                System.out.println();
            }
        }
    }
}
