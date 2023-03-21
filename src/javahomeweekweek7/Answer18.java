package javahomeweekweek7;
//Java program to sum values of an array.
public class Answer18 {
        public static void main(String[] args) {
                int[] my_array = {
                        10, 20, 30, 40, 50,
                        60, 70, 80, 90, 100,
                        110, 120, 130, 140};
                int sum = 0;
                for (int i = 0; i < my_array.length; i++) {
                        sum = sum + my_array[i];

                }
                System.out.println(" Sum value of an Array is:   " + sum);
        }
}
