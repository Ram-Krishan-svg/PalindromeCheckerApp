public class PalindromeCheckerApp1 {

    public static void main(String[] args) {

        String word = "level";

        long start = System.nanoTime();

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        boolean result = word.equals(reversed);

        long end = System.nanoTime();

        System.out.println("Input: " + word);
        System.out.println("Is Palindrome: " + result);
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}