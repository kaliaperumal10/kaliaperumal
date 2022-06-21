package classobjectMethod;
public class InterDemo4 {
	public static void main(String[] args) {
		//1. Anonymous 2. Method Referencing 3. Lambda 4. Muthur teacher
		
		//1. Anonymous inner class implementation
//	 new FInterOne() {			
//			@Override
//			public void met() {
//				System.out.println("anonymous inner class met called..");				
//			}
//		}.met();
//			int width =10;
//		FInterOne k=()->{System.out.println( "hh "+width);};
//
//		k.met();		
//	}
//	public static void mym() {
//		System.out.println("gdfj");
//	}
//}
//class MyFInterOneImpl implements FInterOne{
//	@Override
//	public void met() {
//		System.out.println("met normal old implementation called...");
//	}
//}
//   ************part 2***********		
			int val=new FIntertwo() {
			
			@Override
			public int met() {
				System.out.print("the value of FIntertwo.. : ");
				return 1000;
			}
		}.met();
		System.out.println(val);
	
	FIntertwo vale=new InterDemo4()::met1;
	
	System.out.println(vale.met());
	}

public int met1() {
	return 100;
	


}
interface FInterOne{
	public void met();
}
interface FIntertwo{
	public int met();
}
}