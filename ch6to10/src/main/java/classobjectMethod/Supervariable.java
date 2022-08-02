package classobjectMethod;

public class Supervariable {

	public static void main(String[] args) {
		C obj=new C();
		obj.met();
	}

}
class A{
	int i=30;
}
class B extends A{
	int i=20;
	
}
class C extends B{
	int i=10;
	public void met() {
		System.out.println(i);
		System.out.println(super.i);
		}
}