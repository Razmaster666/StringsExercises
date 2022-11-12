public class Task4 {

//    Task 4 – Split and trim
//    Use this String instead and create a solution with the same output as in task 3:
//    String names = "Apple, Banana, Lemon";
//    Hint:
//    Use the trim method on the strings to remove the space character in the beginning of the second
//    and third string.

    public static void main(String[] args) {

        String names = "Apple, Banana, Lemon";

        String[] namesSplit = names.split(",");

        for(String i : namesSplit){
            System.out.println("Remember to buy: " + (i.trim()) + "!");
        }

    }
}
