public class AccountService {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final int PASSWORD_LIMIT = 6;


    public boolean registerAccount(String username, String password, String email) {
        if (username == null || username.isBlank()) return false;
        if (password == null || password.length() <= PASSWORD_LIMIT || password.contains(" ")) return false;
        return isValidEmail(email); // Assume registration is always successful for this example
    }


    public boolean isValidEmail(String email) {
        if (email == null) return false;
        return email.matches(EMAIL_REGEX);
    }


}
