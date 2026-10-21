
package day16;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        
        String name = getUsername(0);
        System.out.println(name);

        
        Optional<String> username = getUsernameInJava8(1);
        System.out.println(username);
        System.out.println(username.orElse("Username not found"));
    }

   
    public static String getUsername(int n) {

        if (n == 1) {
            return "Alice";
        } else {
            return null;
        }
    }

    
    public static Optional<String> getUsernameInJava8(int n) {

        if (n == 1) {
            return Optional.of("Alice");
        } else {
            return Optional.empty();
        }
    }
}
