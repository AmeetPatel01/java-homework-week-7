package javahomeweekweek7;

import java.util.Arrays;

//Java program to sort a numeric array and a string array.
public class Answer17 {
    public static void main(String[] args) {
        int[] my_array_one = {
                90, 100, 30, 130, 140,
                60, 70, 80, 10, 20,
                110, 120, 40, 50, 25};
        String[] my_array_two = {
                "Ten", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety", "Hundred"};
        System.out.println("Original numeric array:  " + Arrays.toString(my_array_one));
        Arrays.sort(my_array_one);
        System.out.println("Sorted numeric array:  " + Arrays.toString(my_array_one));

        System.out.println("Original numeric array:  " + Arrays.toString(my_array_two));
        Arrays.sort(my_array_two);
        System.out.println("Sorted numeric array:  " + Arrays.toString(my_array_two));
    }
}
