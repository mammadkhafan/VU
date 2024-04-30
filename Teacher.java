public class Teacher extends Person{
    public Teacher(String name) {
        super(name);
    }

    public boolean setID_number(String ID_number) {
        if (Utils.TeacherIsEduNumberValid(ID_number)) { 
            this.ID_number = ID_number;
            return true;
        }
        else
            return false;
    }
}
