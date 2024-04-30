import java.util.Scanner;

public class SighUp {

    public static Person[] persons;
    private static int persons_counter = 0;

    static {
        persons = new Person[10];
    }


    public void signUpMessages(Person prs) {
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
            if (prs.setLastName(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
            System.out.print("username: ");
            if (prs.setUsername(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
            System.out.print("field: ");
            if (prs.setField(in.nextLine()))
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
            if (prs.setEmail(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
            System.out.print("phone number: ");
            if (prs.setPhoneNumber(in.nextLine()))
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
        in.nextLine();  //fix the bug of get an extra line from user
        sw = false;


        do {
            System.out.print("password: ");
            if (prs.setPassword(in.nextLine()))
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false) ;
        sw = false;


        do {
            System.out.print("repeat password: ");
            repeat_password = in.nextLine();
            if (Utils.isPasswordValid(repeat_password) && repeat_password.equals(prs.getPassword()))
                sw = true;
            else
                System.out.println(errorMessage); 
        } while (sw == false) ;

        addNewPerson(prs);
    }

    private static void addNewPerson(Person prs) {
        if (prs instanceof Student) {
            persons[persons_counter] = (Student)prs;
        }
        else if (prs instanceof Teacher) {
            persons[persons_counter] = (Teacher)prs;
        }
        else if (prs instanceof Admin) {
            persons[persons_counter] = (Admin)prs;
        }

        persons_counter++;
        System.out.println("--------------------------");
        System.out.println("Your account created successfuly");
        System.out.println("--------------------------");
    }
}
