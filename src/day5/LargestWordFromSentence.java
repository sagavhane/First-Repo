package day5;

public class LargestWordFromSentence {
	public static void main(String[] args) {
		
		String name = "sangram adinath gavhane";
		
		String[] words = name.split(" ");
		
		int max = 0;
		String maxword = words[0];
		
		for(int i =0;i<words.length;i++) {
			
			if(words[i].length()>max) {
				max = words[i].length();
				maxword = words[i];
			}
			
			
		}
		System.out.println(maxword+" "+ max);
		
		
		
		
	}

}
