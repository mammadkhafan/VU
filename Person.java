public abstract class Person {
    private String name;
    private String lastName;
    private String username;
    private String field;
    private String ID_number;
    private String email;
    private String phoneNumber;
    private int role;
    protected final int student_role = 1;
    public final int teacher_role = 2;
    public final int admin_role = 3;
    private String password = "";

    //constructor
    public Person(String name) {
        setName(name);
    }

    //setters
    public boolean setName(String name) {
        if (Utils.isNameValid(name)) {
            this.name = name;
            return true;
        }
        else
            return false;
    }

    public boolean setLastName(String lastName) {
        if (Utils.isNameValid(lastName)) {
            this.lastName = lastName;
            return true;
        }
        else
            return false;
    }

    public boolean setUsername(String username) {
        if (Utils.isUsernameValid(username)) {
            this.username = username;
            return true;
        }
        else
            return false;
    }

    public boolean setField(String field) {
        if (Utils.isNameValid(field)) {
            this.field = field;
            return true;
        }
        else
            return false;
    }

    public abstract boolean setID_number(String ID_number);

    public boolean setEmail(String email) {
        if (Utils.isEmailValid(email)) {
            this.email = email;
            return true;
        }
        else
            return false;
    }

    public boolean setPhoneNumber(String phoneNumber) {
        if (Utils.isPhoneNumberValid(phoneNumber)) {
            this.phoneNumber = phoneNumber;
            return true;
        }
        else
            return false;
    }

    public boolean setRole(int role) {
        if (role == 1 || role == 2 || role == 3) {
            this.role = role;
            return true;
        }      
        else
            return false;
    }

    public boolean setPassword(String password) {
        if (Utils.isPasswordValid(password)) {
            this.password = password;
            return true;
        }
        else
            return false;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getField() {
        return field;
    }

    public String getID_number() {
        return ID_number;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

}
