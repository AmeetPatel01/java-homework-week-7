package javahomeweekweek7;

import java.util.Scanner;

//java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
public class Answer16 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:    ");
        num = scan.nextInt();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero");
        }
    }
}
