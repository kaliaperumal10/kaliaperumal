package mid_java1;

import java.util.Map;
import java.util.WeakHashMap;

public class Coll_Weakhashmap {

	public static void main(String[] args) {
		Map<String,String> mp=new WeakHashMap<String, String>();
		String a1=new String("sec1");
		String a2=new String("sec2");
		mp.put(a1,"mech");
		mp.put(a2,"elec");
		System.out.println(mp);
	a1=null;
		System.out.println(mp);
	System.gc();
	System.out.println(mp);
	}

}
