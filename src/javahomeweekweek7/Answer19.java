package javahomeweekweek7;
//Java program to calculate the average value of array elements.
public class Answer19 {
    public static void main(String[] args) {
        int[] my_array = {
                10, 20, 30, 40, 50,
                60, 70, 80, 90, 100,
                110, 120, 130, 140};
        int sum = 0;
        for (int i = 0; i < my_array.length; i++)
            sum = sum + my_array[i];

        double average = sum / my_array.length;


        System.out.println("Average value of the array elements is : " + average);
        System.out.println();
    }
}
