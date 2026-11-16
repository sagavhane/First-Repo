
package day18;

import java.util.Stack;

public class Bracket {

    public static void main(String[] args) {

        String s = "{[()]}";

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // If opening bracket, push into stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

            // If closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (st.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        if (st.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
