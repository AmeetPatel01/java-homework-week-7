package javahomeweekweek7;

import java.util.Scanner;

//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PF
public class Answer5 {
    public static void main(String[] args) {
        double HRA;
        double DA;
        double TA,PF;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int EmployeeID = sc.nextInt();
        System.out.println("Enter Employee name: ");
        String EmployName = sc.next();
        System.out.println("Enter basic salary: ");
        double BasicSalary = sc.nextDouble();


        HRA=BasicSalary*10/100;
        DA=BasicSalary*8/100;
        TA=BasicSalary*9/100;
        PF=BasicSalary*20/100;
        double GrossSalary= BasicSalary+ HRA+TA+DA-PF;
        System.out.println("|---------------------------------------------------|");
        System.out.println("|                 Salary Slip                       |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("|Employee ID    :        " + EmployeeID+"           |");
        System.out.println("|Employee name  :        "+ EmployName+"            |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("|Basic salary   :       "+BasicSalary+"             |");
        System.out.println("|HRA            :        "+ HRA +"                  |");
        System.out.println("|TA             :        "+ TA +"                   |");
        System.out.println("|DA             :        " +DA+ "                   |");
        System.out.println("|PF-20&         :        " +PF+ "                   |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("|Gross          :       "+GrossSalary+"             |");
        System.out.println("|===================================================|");


    }

}
