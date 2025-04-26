import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new list to store integer numbers
        List<Integer> numbers = new ArrayList<>();

        // Add numbers to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        /*
         The replaceAll method:
         - It applies the given lambda expression to each element of the list.
         - It replaces each element with the result of the lambda.
         - In this case: for every number, multiply it by 2 and update the list.
         */
        numbers.replaceAll(number -> number * 2);

        // Print each number in the list after modification
        // forEach + method reference (System.out::println) is used for clean printing
        numbers.forEach(System.out::println);
    }
}
