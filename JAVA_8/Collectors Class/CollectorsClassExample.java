

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsClassExample {
    public static void main(String[] args) {
        // Collectors class provides functionalities for collecting stream elements into collections
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Sarah");
        Map<Character, List<String>> namesByLetter = names.stream()
                                                          .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(namesByLetter);
    }
}
// Pros: Simplifies data collection and grouping operations.
// Cons: Can be less intuitive for complex grouping operations.
