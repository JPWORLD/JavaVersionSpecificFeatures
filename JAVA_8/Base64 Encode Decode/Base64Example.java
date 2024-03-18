
import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        // Base64 encoding and decoding
        String originalInput = "Java 8";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        
        System.out.println(encodedString);
        System.out.println(decodedString);
    }
}
// Pros: Provides a standard way to handle Base64 encoding/decoding.
// Cons: Not suitable for large data due to memory constraints.
