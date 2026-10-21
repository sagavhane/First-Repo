package day15;

public class Player {

	private String name;
	private String country;
	private int runs;
	private int wickets;
	private int trophies;
	private int matches;
	private int catches;
	
	public Player() {
		
	}
	
	public Player(String name,String country,int runs,int wickets,int trophies, int matches,int catches) {
		
		this.name=name;
		this.country=country;
		this.runs=runs;
		this.wickets=wickets;
		this.trophies=trophies;
		this.matches=matches;
		this.catches=catches;
		
	}


	public String getName() {
		return name;
	}


	public String getCountry() {
		return country;
	}


	public int getRuns() {
		return runs;
	}


	public int getWickets() {
		return wickets;
	}


	public int getTrophies() {
		return trophies;
	}


	public int getMatches() {
		return matches;
	}


	public int getCatches() {
		return catches;
	}
	 @Override
	    public String toString() {
	        return name + " (" + country + ")";
	    }
}
