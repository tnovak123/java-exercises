package exercises;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String input;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter your name.");
        input = in.next();
        System.out.println("Hello, " + input);
    }
}
