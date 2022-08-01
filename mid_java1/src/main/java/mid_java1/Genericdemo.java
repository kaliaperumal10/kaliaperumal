package mid_java1;

public class Genericdemo {
	public static void main(String[] args) {
		//GoodPaintBrushVer2 gp=new GoodPaintBrushVer2();
		//GoodPaintBrushVer3<Water> gp3=new GoodPaintBrushVer3<>();
		GoodPaintBrushVer3<Air> gp4=new GoodPaintBrushVer3<>();
	Water water=new Water();
		Air dryair=new Air();
		
	//gp3.setObj(water);
		gp4.setObj(dryair);
		
		//water=(Water)gp3.getObj();
		dryair=(Air)gp4.getObj();
		
		//water.sprinkle();
		dryair.dusting();
	}
}
class Water{
	public void sprinkle() {
		System.out.println("water is sprinkled..");
	}
}
class Air{
	public void dusting() {
		System.out.println("dusting............");
	}}
/*
 * 1. Convert the condition to classes.
 * 2. Group them under a hierarchy.
 * 3. Create a association between the using class and hierarchial class
 */
class GoodPaintBrushVer3<T>{
	private T obj;
	public T getObj() {
		return this.obj;
	}
	public void setObj(T obj) {
		this.obj=obj;
	}}
