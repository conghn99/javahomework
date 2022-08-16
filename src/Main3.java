import java.util.Scanner;

public class Main3 {
    public static void main(String[] arg) {
        Account account = new Account();
        account.setName("daxua");
        account.setAccountNumber("123456789");
        account.setEmail("daxua@gmail.com");
        account.setAccountBalance(5000000);
        account.displayInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin hay nhap so tien ban muon nap");
        account.recharge(scanner.nextDouble());
        System.out.println("Xin hay nhap email moi");
        scanner.nextLine();
        account.changeEmail(scanner.nextLine());
        scanner.close();
        account.displayInfo();
    }
}
