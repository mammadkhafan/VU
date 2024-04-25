public class Teacher extends Person{

  @Override
    public boolean isEduNumberValid(String number){
        if (number.length() == 6 && number.matches("\\d+")) return true;
        return false;
    }
}
