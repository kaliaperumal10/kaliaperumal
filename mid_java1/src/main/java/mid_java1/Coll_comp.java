package mid_java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Coll_comp {

	public static void main(String[] args) {
		List<Student>list= new ArrayList<Student>();
		list.add(new Student("ramu"));
		list.add(new Student("lachu"));
		list.add(new Student("sam"));
		list.add(new Student("tom"));
		System.out.println("before sorting..:"+list);
		Collections.sort(list,new Mycomparator() );
		System.out.println("after sorting..:"+list);
		HashSet<Student> hs=new HashSet<Student>(list);
		System.out.println(hs);
		TreeSet<Student> ts=new TreeSet<Student>(new Mycomparator());
		ts.addAll(hs);
		System.out.println(ts);

	}

}
class Mycomparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.compareTo(o1);
	}
}
class Student implements Comparable<Student>{
	String name;
	public Student(String name) {
		this.name=name;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
}
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
		}
	}