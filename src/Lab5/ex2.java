package Lab5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int num[] = new int[5];
        
        //input
        num = inputData(num);

        //output
        printData(num);

        //find Average
        findAverage(num);
    }

    private static void findAverage(int[] num) {
        int total =0;
        for (int val : num) {
            total += val; //total = total+val
        }
        System.out.println("Total: "+total);
        System.out.println("Average: "+(total/num.length));

    }

    private static void printData(int[] num) {
        System.out.println("Data in array: ");
        for (int val:num) {
            System.out.print(val+" ");
        }
    }

    private static int[] inputData(int[] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length ; i++) {
            System.out.print("Enter integer: ");
            num[i] = sc.nextInt();
        }
        return num;
    }


}
