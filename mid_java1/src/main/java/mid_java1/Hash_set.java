package mid_java1;

import java.util.HashSet;

public class Hash_set {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		HashSet<Integer> h=new HashSet<Integer>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("onee");
		h.add(1);
		h.add(0);
		h.add(5);
		h.add(4);
		h.add(6);
		System.out.println(h);
		System.out.println(hs);

	}

}
