// Basic Animal class example
class Animal {
    // Attributes (fields)
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method (behavior)
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of Animal
        Animal dog = new Animal("Buddy", 3);

        // Calling methods
        dog.displayInfo();
        dog.makeSound();
    }
}
