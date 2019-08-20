package Lab5;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        int num[][] = new int[2][3];
        inputData(num);
        displayData(num);
        findAverage(num);
        findMax(num);
        findMin(num);
    }

    private static void findMin(int[][] num) {
        int min = num[0][0];
        for (int i = 0; i < num.length; i++) {  //loop row
            for (int j = 0; j < num[i].length; j++) { //loop column

                if (min > num[i][j]) {
                    min = num[i][j];
                }
            }
        }
        System.out.println("Minimum: "+min);
    }

    private static void findMax(int[][] num) {
        int max = num[0][0];
        for (int i = 0; i < num.length; i++) {  //loop row
            for (int j = 0; j < num[i].length; j++) { //loop column

                if (max < num[i][j]) {
                    max = num[i][j];
                }
            }
        }
        System.out.println("Maximum: "+max);
    }

    private static void findAverage(int[][] num) {
        int total = 0;
        int count = 0; // count = num.length*num[].length

        int x = num.length * num[0].length;

        for (int i = 0; i < num.length; i++) {  //loop row
            for (int j = 0; j < num[i].length; j++) { //loop column
                total += num[i][j];
                count++;
            }

        }
        System.out.println("Average: "+(total/count));
        System.out.println("Average: "+(total/x));
    }

    private static void displayData(int[][] num) {
        System.out.println("Data in array 2D: ");
        for (int val[]:num) {
            for (int x:val) {
                System.out.print(x+" ");
            }
        }
    }
    private static void inputData(int[][] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {  //loop row
            for (int j = 0; j < num[i].length ; j++) { //loop column

                System.out.print("Enter num["+i+"]["+j+"]: ");
                num[i][j] = sc.nextInt();
            }
        }
    }

    //input data
    //display data

    //find average
    //find max
    //find min
}
