public class Main {
    public static void main(String[] args) {

        String login = "java";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        Validator.checkLogin(login);
        Validator.checkPassword(password);
        Validator.checkConfirmPassword(password, confirmPassword);


    }
}