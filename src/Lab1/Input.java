package Lab1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        Scanner scanner1  = new Scanner(System.in);

        System.out.print("What's your name?: ");
        String name = scanner1.nextLine();

        System.out.println(name);

        System.out.print("How old are you?: ");
        int age = scanner.nextInt();

        System.out.println(age);


        System.out.print("Email: ?: ");
        String email = scanner1.nextLine();

        System.out.println(email);

    }
}//class
