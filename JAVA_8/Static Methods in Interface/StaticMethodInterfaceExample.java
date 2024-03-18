

interface MathOperation {
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodInterfaceExample {
    public static void main(String[] args) {
        int sum = MathOperation.add(5, 10);
        System.out.println("Sum: " + sum);
    }
}
// Pros: Allows defining utility methods in interfaces.
// Cons: Can lead to confusion if similar static methods exist in multiple interfaces.
