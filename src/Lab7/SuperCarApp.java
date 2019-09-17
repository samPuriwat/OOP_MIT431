package Lab7;

import java.util.Scanner;

public class SuperCarApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Car brand: ");
        String b = sc.nextLine();
        System.out.print("Car color: ");
        String c = sc.nextLine();
        System.out.print("Car engine size: ");
        String e = sc.nextLine();
        System.out.print("Car origin country: ");
        String o = sc.nextLine();

        SuperCar s1 = new SuperCar(b, c, e, o);

        System.out.println(s1.getSuperCarInfo());






    }
}
