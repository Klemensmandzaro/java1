public class Shop {
    private String address;
    private int size;

    protected Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    public String getInformation()
    {
        String wynik=this.address+" "+this.size;
        return wynik;
    }
}
