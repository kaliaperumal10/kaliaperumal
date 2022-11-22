package uml;

public class Factory {

	public static void main(String[] args) {
		shoeshop ss=new shoeshop();
		ss.sellshoe();
	}
}
interface store{
	public void makeshoe();
	
}
class shoefactory implements store{
	public String name;
	public void makeshoe() {
		System.out.println("shoe manfacturing");
	}
	public void doexport()
	{
		System.out.println("shoe exporter");
	}
	}
class shoeshop {
	public void sellshoe() {
		System.out.println("shoe seller");
	}
}
class customer{
	public void buyer() {
		shoeshop ss=new shoeshop();
		ss.sellshoe();
	}
}