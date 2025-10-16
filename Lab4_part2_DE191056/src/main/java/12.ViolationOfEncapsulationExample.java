import java.util.logging.Logger;

class User {
    private String name;
    private int age;
    private static final Logger LOGGER = Logger.getLogger(User.class.getName());
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation logic
    public void setAge(int age) {
        if (age > 0) { // Add control logic
            this.age = age;
        } else {
            LOGGER.info("Invalid age.");
        }
    }

    public void display() {
        LOGGER.info("Name: " + name + ", Age: " + age);
    }
}