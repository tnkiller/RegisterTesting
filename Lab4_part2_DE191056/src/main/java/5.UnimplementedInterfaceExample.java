import java.util.logging.Logger;

interface Drawable {
    void draw();
}

class Circle implements Drawable {

    private static final Logger logger = Logger.getLogger(Drawable.class.getName());
    // Implement the required method from the Drawable interface
    @Override
    public void draw() {
        logger.info("Drawing a circle.");
    }
}