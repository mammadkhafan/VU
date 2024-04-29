import java.util.Scanner;

public class SighUp {

    

    public void signUpMessage(Person prs) {
        String repeat_password;

        boolean sw = false;
        String errorMessage = "your input is invalid!";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter these information...");

        do {
            System.out.print("name: ");

            if (prs.setName(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);

        } while (sw == false) ;
        sw = false;
        
        
        do {
            System.out.print("last name: ");
            if (prs.setName(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
            System.out.print("username: ");
            if (prs.setName(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
            System.out.print("field: ");
            if (prs.setName(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
        System.out.print("ID number: ");
            if (prs.setID_number(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;  
        sw = false;


        do {
            System.out.print("email: ");
            if (prs.setName(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
            System.out.print("phone number: ");
            if (prs.setName(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
            System.out.println("role: ");
            System.out.println("If you are student press 1");
            System.out.println("teacher press 2");
            System.out.println("admin press 3");
            if (prs.setRole(in.nextInt())) 
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
            System.out.print("password: ");
            if (prs.setName(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
            System.out.print("repeat password: ");
            repeat_password = in.nextLine();
            if (Utils.isPasswordValid(repeat_password) && prs.getPassword() == repeat_password && prs.getPassword() != "")
                sw = false;
            else
                System.out.println(errorMessage); 
        } while (sw == false) ;

        in.close();
    }
}
