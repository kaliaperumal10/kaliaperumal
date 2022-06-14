package classobjectMethod;

public class Staticconstructor {
static {
		System.out.println("static block called....");
	}
	public static void main(String[] args) {
		SBDemo obj=new SBDemo();
	
		System.out.println(obj.j);
		SBDemo.met();
		//SBDemo.met2();
	}
}
class SBDemo{
	String j;
	static {
		System.out.println("SBDemo static block called....");
	}
	SBDemo(){//constructor
	j="tseh";
		System.out.println("constructor called...");
		
	}
	static void met() {
		System.out.println("static method met called...");
	}
	
	static void met2() {
		System.out.println("static method met2 called...");
	}

}
