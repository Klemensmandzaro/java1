public class Zadanie_2 {
    public static void zrob_zadanie()
    {
        int[] a = new int[5];
        try {

            a[6] = 5;
        } catch (RuntimeException e)
        {
            a[4]=5;
            System.out.println(e.getMessage());
        }
    }
}
