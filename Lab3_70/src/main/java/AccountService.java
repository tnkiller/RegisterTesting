
import java.util.HashSet;
import java.util.Set;

public class AccountService {

    private final Set<String> usernames = new HashSet<>();
    public final Set<String> emails = new HashSet<>();

    public boolean registerAccount(String username, String password, String email) {
        if (username == null || username.isBlank() ||
                password == null || password.isBlank() ||
                email == null || email.isBlank()) {
            return false;
        }
        if (username.length() <= 3) return false;
        if (!isValidPassword(password)) return false;
        if (!isValidEmail(email)) return false;
        // kiểm tra trùng username hoặc email
        if (usernames.contains(username) || emails.contains(email)) {
            return false;
        }
        usernames.add(username);
        emails.add(email);
        return true;
    }


    public boolean isValidEmail(String email) {
        email = email.trim();
        if (email.contains(" ")) return false;
        return email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    public boolean isValidPassword(String password) {
        if (password == null || password.length() <= 6) return false;
        boolean hasUpper = password.chars().anyMatch(Character::isUpperCase);
        boolean hasLower = password.chars().anyMatch(Character::isLowerCase);
        boolean hasDigit = password.chars().anyMatch(Character::isDigit);
        boolean hasSpecial = password.matches(".*[^A-Za-z0-9].*");
        return hasLower && hasDigit && hasSpecial && hasUpper;
    }
}
