import java.util.logging.Logger;

interface Constants {
    int MAX_USERS = 100;
}

class InterfaceFieldModificationExample {
    private static final Logger logger = Logger.getLogger(InterfaceFieldModificationExample.class.getName());

    public static void main(String[] args) {
        // Use the constant, don't change it
        logger.info("Maximum number of users is: " + Constants.MAX_USERS);
    }
}