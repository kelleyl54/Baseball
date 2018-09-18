package stats;

import java.util.Scanner;

public class player {
	
	String name;
	double atBats;
	double hits;
	double doubles;
	double triples;
	double homeRuns;
	double runs;
	double walks;
	
	Scanner stdin = new Scanner(System.in);
	
	public player() {
		
	}
	
	/*public player(String n; int ab, int h, int db, int tr, int hr, int r, int bb) {
		this.name = n;
		this.atBats = ab;
		this.hits = h;
		this.doubles = db;
		this.triples = tr;
		this.homeRuns = hr;
		this.runs = r;
		this.walks = bb;
	}*/
	
	public void gettingStats() {
		
		System.out.println("Please enter this player's name");
		name = stdin.nextLine();
		
		System.out.println("Please enter this player's total at bats");
		atBats = stdin.nextDouble();
		
		System.out.println("Please enter this player's total hits");
		hits = stdin.nextDouble();
		
		System.out.println("Please enter this player's total doubles");
		doubles = stdin.nextDouble();
		
		System.out.println("Please enter this player's total triples");
		triples = stdin.nextDouble();
		
		System.out.println("Please enter this player's total home runs");
		homeRuns = stdin.nextDouble();
		
		System.out.println("Please enter this player's total runs");
		runs = stdin.nextDouble();
		
		System.out.println("Please enter this player's total walks");
		walks = stdin.nextDouble();
	}
	
	public void battingAverage() {
		
		double ba = hits / atBats;
		
		System.out.println("This athlete's batting average is " + ba);
		
	}
	
	public void onBasePercentage() {
		
		double obp = (hits + walks) / (walks + atBats);
		
		System.out.println("This athlete's on base percentage is " + obp);;
		
	}
	
	public void sluggingPercentage() {
		
		double slg = (hits + doubles + 2 * triples + 3 * homeRuns) / atBats;
		
		System.out.println("This athlete's slugging percentage is " + slg);
		
	}
	
	public void onBasePlusSlugging() {
		
		double obs = (hits + doubles + 2 * triples + 3 * homeRuns) / atBats + (hits + walks) / (walks + atBats);
		
		System.out.println("This athlete's on base plus slugging percentage is " + obs);
				
	}
	
	public void totalBases() {
		
		double singles = hits - homeRuns - triples - doubles;
		
		double tb = singles + 2 * doubles + 3 * triples + 4 * homeRuns;
		
		System.out.println("This athlete's total bases are " + tb);
		
	}
	
	public static void main(String[] args) {
		player x = new player();
		x.gettingStats();
		x.battingAverage();
		x.onBasePercentage();
		x.sluggingPercentage();
		x.onBasePlusSlugging();
		x.totalBases();
	}
	
}
