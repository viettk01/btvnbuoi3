import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "techmaster";
        String password = "hoclacoviec";

        System.out.println("Nhap username: ");
        String user = scanner.nextLine();
        System.out.println("Nhap password: ");
        String pass = scanner.nextLine();

        if (!Objects.equals(user, username) && !Objects.equals(pass, password)) {
            System.out.println("Tai khoan khong ton tai");
        } else {
            System.out.println("Dang nhap thanh cong");
        }
    }
}
