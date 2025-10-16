import java.io.*;
import java.util.logging.Logger;

class PathTraversalExample {
    private static final Logger logger = Logger.getLogger(PathTraversalExample.class.getName());

    public static void main(String[] args) throws IOException {
        String userInput = "../secret.txt"; // Assuming this is malicious input

        // Define a safe working directory
        File baseDirectory = new File("safe_directory").getCanonicalFile();
        File userFile = new File(baseDirectory, userInput).getCanonicalFile();

        // Check if the file's path starts with the safe directory's path
        if (userFile.getPath().startsWith(baseDirectory.getPath())) {
            if (userFile.exists()) {
                logger.info("Reading file: " + userFile.getPath());
                // Use try-with-resources to ensure the file is closed
                try (BufferedReader reader = new BufferedReader(new FileReader(userFile))) {
                    // Read the file...
                }
            } else {
                logger.info("File does not exist in the safe directory.");
            }
        } else {
            logger.info("Access denied: Path Traversal attempt detected.");
        }
    }
}