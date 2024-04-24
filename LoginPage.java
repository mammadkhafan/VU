import java.util.Scanner;

public class LoginPage {
    

    public void loginMessage() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your ID number: ");
        String ID_number = in.next();
        System.out.print("Enter your Password: ");
        String password = in.next();
    }
}
