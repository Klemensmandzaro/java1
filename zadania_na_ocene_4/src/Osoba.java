public class Osoba implements Comparable{
    private String imie;
    private String nazwisko;

    protected Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String toString(){
        return this.imie+" "+this.nazwisko;
    }

    @Override
    public int compareTo(Object o) {
        char jeden = this.nazwisko.charAt(0);
        char dwa=((Osoba) o).nazwisko.charAt(0);
        int i=0;
        while (this.nazwisko.charAt(i)==((Osoba) o).nazwisko.charAt(i) && i < this.nazwisko.length() && i < ((Osoba) o).nazwisko.length())
        {
            i++;
            jeden = this.nazwisko.charAt(i);
            dwa=((Osoba) o).nazwisko.charAt(i);

        }
        if (jeden<dwa)
        {
            return 1;
        }
        else if (jeden>dwa){
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
