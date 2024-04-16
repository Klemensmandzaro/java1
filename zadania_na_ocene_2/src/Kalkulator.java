public class Kalkulator {

    public void oblicz(Ulga ulga, Czas czas)
    {
        float x=4.8f;
        if (ulga==Ulga.NORMALNY)
        {
            x*=1f;
        }
        else
        {
            x*=0.5f;
        }

        if (czas==Czas.JEDNORAZOWY)
        {

            System.out.printf("%.2f zł\n", x);
        }
        else if (czas==Czas.GODZINNY)
        {
            x*=1.5f;

            System.out.printf("%.2f zł\n", x);
        }
        else if (czas==Czas.DOBOWY)
        {
            x*=4.5f;

            System.out.printf("%.2f zł\n", x);
        }
        else
        {
            System.out.println("Error");
        }
    }
}
