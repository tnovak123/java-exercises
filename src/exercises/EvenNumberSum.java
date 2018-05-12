package exercises;

import java.util.ArrayList;
//import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args){

        ArrayList<Integer> even = new ArrayList<>();
        Integer s = 0;

        for (int i = 1; i < 11; i++){
            even.add(i);
        }

        for (int i = 0; i < even.size(); i++) {
            if (even.get(i) % 2 == 0) {
                s += even.get(i);
                System.out.println(even.get(i));
            }
        }
        System.out.println(s);
    }
}
