package exercises;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class CountingCharacters {
    public static void main(String[] args) {

        String myString = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.");
        char[] charList = myString.toCharArray();
        ArrayList<HashMap> charCountList = new ArrayList<>();
        HashMap<Character, Integer> charTotal = new HashMap<>();
        //Integer[] charCount = new Integer[];
        Integer Total = 0;

        for (int i = 0; i < charList.length; i++){
            char letter = charList[i];
            Total = 0;
            for (int x = 0; x < charList.length; x++) {
                if (charList[x] == letter) {
                    Total++;
                }
            }
            charTotal.put(letter, Total);
            //System.out.println(charTotal[letter]);
            //charCountList.add(charTotal);
        }
        charTotal.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
