import java.util.Scanner;

public class SighUp {
    

    public void signUpMessage() {
        String name;
        String lastName;
        String username;
        String field;
        String ID_number;
        String email;
        String phoneNumber;
        int role;
        String password;
        String repeat_password;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter these information...");
        System.out.print("name: ");
        name = in.nextLine();
        System.out.print("last name: ");
        lastName = in.nextLine();
        System.out.print("username: ");
        username = in.nextLine();
        System.out.print("field: ");
        field = in.nextLine();
        System.out.print("ID number: ");
        ID_number = in.nextLine();
        System.out.print("email: ");
        email = in.nextLine();
        System.out.print("phone number: ");
        phoneNumber = in.nextLine();
        System.out.print("role: ");
        role = in.nextInt();
        System.out.print("password: ");
        password = in.nextLine();
        System.out.print("repeat password: ");
        repeat_password = in.nextLine();
    }
}
