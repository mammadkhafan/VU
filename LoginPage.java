import java.util.Scanner;

public class LoginPage {
    

    public void loginMessage(Person prs) {
        boolean sw = false;
        String errorMessage = "your input is invalid!";
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.print("Enter your ID number: ");
            String ID_number = in.next();
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
            String password = in.next();
            if (Utils.isPasswordValid(password)) 
                sw = true;
            else
                System.out.println(errorMessage);
        } while (sw == false);

        in.close();
    }
}
