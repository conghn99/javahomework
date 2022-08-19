import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> product;

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "Product List=" + product +
                '}';
    }
}
