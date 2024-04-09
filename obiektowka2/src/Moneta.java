import java.util.Random;

public class Moneta {
    Value value;
    public static Value rzut()
    {
        Random gg = new Random();
        int szansa = gg.nextInt(2);
        if (szansa==1)
        {
            return Value.ORZEL;
        }
        else
        {
            return Value.RESZKA;
        }

    }
}
