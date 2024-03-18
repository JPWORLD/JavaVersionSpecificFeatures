

import java.util.concurrent.CompletableFuture;

public class ConcurrencyEnhancementsExample {
    public static void main(String[] args) {
        // Concurrency Enhancements with CompletableFuture for asynchronous programming
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");
        future.thenAccept(System.out::println);
    }
}
// Pros: Simplifies asynchronous programming and improves performance.
// Cons: Can be complex to manage and debug.
