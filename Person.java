package personaldetails;

public class Person {
    private String name;
    private int age;
    private String phone;

    // Constructor
    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Phone : " + phone);
    }

    // Main method
    public static void main(String[] args) {
        Person person = new Person("diya", 25, "9876543210");
        person.displayDetails();
    }
}
