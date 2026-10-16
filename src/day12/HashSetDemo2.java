package day12;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {

        //String name = "rajesh";
        String name = "apple";
        char ch = FindFirstRepeatedChar(name);

        System.out.println("First repeated character is: " + ch);
    }

    private static char FindFirstRepeatedChar(String name) {
        Set<Character> hashset = new HashSet<>();

        for (char ch : name.toCharArray()) {
            if (hashset.contains(ch)) {
                return ch;
            } else {
                hashset.add(ch);
            }
        }

        return '\0';
    }
}