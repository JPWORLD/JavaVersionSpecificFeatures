
import java.nio.file.Files;
import java.nio.file.Paths;

public class IoEnhancementsExample {
    public static void main(String[] args) {
        // IO Enhancements for better file handling
        try {
            Files.lines(Paths.get("file.txt")).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// Pros: Simplifies file I/O operations with streams.
// Cons: Requires understanding of the new file I/O API.
