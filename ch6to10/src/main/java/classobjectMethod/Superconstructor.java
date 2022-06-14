package classobjectMethod;

public class Superconstructor {

	public static void main(String[] args) {
		new india("Ajith");
		
	}

}
class World
{
	public World(float h) {
		System.out.println(h);
	}}
class country extends World{
	public country(int k) {
	super(33.33f);
		System.out.println("value :"+ k);
	}
}
class india extends country{
	public india(String s) {
		super(100);
		
		
				System.out.println(s);
			
	}
}