package classobjectMethod;
//multilevel inheritance
public class Inheritance1 {

	public static void main(String[] args) {
//		queen c = new queen();		
//		c.period();		
//		c.conquer();
//		c.princess();
		fort f=new king();
		f=new queen();
		f.period();
		
	}}
class fort{
	String name ="magilmathi";
	public void period() {

		System.out.println("1800AD");
	}
}
class king extends fort
{
public void conquer() {
	System.out.println(name);
	System.out.println("bahubali");
}
}
class queen extends fort
{
public void princess() {
	
	System.out.println("devasena");
}
}