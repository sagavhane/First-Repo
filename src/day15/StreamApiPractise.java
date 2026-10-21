package day15;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiPractise {

    public static void main(String[] args) {

        List<Player> players = Arrays.asList(
            
        		new Player("Virat Kohli", "India",14000, 4, 18, 290, 150),

            
        		new Player("Rohit Sharma", "India",11000, 8, 16, 260, 120),

            
        		new Player("MS Dhoni", "India",10000, 1, 20, 350, 110),

            
        		new Player("Joe Root", "England",12500, 65, 12, 220, 90),

           
        		new Player("Ben Stokes", "England",7000, 200, 10, 180, 80),

            
        		new Player("Steve Smith", "Australia",10500, 20, 14, 240, 70),

            
        		new Player("David Warner", "Australia", 9000, 0, 15, 190, 60),

            
        		new Player("Kane Williamson", "New Zealand",8500, 30, 8, 170, 50)
        );

        // Question 1  : Partition players into two groups: Indian players and non-Indian players.

        
        
        
        Map<Boolean,List<Player>> result =players.stream()
        .collect(Collectors.partitioningBy(
        		p->p.getCountry().equals("India")
        		));
        
        System.out.println("Indian players : "+result.get(true).stream()
        		.map(p->p.getName())
        		.toList()
        		);
        
        System.out.println("Non-Indian Players :"+result.get(false).stream()
        		.map(p->p.getName())
        		.toList()
        		
        		);
        
       
        // Questions 2 : Partition players into two groups based on whether they have scored more than 10,000 runs.
        
        Map<Boolean,List<Player>> result1 = players.stream()
        		.collect(Collectors.partitioningBy(
        				
        				p->p.getRuns()>10000
        				
        				));
        
        System.out.println("More than 10000 run players :"+result1.get(true).stream()
        		.map(p->p.getName())
        		.toList()
        		);
        
        System.out.println("Less than 10000 run Players :"+result1.get(false).stream()
        		
        		.map(p->p.getName())
        		.toList()
        	);
        		
        
        // Question 3 : 3. Partition players into two groups based on whether they have taken more than 100 wickets.
        
        Map<Boolean,List<Player>> result2 = players.stream()
        		
        		.collect(Collectors.partitioningBy(
        				
        				p->p.getWickets()>100
        			));
        
        
        
        System.out.println("More than 100 Wickets Players :"+result2.get(true).stream()
        		
        		.map(p->p.getName())
        		.toList()
        		
        		);
        
        System.out.println("less than 100 wickets Players :"+result2.get(false).stream()
        		
        		.map(p->p.getName())
        		.toList()
        		);
        
        
        
        
       // Question 4 : Partition players into two groups based on whether they have won 15 or more trophies.
        
        
        Map<Boolean,List<Player>> result3 = players.stream()
        		.collect(Collectors.partitioningBy(
        				p->p.getTrophies()>15
        				));
        
        System.out.println("More than 15 trophies players :"+result3.get(true).stream()
        		
        		.map(p->p.getName())
        		.toList()
        		);
        
        System.out.println("Less than 15 trophies players :"+result3.get(false).stream()
        		
        		.map(p->p.getName())
        		.toList()
        	        );
        
        
        // Question 5 : Partition players into two groups based on whether they have played 250 or more matches. Display only the count of players in each group.
        
        Map<Boolean,Long> result4 = players.stream()
        		
        		.collect(Collectors.partitioningBy(
        				
        				p->p.getMatches()>=250,
        				Collectors.counting()
        			));
        
        
        System.out.println("250 or more matches :"+result4.get(true));
        System.out.println("Fewer than 250 mathces :"+result4.get(false));
        
        
       // Question 6 : Group all players by their country and display the list of players in each country.
        
        
        Map<String,List<Player>> result5 = players.stream()
        		
        		.collect(Collectors.groupingBy(
        				p->p.getCountry()
        				));
        
        
        System.out.println(result5);
        		
        		
        
    }
}
































































