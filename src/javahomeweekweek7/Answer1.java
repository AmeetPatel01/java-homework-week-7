package javahomeweekweek7;
//java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)
import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter number to test");

        int number = scan.nextInt();
        scan.close();
        String result= number%2==0 ? "Even" : "Odd";
        System.out.println(number+ " is " +  result);
    }
}
