public class Task3 {

//    Task 3 - Split
//
//    Copy this String to a main method:
//    String names = "Apple,Banana,Lemon";
//
//    Create a program that prints out messages using the String of names, that looks like this:
//
//    Remember to buy: Apple!
//    Remember to buy: Banana!
//    Remember to buy: Lemon!
//
//    Hint:
//    Use the split method on the names String to get all names in an array and then loop over the
//    array!

    public static void main(String[] args) {

        String names = "Apple,Banana,Lemon";

        String[] namesSplit = names.split(",");

        for(String i : namesSplit){
            System.out.println("Remember to buy: " + i + "!");
        }

    }
}
