public class LoginPasswordEmptyException extends Exception {

    public LoginPasswordEmptyException() {
        super("Пустое значение в полях name / password");
    }
}