import java.util.Arrays;

public class Bakery extends Shop{
    private String[] products;
    protected Bakery(String address, int size, String[] products) {
        super(address, size);
        this.products=products;
    }

    public String getInformation() {
        return super.getInformation()+ Arrays.toString(products);
    }
}
