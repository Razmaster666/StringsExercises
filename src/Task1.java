import java.util.Scanner;

public class Task1 {

//    Task 1 - Numbers triangle
//    Create a program that prints a number triangle with a certain number of lines like this (ask the
//    user to enter the number of lines):
//    Please enter the number of lines of the triangle: 6
//    1
//    22
//    333
//    4444
//    55555
//    666666

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number of lines: ");
            int linesInput = Integer.valueOf(scanner.nextLine());

            int help = 1;

            for (int i = 1; i <= linesInput; i++){
                for (int j = 1; j <= help; j++){
                    System.out.print(help);
                }
                help++;
                System.out.println();
            }
    }

//    public static void lel (){
//        System.out.print("Enter number of lines: ");
//        int linesInput = Integer.valueOf(scanner.nextLine());
//        for (int i = 1; i <= linesInput; i++){
//            for(int j = i; j <= linesInput; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
}
