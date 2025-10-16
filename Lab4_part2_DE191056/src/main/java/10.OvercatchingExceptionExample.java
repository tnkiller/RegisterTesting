import java.util.logging.Logger;

class OverCatchingExample {

    private static final Logger logger = Logger.getLogger(OverCatchingExample.class.getName());


    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // This line will throw the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the specific error for accessing an array out of bounds
            logger.info("Error: Array index is out of bounds.");
            // Log the exception details for debugging
            // e.printStackTrace();
        }
    }
}