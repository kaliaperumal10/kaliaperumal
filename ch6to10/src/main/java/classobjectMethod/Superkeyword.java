package classobjectMethod;

public class Superkeyword {

	public static void main(String[] args) {
		Medium m=new Medium();
		m.qatar();
	}

}
abstract class qic{
	public void qatar() {
		System.out.println(" 1......");
	}
}
abstract class anoudtech extends qic{
		public void qatar() {
		super.qatar();
		System.out.println(" 2......");
	}
}
abstract class kalia extends anoudtech{
	final public void qatar() {
		super.qatar();
		System.out.println(" 3......");
	}
}
class Medium extends kalia{
	
}