package Quiz1;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("A subject: ");
        String s1 = sc.nextLine();
        System.out.print("b subject: ");
        String s2 = sc.nextLine();
        System.out.print("b subject: ");
        String s3 = sc.nextLine();
        double g1 = compareGrade(s1);
        double g2 = compareGrade(s2);
        double g3 = compareGrade(s3);

        double gpa = (g1+g2+g3)/3.0;

        Student std1 = new Student("Sam", "001", "MIT", gpa);
        System.out.println(std1.toString());


    }//main

    private static double compareGrade(String s1) {
        if (s1.equals("A") || s1.equals("a")) {
            return 4.00;
        } else if (s1.equals("B+")) {
            return 3.50;
        } else if (s1.equals("B")) {
            return 3.00;
        } else if (s1.equals("C+")) {
            return 2.50;
        } else if (s1.equals("C")) {
            return 2.00;
        } else if (s1.equals("D+")) {
            return 1.50;
        } else if (s1.equals("D")) {
            return 1.00;
        }else {
                return 0.00;
            }
    }


}
