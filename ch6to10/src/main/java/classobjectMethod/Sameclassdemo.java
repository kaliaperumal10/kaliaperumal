package classobjectMethod;
//access specifier calling rules
//normal class
//no sub class
//sub class
public class Sameclassdemo {

}
class sameclass1{
	int r;
	public String s;
	private int t;
	protected int u;
	public void same() {
		System.out.println(r);	
		System.out.println(s);	
		System.out.println(t);	
		System.out.println(u);					
	}
}
class subclass1{
	public void same1() {
		sameclass1 o=new sameclass1();
		System.out.println(o.r);	
		System.out.println(o.s);	
	//	System.out.println(o.t);	
		System.out.println(o.u);			
	}
}
class subclass2 extends sameclass1{
	public void same1() {
		
		System.out.println(r);	
		System.out.println(s);	
	//	System.out.println(t);	
		System.out.println(u);	
		
		
	}
}