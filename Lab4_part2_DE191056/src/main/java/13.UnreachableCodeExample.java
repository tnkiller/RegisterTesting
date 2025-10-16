class UnreachableCodeExample {
    public static int getNumber() {
        // System.out.println("This can execute"); // If needed, place it here
        return 42;
        // The erroneous line has been removed
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}