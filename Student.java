public class Student extends Person{


    @Override
    public boolean isEduNumberValid(String number) {
            if (number.length() == 10 && number.matches("\\d+") ) return true;
            return false;
        }
    }
