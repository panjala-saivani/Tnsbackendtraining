public class DemoOnOperators {
    public static void main(String[] args) {
        // Arithmetic operators
        int x = 10, y = 2;
        boolean a = true, b = false;

        System.out.println("The addition value: " + (x + y));
        System.out.println("The subtraction value: " + (x - y));
        System.out.println("The multiplication value: " + (x * y));
        System.out.println("The division value: " + (x / y));

        // Assignment operators
        int z = x;
        System.out.println("The value of z: " + z);
        z += y;
        System.out.println("The value of z after z += y: " + z);

        // Relational operators
        System.out.println("x == y: " + (x == y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x > y: " + (x > y));

        // Logical operators
        System.out.println("Result of (a && b): " + (a && b));
        System.out.println("Result of (a || b): " + (a || b));
        System.out.println("Result of (!a): " + (!a));

        // Bitwise operator
        System.out.println("Result of (x & y): " + (x & y));

        // Unary operators
        int d = 10;
        d++;
        System.out.println("Value of d after d++: " + d);
        ++d;
        System.out.println("Value of d after ++d: " + d);
    }
}
