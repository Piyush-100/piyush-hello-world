import java.util.*;

public class ReverseAndSortNumber {
    public static void main(String[] args) {
        int number = 43152;  // Example number
        int sortedNumber = reverseAndSort(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed and Sorted Number: " + sortedNumber);
    }

    public static int reverseAndSort(int number) {
        // Step 1: Extract digits and store in a list
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }

        // Step 2: Sort the digits in ascending order
        Collections.sort(digits);

        // Step 3: Reconstruct the number from sorted digits
        int sortedNumber = 0;
        for (int digit : digits) {
            sortedNumber = sortedNumber * 10 + digit;
        }

        return sortedNumber;
    }
}
