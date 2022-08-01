package mid_java1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Coll_HashTreemap {

	public static void main(String[] args) {
//		HashMap<Integer,String> hm=new HashMap<Integer, String>();
//		
//		hm.put(1,"value is :two");
//		hm.put(2,"value is :one");
//		hm.put(3,"value is :five");
//		hm.put(4,"value is :four");
//		hm.put(5,"value is :three");
//		System.out.println(hm);
//		System.out.println(hm.get(3));
//		System.out.println(hm.get(5));
		HashMap<String,String> hm=new HashMap<String, String>();
		//TreeMap<String,String> hm1=new TreeMap<String, String>();
		hm.put("s100","ramu");
		hm.put("s200","somu");
		hm.put("s300","raju");
		hm.put("s400","rakesh");
		hm.put("s500","anwar");
		
		System.out.println(hm);
		HashMap<String,String> hm1=new HashMap<String, String>();
		hm1.put("a1","jack");
		hm1.put("a2","jeep");
		hm1.put("a3","nee");
		hm1.put("a4","he");
		hm1.put("a5","qiugjgoigh");
		System.out.println(hm1);
//		TreeMap<String,String> hm2=new TreeMap<String, String>();
//		hm2.put("a1","jai");
//		hm2.put("a2","jee");
//		hm2.put("a4","nee");
//		hm2.put("a3","hee");
//		System.out.println(hm1);
		Set<Map.Entry<String,String>> s=hm1.entrySet();
		Iterator<Map.Entry<String,String>> iter=s.iterator();
		while (iter.hasNext()) {
			Map.Entry<String,String> me=iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
			
		}
	}

}
