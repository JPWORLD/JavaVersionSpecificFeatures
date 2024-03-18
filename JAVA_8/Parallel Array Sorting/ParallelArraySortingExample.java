

import java.util.Arrays;

public class ParallelArraySortingExample {
    public static void main(String[] args) {
        // Parallel array sorting to leverage multi-core processors
        int[] numbers = {9, 5, 1, 4, 3};
        Arrays.parallelSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
// Pros: Can significantly improve performance for large arrays.
// Cons: May not offer performance benefits for small arrays; also, the result may not be stable.
