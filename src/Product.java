public class Product {
    private String id;
    private String productName;
    private String description;
    private int productNumber;
    private long price;
    private String productUnit;

    public Product(String id, String productName, String description, int productNumber, long price, String productUnit) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.productNumber = productNumber;
        this.price = price;
        this.productUnit = productUnit;
    }

    public String getProductName() {
        return productName;
    }

    public String getId() {
        return id;
    }

    public long getPrice() {
        return price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + id +
                ", Product Name=" + productName +
                ", Description=" + description + 
                ", Product Number=" + productNumber +
                ", Price=" + price +
                ", Product Unit=" + productUnit +
                '}';
    }

    public boolean hasKeyword(String keyword) {
        boolean result = this.productName.contains(keyword);
        return result;
    }
}
