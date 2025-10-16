import java.util.logging.Logger;

class CatchGenericExceptionExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        String s = null;

        // Best practice: Prevent the error from happening
        if (s != null) {
            System.out.println(s.length());
        } else {
            System.out.println("String is null, cannot get length.");
        }

        // If you must use try-catch, catch the specific exception
        try {
            // String s = null;
            // The line below will throw the exception
            System.out.println(s.length());
        } catch (NullPointerException e) {
            // Handle the NullPointerException specifically
            logger.info("Error: The string is null.");
            // Log the exception for debugging
            // e.printStackTrace();
        }
    }
}