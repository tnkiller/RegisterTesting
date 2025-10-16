import java.util.logging.Logger;

// Example using environment variables to retrieve information
class HardcodedCredentialsExample {

    private static final Logger logger = Logger.getLogger(HardcodedCredentialsExample.class.getName());

    public static void main(String[] args) {
        // Get credentials from the system's environment variables
        String username = System.getenv("APP_USERNAME");
        String password = System.getenv("APP_PASSWORD");

        if(authenticate(username, password)) {
            logger.info("Access granted");
        } else {
            logger.info("Access denied");
        }
    }

    private static boolean authenticate(String user, String pass) {
        // Authentication logic should compare against a secure source
        // For example, compare against values retrieved from a secure source
        String validUser = System.getenv("APP_USERNAME");
        String validPass = System.getenv("APP_PASSWORD");
        return validUser != null && validUser.equals(user) && validPass != null && validPass.equals(pass);
    }
}