

interface Greeter {
    default void greet() {
        System.out.println("Hello, World!");
    }
}

public class DefaultMethodExample implements Greeter {
    public static void main(String[] args) {
        new DefaultMethodExample().greet();
    }
}
// Pros: Allows adding new methods to interfaces without breaking existing implementations.
// Cons: Can lead to diamond problem if a class implements multiple interfaces with the same default method.
