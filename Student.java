public class Student extends Person{
    public boolean setID_number(String ID_number) {
        if (Utils.stuIsEduNumberValid(ID_number)) 
            return true;
        else 
            return false;
    }
}