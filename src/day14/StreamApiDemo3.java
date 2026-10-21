
package day14;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamApiDemo3 {
    public static void main(String[] args) {

        List<String> months = new ArrayList<>(Arrays.asList("january","february","march","april","may","june","july","auguat","september","october","november","december"));
       
        
        List<Integer> monthLens = months.stream()
        .map(m->m.length())
        
        .toList()
        ;
        System.out.println(monthLens);
        
        
        
        List<String> monthsendswithber = months.stream()
        		.filter(month->month.endsWith("ber"))
        		.collect(Collectors.toList());

        		System.out.println(monthsendswithber);
        ;
        
        
        long ans = months.stream()
        		.filter(m->m.length()>5)
        		.count()
        		;
        System.out.println(ans);
        
        
        
        
        
      
        		
        		


        
    }
}
