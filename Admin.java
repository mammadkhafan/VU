public class Admin extends Person{
    public Admin(String name) {
        super(name);
    }

    public boolean setID_number(String ID_number) {
        if (Utils.adminIsEduNumberValid(ID_number)) { 
            this.ID_number = ID_number;
            return true;
        }
        else 
            return false;
    }
}
