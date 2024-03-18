
import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        // Optional class to handle null values more gracefully
        Optional<String> optionalName = Optional.of("John");
        optionalName.ifPresent(name -> System.out.println("Name is " + name));
    }
}
// Pros: Helps in avoiding NullPointerException and makes the code more readable.
// Cons: Overuse can lead to complex code structures.
