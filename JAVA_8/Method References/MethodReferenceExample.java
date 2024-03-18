

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // Method references provide a way to refer to methods directly and can be used as a shorthand for a lambda expression that calls a method.
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Sarah");
        // Using a method reference to print each element of the list
        names.forEach(System.out::println);
    }
}
// Pros: Enhances readability and conciseness, especially for simple lambda expressions.
// Cons: Not as flexible as lambda expressions for complex scenarios.
