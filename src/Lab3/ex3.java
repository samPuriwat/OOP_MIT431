package Lab3;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total =0;
        int avg;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integers "+(i+1)+": ");
            total += sc.nextInt(); // total = total +sc.nextInt()
        }

        System.out.println("Total value: "+total);
        System.out.println("Average value: "+(total/10));






    }

}
