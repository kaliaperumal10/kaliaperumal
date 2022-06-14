package classobjectMethod;

public class Inheritancedemo1 {

	public static void main(String[] args) {
		head h=new tail();
		
		System.out.println(h.name);
		h.bottom();
	}

}
abstract class head{
	String name="anoud";
	public head() {
		System.out.println("jehfb");
	}
	public void bottom() {
		System.out.println("top....");
	}
}
class tail extends head
{
	public void bottom(){
		System.out.println("bot of the sub");
		
	}
}