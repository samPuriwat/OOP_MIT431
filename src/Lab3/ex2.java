package Lab3;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        int testScore;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numeric test score and I will tell you the grade: ");
        testScore = sc.nextInt();
        if(testScore <= 49.99)
            System.out.println("Your grade is F. ");
        else if(testScore <= 50.00 && testScore <= 54.99)
            System.out.println("Your grade is D. ");
        else if(testScore <= 59.99)
            System.out.println("Your grade is C. ");
        else if(testScore < 90)
            System.out.println("Your grade is B. ");
        else if(testScore <= 100)
            System.out.println("Your grade is A. ");
        else
            System.out.println(" Invalid Score. ");



    }
}
