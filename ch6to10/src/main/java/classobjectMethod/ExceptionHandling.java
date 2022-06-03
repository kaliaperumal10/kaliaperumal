package classobjectMethod;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("1st line ... ");
		try {
		//int i=10/0;
		
	int j=	Integer.parseInt(args[0]);
	System.out.println(j);
				//}catch(ArithmeticException e) {
			//System.out.println(e);
		}catch(NumberFormatException g) {
			System.out.println(g);
		}
		System.out.println("2nd line ... ");
		
	}

}
