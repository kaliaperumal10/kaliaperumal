package classobjectMethod;

public class Inheridemo3 {
	public static void main(String[] args) {
		Hall1 hall=new BirthDayHall();
		
		hall=new MarriageHall();
	}
}
abstract class Hall1{
	
}
class BirthDayHall extends Hall1{
	
}
class MarriageHall extends Hall1{
	
}
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red color");
		}
		else if(i==2) {
			System.out.println("blue color");
		}
	}
}
class PaintBrush{
	public void doPaint(Paint p) {
		System.out.println(p);
	}
}
class Paint{
	
}
abstract class Paintt{}
class BluePaint extends Paintt{}
class GreenPaint extends Paintt{}
class BadDog{
	public void play(String item1) {
		if(item1.equals("stick")) {
			System.out.println("running......");
		}
		else if(item1.equals("stone")) {
			System.out.println("biting....");
		}
		else if(item1.equals("biscuit")) {
			System.out.println("enjoying...");
		}
	}
}
class GoodDog{
	public void play(Item1 item) {
		item.display();
	}
}
abstract class Item1{
	public abstract void display();
}
class Stone11 extends Item1{
	@Override
	public void display() {
		System.out.println("biting...............");
	}
}
class Stick21 extends Item1{
	@Override
	public void display() {
		System.out.println("running....");
	}
}
class Biscuit21 extends Item1{
	@Override
	public void display() {
		System.out.println("enjoying....");
	}
}

