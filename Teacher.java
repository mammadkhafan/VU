public class Teacher extends Person{
    public boolean setID_number(String ID_number) {
        if (Utils.TeacherIsEduNumberValid(ID_number)) 
            return true;
        else
            return false;
    }
}
