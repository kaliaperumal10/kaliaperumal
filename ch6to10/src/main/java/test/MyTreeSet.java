package test;
//import java.util.Comparator;
import java.util.TreeSet;
public class MyTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		 TreeSet<Integer> res = (TreeSet<Integer>)ts1.descendingSet();
		ts1.add(5);
		ts1.add(3);
		ts1.add(7);
		ts1.add(2);
		System.out.println("Descendingorder : "+res);
		System.out.println("Ascendingorder : "+ts1);
	}
}
//class Mycmp implements Comparator<String>{
//	  
//   
//    public int compare(String c1, String c2)
//    {
// //System.out.println(c1);
// //System.out.println(c2);
//        return c2.compareTo(c1);
//    }
//}