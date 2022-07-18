package classesandmethod;

public class ApplyColor {

	public static void main(String[] args) {
	Figure figure=new Trapizium(new Pinkcolor());
	figure.insertcolor();
	Figure figure2=new Cube(new Redcolor());
	figure2.insertcolor();
	
	

	}

}
class Pinkcolor implements Color{
	@Override
	public void fillcolor() {
System.out.println("pink");		
	}
}
class Redcolor implements Color{
	@Override
	public void fillcolor() {
System.out.println("Red");		
	}
}
interface Color{
	 public void fillcolor(); 
		
	}
abstract class Figure{
	protected Color color;
	public Figure(Color c) {
		this.color=c;
	}
abstract public void  insertcolor();
}
class Trapizium extends Figure{

	public Trapizium(Color c) {
		super(c);
	
	}
	@Override
	public void insertcolor() {
		System.out.println("trap is filled with ");
		color.fillcolor();
	}}
	class Cube extends Figure{
public Cube(Color c) {
	super(c);
	
}
@Override
		public void insertcolor() {
System.out.println("Cube is filled with");
color.fillcolor();
		}
	}
