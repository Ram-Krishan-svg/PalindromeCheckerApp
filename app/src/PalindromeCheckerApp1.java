import java.util.*;

public class PalindromeCheckerApp8 {

    public static void main(String[] args) {

        String word = "level";

        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {

            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}