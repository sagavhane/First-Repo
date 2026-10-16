
package day14;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamApiDemo {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        numbers.stream()
        .map(n->n*n)
        .forEach(n->System.out.println(n));
        
        
        
        List<Integer> squrenums = numbers.stream()
        		.map(num->num*num)
        		.collect(Collectors.toList());
        System.out.println(squrenums);
        
        
        
        
        List<Integer> multiplier = numbers.stream()
        		.map(n->n*10)
        		.collect(Collectors.toList());
        System.out.println(multiplier);
        
        
        
        
        numbers.stream()
        .map(n -> {
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            return fact;
        })
        .forEach(fact -> System.out.println(fact));
        
        
        		
        		


        
    }
}
