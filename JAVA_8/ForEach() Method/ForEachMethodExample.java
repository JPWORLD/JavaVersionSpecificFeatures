

import java.util.Arrays;
import java.util.List;

public class ForEachMethodExample {
    public static void main(String[] args) {
        // ForEach method to iterate over collections in a functional style
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Sarah");
        names.forEach(name -> System.out.println("Name: " + name));
    }
}
// Pros: Enhances readability and iteration syntax.
// Cons: Not as flexible as traditional for-loops for complex operations.
