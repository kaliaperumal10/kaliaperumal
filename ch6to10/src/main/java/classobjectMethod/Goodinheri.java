package classobjectMethod;

public class Goodinheri {
public static void main(String[] args) {
	Item obj=new Biscuit2();
	obj.display();
	obj=new Stick2();
	obj.display();
	
}
}

abstract class Item{
	public abstract void display();
}
class Stone1 extends Item{
	@Override
	public void display() {
		System.out.println("biting...............");
	}
}
class Stick2 extends Item{
	@Override
	public void display() {
		System.out.println("running....");
	}
}
class Biscuit2 extends Item{
	@Override
	public void display() {
		System.out.println("enjoying....");
	}
}