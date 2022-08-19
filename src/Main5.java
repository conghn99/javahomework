import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Product product1 = new Product("P01", "Light Novel", "Book with word context", 100, 80000, "VND");
        Product product2 = new Product("P02", "Visual Novel", "Novel with visual context and read online like game", 4, 3000000, "VND");
        Product product3 = new Product("P03", "Manga", "Book with image context", 1000, 20000, "VND");
        Product product4 = new Product("P04", "Anime", "Movie, series like cartoon", 500, 70000, "VND");
        Product product5 = new Product("P05", "Steam game", "All games available on steam", 10000, 500000, "VND");

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        
        //1 - Xem danh sách sản phẩm
        System.out.println(productList.toString());

        //2 - Tìm sản phẩm theo tên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten san pham");
        String keyword = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.hasKeyword(keyword)) {
                System.out.println("Tim thay san pham: " + product);
            }
        }

        //3 - Tìm sản phẩm theo id:
        //3.1: Xóa sản phẩm
        System.out.println("Nhap ID san pham");
        String ID1 = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getId().equals(ID1)) {
                productList.remove(product);
            }
        }
        System.out.println("List san pham sau khi xoa: " + productList.toString());

        //3.2: Cập nhật số lượng sản phẩm
        System.out.println("Nhap ID san pham");
        String ID2 = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getId().equals(ID2)) {
                System.out.println("Xin hay nhap so luong moi cho san pham " + product.getProductName());
                product.setProductNumber(scanner.nextInt());
                productList.set(i, product);
            }
        }
        System.out.println("List san pham sau khi cap nhat: " + productList.toString());
        scanner.close();

        //4 - Tìm các sản phẩm có số lượng dưới 5
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getProductNumber() < 5) {
                System.out.println("San pham co so luong duoi 5 la: " + product);
            }
        }

        //5 - Tìm sản phẩm theo mức giá:
        //5.1: Dưới 50.000
        //5.2: Từ 50.000 đến dưới 100.000
        //5.3: Từ 100.000 trở lên
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getPrice() < 50000) {
                System.out.println("San pham co muc gia nho hon 50.000VND la: " + product);
            } else if (product.getPrice() >= 100000) {
                System.out.println("San pham co muc gia tu 100.000VND tro len la: " + product);
            } else {
                System.out.println("San pham co muc gia tu 50.000VND den duoi 100.000VND la: " + product);
            }
        }
    }
}
