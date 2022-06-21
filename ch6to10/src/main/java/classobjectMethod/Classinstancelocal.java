package classobjectMethod;

public class Classinstancelocal {

	public static void main(String[] args) {
		House.saram="this is common saram...";
		System.out.println(House.saram);
		House veedu1=new House();
		veedu1.hall="Dining hall...";
		veedu1.saram="2 ton saram bought...";
		
		
		System.out.println("Veedu1 saram...:"+veedu1.saram);
		System.out.println("Veedu1 hall..:"+veedu1.hall);
		veedu1.hall("led..tv...");
		
		House veedu2=new House();
		veedu2.hall="Reading hall...";
		System.out.println("Veedu2 saram...:"+House.saram);
		System.out.println("Veedu2 hall..:"+veedu2.hall);
		veedu2.hall("lcd ..tv....");
		
		System.out.println("v1..:"+veedu1.hall);
		System.out.println("v2..:"+veedu2.hall);
		
		House.saram="3 ton saram....";
		
		System.out.println("v2...:"+veedu1.saram);
		
	}}
	class House
	{
		static String saram;//static class
		String hall;//instance variable
		public void hall(String tv)
		{
			String tvs=tv;//local variable
			System.out.println(tvs);
		}
	}

