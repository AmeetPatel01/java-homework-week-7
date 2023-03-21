package javahomeweekweek7;

import java.util.Scanner;

//program-8 using switch statement.
public class Answer9 { public static void main(String[] args) {
    String city;
    Scanner myScan = new Scanner(System.in);
    System.out.println("Enter any character from A to F:   ");
    city = myScan.nextLine();

    switch (city) {
        case "A":
            System.out.println("Ahmedabad");
            break;
        case "B":
            System.out.println("Baroda");
            break;
        case "C":
            System.out.println("Chandigarh");
            break;
        case "D":
            System.out.println("Dari");
            break;
        case "E":
            System.out.println("Edinburgh");
            break;
        case "F":
            System.out.println("Florence");
            break;
        default:
            System.out.println("Invalid entry");

    }
    myScan.close();
}
}
