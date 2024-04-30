import java.util.Scanner;

public class LoginPage {
    

    public void loginMessages(Person prs) {
        boolean sw = false;
        String errorMessage = "your input is invalid!";
        String ID_number;
        String password;
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.print("Enter your ID number: ");
            ID_number = in.next();
            if (prs.getRole() == prs.student_role && Utils.stuIsEduNumberValid(ID_number)) 
                sw = true;
            else if (prs.getRole() == prs.teacher_role && Utils.TeacherIsEduNumberValid(ID_number)) 
                sw = true;
            else if (prs.getRole() == prs.admin_role && Utils.adminIsEduNumberValid(ID_number)) 
                sw = true;
            else 
                System.out.println(errorMessage);
            
        } while (sw == false);
        sw = false;


        do {
            System.out.print("Enter your Password: ");
            password = in.next();
            if (Utils.isPasswordValid(password)) 
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false);

        boolean show_message_sw = false;
        for (int i = 0; SighUp.persons[i] != null; i++) {
            if (ID_number.equals(SighUp.persons[i].getID_number()) && password.equals(SighUp.persons[i].getPassword())) {
                System.out.println("--------------------------");
                System.out.println("Wellcom " + SighUp.persons[i].getName() + " " + SighUp.persons[i].getLastName() + "!!!");
                System.out.println("--------------------------");
                show_message_sw = true;
            }
        }
        if (show_message_sw == false) {
            System.out.println("Ther is no account with this information.you have to signup first...");
        }


        
    }
}
