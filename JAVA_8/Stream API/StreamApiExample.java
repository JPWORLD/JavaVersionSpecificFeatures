

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        // Stream API allows for functional-style operations on streams of elements.
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Sarah");
        // Using Stream API to filter and collect names starting with 'J'
        List<String> namesWithJ = names.stream()
                                        .filter(name -> name.startsWith("J"))
                                        .collect(Collectors.toList());
        System.out.println(namesWithJ);
    }
}
// Pros: Simplifies collection processing, and supports parallel execution.
// Cons: Can be less efficient for small data sets or simple operations.
