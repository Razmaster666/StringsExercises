import java.util.Scanner;

public class Task2 {

//    Task 2 - Palindrome
//    Create a method isPalindrome that returns true if a string is a palindrome, otherwise false. You can
//    solve it with the previous implementation of reverse for an array, or with built-in methods in Java.
//    For more information about palindrome: https://en.wikipedia.org/wiki/Palindrome

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPalindrome finder!");
        System.out.print("\nEnter a word or sentence: ");
        String word = scanner.nextLine();
        System.out.println(isPalindrome(word));

    }

    public static boolean isPalindrome(String word){
        String newWord = word.toLowerCase();

        for(int i = 1; i <= newWord.length() / 2; i++){
            if(newWord.charAt(i - 1) != newWord.charAt(newWord.length() - i)){
                return false;
            }
        }
        return true;
    }

}


