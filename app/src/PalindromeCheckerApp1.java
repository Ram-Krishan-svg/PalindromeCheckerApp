public class PalindromeCheckerApp1 {

    public static void main(String[] args) {

        String word = "A man a plan a canal Panama";

        String cleaned = word.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed = reversed + cleaned.charAt(i);
        }

        if (cleaned.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}