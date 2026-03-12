interface PalindromeStrategy {
    boolean check(String word);
}

class ReverseStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }
}

public class PalindromeCheckerApp1 {

    public static void main(String[] args) {

        String word = "level";

        PalindromeStrategy strategy = new ReverseStrategy();

        if (strategy.check(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}