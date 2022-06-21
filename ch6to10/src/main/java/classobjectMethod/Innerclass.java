package classobjectMethod;

public class Innerclass {

	public static void main(String[] args) {
	
	street c1=new street();
	c1.totalstreet();
	housee c2=new housee();
	c2.myhouse();
	building c3=new building();
	c3.bil();
	}
}

class street{
	public void totalstreet() {
		housee.city c=new housee().new city();
		c.totalcity();
		System.out.println("they have 20 street");
		
	}
}
class building extends street{
	public void bil() {
		street cy=new street();	
	cy.totalstreet();
	}
}
class housee{
	class city{
		public void totalcity() {
			
			System.out.println("this is my city");
		}
	}
	public void myhouse() {
		city c=new city();
		c.totalcity();
		
		System.out.println("they have 5 house");
	}
}
