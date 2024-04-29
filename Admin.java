public class Admin extends Person{
    public boolean setID_number(String ID_number) {
        if (Utils.adminIsEduNumberValid(ID_number)) 
            return true;
        else 
            return false;
    }
}
