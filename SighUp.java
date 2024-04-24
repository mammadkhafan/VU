import java.util.Scanner;

public class SighUp {

    

    public void signUpMessage() {
        boolean sw = false;
        String errorMessage = "your input is invalid!";
        String name;
        String lastName;
        String username;
        String field;
        String ID_number;
        String email;
        String phoneNumber;
        int role;
        String password = "";
        String repeat_password = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter these information...");

        do {
            System.out.print("name: ");
            name = in.nextLine();
            if (Utils.isNameValid(name)) {
                sw = true;
            }
            else
                System.out.println(errorMessage);
        } while (!sw) ;
        
        
        do {
            System.out.print("last name: ");
            lastName = in.nextLine();
            if (Utils.isNameValid(lastName)) 
                sw = false;
            else
                System.out.println(errorMessage);
        } while (sw) ;

        do {
            System.out.print("username: ");
            username = in.nextLine();
            if (Utils.isUsernameValid(username))
                sw = false;
            else
                System.out.println(errorMessage);
        } while (sw) ;

        do {
            System.out.print("field: ");
            field = in.nextLine();
            if (Utils.isNameValid(field))
                sw = false;
            else
                System.out.println(errorMessage);
        } while (sw) ;

        do {
        System.out.print("ID number: ");
            ID_number = in.nextLine();
            for (int i = 0; i < ID_number.length(); i++) {
                if (ID_number.charAt(i) <= 57 && ID_number.charAt(i) >= 48) {
                    sw = false;
                    System.out.println(errorMessage);
                    break;
                }
                if (i == ID_number.length() - 1) {
                    sw = false;
                }
            }
        } while (sw) ;  

        do {
            System.out.print("email: ");
            email = in.nextLine();
            if (Utils.isEmailValid(email)) 
                sw = false;
            else
                System.out.println(errorMessage);
        } while (sw) ;

        do {
            System.out.print("phone number: ");
            phoneNumber = in.nextLine();
            if (Utils.isPhoneNumberValid(phoneNumber))
                sw = false;
            else
                System.out.println(errorMessage);
        } while (sw) ;


        do {
            System.out.println("role: ");
            System.out.println("If you are student press 1");
            System.out.println("teacher press 2");
            System.out.println("admin press 3");
            role = in.nextInt();
            if (role == 1 || role == 2 || role == 3)
                sw = false;
            else
                System.out.println(errorMessage);
        } while (sw) ;

        do {
        System.out.print("password: ");
        password = in.nextLine();
        if (Utils.isPasswordValid(password))
            sw = false;
        else
            System.out.println(errorMessage);
        } while (sw) ;

        do {
            System.out.print("repeat password: ");
            repeat_password = in.nextLine();
            if (Utils.isPasswordValid(repeat_password) && password == repeat_password && password != "")
                sw = false;
            else
                System.out.println(errorMessage); 
        } while (sw) ;
    }
}
