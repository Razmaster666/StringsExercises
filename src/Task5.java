import java.util.Arrays;

public class Task5 {

//    Copy this String to a main method:
//    String fruits = "Apple 5,Banana 7,Lemon 3";
//
//    Create a program that prints out messages using the String of names, that looks like this:
//
//    The price of Apple is 5
//    The price of Banana is 7
//    The price of Lemon is 3
//
//    Hint:
//    Use the split method twice. First split on “,” to get the name and the price of each fruit in separate
//    elements in a String array. Then loop over that String array and split each string inside of it again
//    on “ “ to get the name and price of the fruit in separate elements in a new String array. Then get
//    the name of the fruit from index 0 and the price of the fruit from index 1 in the inner String array.

    public static void main(String[] args) {

        String fruits = "Apple 5,Banana 7,Lemon 3";

        String [] fruitsSplit = fruits.split(",");
        System.out.println(Arrays.toString(fruitsSplit));
        System.out.println();

//        for (int i = 0; i < fruitsSplit.length; i++){
//            String [] newArr = fruitsSplit[i].split(" ");
//            System.out.println("The price of " + newArr[0] + " is " + newArr[1]);
//        }

        for (String fruit : fruitsSplit){
            String [] newArr = fruit.split(" ");
            System.out.println("The price of " + newArr[0] + " is " + newArr[1]);
        }

    }
}
