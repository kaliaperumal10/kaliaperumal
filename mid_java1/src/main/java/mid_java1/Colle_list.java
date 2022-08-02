package mid_java1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Colle_list {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		List<Integer>list1=new ArrayList<>();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		System.out.println(list.size());
		list1.add(6);
		System.out.println(list.size());
		//list.remove(0);
		System.out.println(list.size());
		
		System.out.println(list.get(2));
		
		System.out.println(list);
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("********$$$$$$$$$$$$$$$$**********");
		Iterator<String>iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("#########################################");
		ListIterator<String>lit=list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("????????????????????????????????");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
