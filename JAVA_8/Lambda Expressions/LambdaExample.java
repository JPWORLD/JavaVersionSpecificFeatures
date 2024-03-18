import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda Expressions allow for clearer and more concise code when implementing functional interfaces.
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Sarah");
        // Using a lambda expression to sort a list of names
        Collections.sort(names, (a, b) -> a.compareTo(b));
        // Iterating over the collection with a method reference
        names.forEach(System.out::println);
    }
}
// Pros: More readable and concise code.
// Cons: Can be less clear for complex implementations or for those unfamiliar with functional programming.
