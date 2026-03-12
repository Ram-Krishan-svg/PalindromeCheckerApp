public class PalindromeCheckerApp9 {

    public static void main(String[] args) {

        String word = "madam";

        if (check(word, 0, word.length() - 1)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    static boolean check(String word, int start, int end) {

        if (start >= end)
            return true;

        if (word.charAt(start) != word.charAt(end))
            return false;

        return check(word, start + 1, end - 1);
    }
}