// PerformanceComparisonApp.java
public class PerformanceComparisonApp {

    public static void main(String[] args) {

        String testInput = "nurses run";

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        PalindromeStrategy reverseStrategy = new ReverseStringStrategy();

        // Stack Strategy Timing
        long startStack = System.nanoTime();
        boolean stackResult = stackStrategy.checkPalindrome(testInput);
        long endStack = System.nanoTime();

        // Deque Strategy Timing
        long startDeque = System.nanoTime();
        boolean dequeResult = dequeStrategy.checkPalindrome(testInput);
        long endDeque = System.nanoTime();

        // Reverse String Timing
        long startReverse = System.nanoTime();
        boolean reverseResult = reverseStrategy.checkPalindrome(testInput);
        long endReverse = System.nanoTime();

        System.out.println("Input String: " + testInput);

        System.out.println("\nStack Strategy Result: " + stackResult);
        System.out.println("Execution Time: " + (endStack - startStack) + " ns");

        System.out.println("\nDeque Strategy Result: " + dequeResult);
        System.out.println("Execution Time: " + (endDeque - startDeque) + " ns");

        System.out.println("\nReverse String Strategy Result: " + reverseResult);
        System.out.println("Execution Time: " + (endReverse - startReverse) + " ns");
    }
}