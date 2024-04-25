package Persons;

import javax.management.Notification;

public class Teacher extends Person{
    private Class[] classes = new Class[30];
    private Notification[] notifications  = new Notification[100];

  @Override
    public boolean isEduNumberValid(String number){
        if (number.length() == 6 && number.matches("\\d+")) return true;
        return false;
    }
}
