package Persons;

public class admin extends Person{
    @Override
    public boolean isEduNumberValid(String number) {
        if (number.length() == 4 && number.matches("\\d+")) return true;
        return false;

    }
}
