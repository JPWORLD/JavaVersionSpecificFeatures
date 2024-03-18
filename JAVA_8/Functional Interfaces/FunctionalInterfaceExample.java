
public class FunctionalInterfaceExample {
    // A functional interface is an interface with a single abstract method.
    @FunctionalInterface
    interface Greeting {
        String sayHello(String name);
    }

    public static void main(String[] args) {
        // Implementing the functional interface using a lambda expression.
        Greeting greeting = name -> "Hello, " + name;
        System.out.println(greeting.sayHello("Java User"));
    }
}
// Pros: Enables the use of lambda expressions and method references.
// Cons: Limited to interfaces with only one abstract method.

