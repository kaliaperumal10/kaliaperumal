package test;

public class CommandPattern1 {

	public static void main(String[] args) {
		Internationalcricket.useDomesticCricket();
	}
}
class Teams{
	public void india() {
		System.out.println("Team india...");
	}
	public void Bcci() {
		System.out.println("international players...");
	}
}
class Toss{
	public void heads() {
		System.out.println("heads is a call...");
	}
	public void tails() {
		System.out.println("tails is a call...");
	}
}
class Batting{
	public void readytobat() {
		System.out.println("Bat First...");
	}
}
class Bowling{
	public void readytobowl() {
		System.out.println("Bowl First...");
	}
}
interface Coach{
	public void decision();
}
class Captain implements Coach{
	Teams teams;
	Toss toss;
	Batting batting;
	Bowling bowling;
	public Captain(Teams teams,Toss toss,Batting batting,Bowling bowling) {
		this.teams=teams;
		this.toss=toss;
		this.batting=batting;
		this.bowling=bowling;
	}
	@Override
	public void decision() {
	System.out.println("captain is a opening batsman...");
	teams.india();
	teams.Bcci();
	toss.heads();
	batting.readytobat();
	System.out.println("Captain will score more runs againts england...");
	}
	}
class Siraj implements Coach{
	Teams teams;
	Toss toss;
	Batting batting;
	Bowling bowling;
	public Siraj(Teams teams,Toss toss,Batting batting,Bowling bowling) {
		this.teams=teams;
		this.toss=toss;
		this.batting=batting;
		this.bowling=bowling;
	}
	@Override
	public void decision() {
	System.out.println("siraj is a new bowler...");
	teams.india();
	teams.Bcci();
	bowling.readytobowl();
	System.out.println("siraj economy rate 4.5 ...");
	}
	}
class Virat implements Coach{
	Teams teams;
	Toss toss;
	Batting batting;
	Bowling bowling;
	public Virat(Teams teams,Toss toss,Batting batting,Bowling bowling) {
		this.teams=teams;
		this.toss=toss;
		this.batting=batting;
		this.bowling=bowling;
	}
	@Override
	public void decision() {
	System.out.println("virat is a captain...");
	teams.india();
	teams.Bcci();
	toss.tails();
	
	System.out.println("virat won the toss ...");
	}
	}
class Substituteplayer implements Coach{
	@Override
	public void decision() {
		System.out.println("i am a substitute player...");
		
	}
}
class DomesticCricket{
	Coach coach[]=new Coach[5];
	public DomesticCricket() {
		for(int i=0;i<coach.length;i++) {
			coach[i]=new Substituteplayer();
	}
	}
public void setCoach(Coach coach,int order) {
	this.coach[order]=coach;
}
public void executeCoach(int orders) {
	coach[orders].decision();
}
}
class Internationalcricket{
	public static void useDomesticCricket() {
		System.out.println("The players in domestic cricket...");
		Teams teams=new Teams();
		Toss toss=new Toss();
		Batting batting =new Batting();
		Bowling bowling =new Bowling();
		Captain cp=new Captain(teams, toss, batting, bowling);
		Siraj sj=new Siraj(teams, toss, batting, bowling);
		Virat vk=new Virat(teams, toss, batting, bowling);
		DomesticCricket ic=new DomesticCricket();
		ic.executeCoach(1);
		ic.setCoach(cp, 0);
		ic.setCoach(sj, 1);
		ic.setCoach(vk, 2);
		System.out.println("captain will play first.............");
		ic.executeCoach(0);
	}
}


















