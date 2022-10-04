package StucturesClass;

import java.util.Scanner;
import java.util.Stack;

public class Lab7Stack {
    public static boolean isPalindrome(String word) {
        Stack<Character> s = new Stack<Character>();

        for (int i = 0; i < word.length(); i++) {
        s.push(word.charAt(i));
        }
        String reversed = "";

        while (!s.isEmpty()) {
        reversed += s.pop();
        }

        if (word.equals(reversed)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.nextLine();
        System.out.println(isPalindrome(word));

    }
}
