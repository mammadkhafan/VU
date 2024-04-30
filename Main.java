public class Main {
    public static void main(String[] args) throws InterruptedException {
        SighUp signUp = new SighUp();
        signUp.signUpMessages();

        LoginPage loginPage = new LoginPage();
        loginPage.loginMessages();
    }
}
