import java.util.Scanner;

public class Task1_2 {

//    1.2 Also try to solve it using the repeat method introduced in the String class in Java 11.
//    For more information - google it or start to look
//    here: https://howtodoinjava.com/java11/repeat-string-n-times/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int linesInput = Integer.valueOf(scanner.nextLine());

        String number;

        for (int i = 1; i <= linesInput; i++){
            number = Integer.toString(i);
            System.out.print(number.repeat(i));
            System.out.println();
        }
    }
}
