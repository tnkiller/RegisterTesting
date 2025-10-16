class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override // Use the annotation to ensure the override is correct
    void speak() { // Correct 'S' to 's'
        System.out.println("Dog barks");
    }
}