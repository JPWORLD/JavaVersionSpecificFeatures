

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TypeAndRepeatingAnnotationsExample {
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Greetings {
        Greeting[] value();
    }

    @Repeatable(Greetings.class)
    public @interface Greeting {
        String name();
    }

    @Greeting(name = "Hello")
    @Greeting(name = "Hi")
    public static void main(String[] args) {
        // Repeating annotations allow applying the same annotation multiple times on a declaration
        Greeting[] greetings = TypeAndRepeatingAnnotationsExample.class.getAnnotationsByType(Greeting.class);
        for (Greeting greeting : greetings) {
            System.out.println("Greeting: " + greeting.name());
        }
    }
}
// Pros: Provides flexibility in using annotations.
// Cons: Can lead to cluttered code if overused.
