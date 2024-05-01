package Persons;

import javax.management.Notification;

public class Student extends Person{
    private Class[] classes = new Class[20];
    private Notification[] notifications  = new Notification[20];

    @Override
    public boolean isEduNumberValid(String number) {
            if (number.length() == 10 && number.matches("\\d+") ) return true;
            return false;
        }
    }
