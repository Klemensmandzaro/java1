public class kwadrat {
    int bok;

    public kwadrat (int bok)
    {
        this.bok=bok;
    }

    public int obwod(){
        int obwod=this.bok*4;
        return obwod;
    }

    public int pole() {
        int pole=this.bok*this.bok;
        return pole;
    }
}
