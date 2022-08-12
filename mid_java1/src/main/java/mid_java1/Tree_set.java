package mid_java1;


import java.util.Comparator;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
//		TreeSet<String> ts=new TreeSet<String>();
//		ts.add("4");
//		ts.add("1");
//		ts.add("3");
//		ts.add("2");
//		System.out.println(ts);
		TreeSet<String> ts1=new TreeSet<String>(new Mycmp());
		// TreeSet<String> res = (TreeSet<String>)ts1.descendingSet();
		ts1.add("5");
		ts1.add("1");
		ts1.add("7");
		ts1.add("2");
		
	//	System.out.println(res);
		System.out.println(ts1);
	}
}
class Mycmp implements Comparator<String>{
	  
   
    public int compare(String c1, String c2)
    {
 //System.out.println(c1);
 //System.out.println(c2);
        return c2.compareTo(c1);
    }
}