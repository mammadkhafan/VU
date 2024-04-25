public class Person {
    protected String name ;
    protected String eduID;
    protected String email ;
    protected String password;
    protected String phoneNumber;
    protected Role role ;

    public boolean isEduNumberValid(String number){
        if (number.matches("\\d+") ) return true;
        return false;
    }
}
