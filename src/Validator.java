public class Validator {

    public static void checkLogin(String login) {


        if (!login.matches("[^\\da-zA-Z_]+")) {
            throw new WrongLoginException("Неверный логин");
        }
    }

    public static void checkPassword(String password) {
        if (!password.matches("[^\\da-zA-Z_]+")) {
            throw new WrongPasswordException("Неверный Пароль");
        }
    }

    public static void checkConfirmPassword(String confirmPassword, String password) {
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Неверное подтверждение пароля!");
        }
    }


}
