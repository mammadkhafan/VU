public class Student extends Person{
    public Student(String name) {
        super(name);
        setRole(1);
    }

    public boolean setID_number(String ID_number) {
        if (Utils.stuIsEduNumberValid(ID_number)) { 
            this.ID_number = ID_number;
            return true;
        }
        else 
            return false;
    }
}