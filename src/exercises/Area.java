package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double r;
        double A = 0.00;
        Scanner in;
        final double pi = 3.14;

        in = new Scanner(System.in);
        System.out.println("Enter a number.");
        if (in.hasNextDouble()) {
            r = in.nextDouble();
            A = pi * r * r;
        } else
            System.out.println("Enter a valid floating point number!");

        System.out.println("The Area of the circle = " + A);
    }
}