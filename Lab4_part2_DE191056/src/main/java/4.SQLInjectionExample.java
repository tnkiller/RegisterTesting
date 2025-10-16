import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

class SQLInjectionExample {
    private static final Logger logger = Logger.getLogger(SQLInjectionExample.class.getName());

    // Assume you have a Connection object named 'connection'
    public void getUser(Connection connection, String username) throws SQLException {
        // SQL statement with a placeholder parameter (?)
        String query = "SELECT * FROM users WHERE username = ?";

        // Use a PreparedStatement
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            // Set the value for the parameter safely
            preparedStatement.setString(1, username);

            logger.info("Executing query: " + preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            // Process results...
        }
    }
}