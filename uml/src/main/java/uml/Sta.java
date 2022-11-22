package uml;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
public class Sta {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<Integer>();
    s.push(10);
   // s.push("g");
    s.push(20);
    s.push(30);
    s.push(40);
    s.add(60);
    System.out.println("Elements in stack: " + s);     
    System.out.println("Element removed from stack: " +s.pop());     
    System.out.println("Element removed from stack: " + s.pop());
    System.out.println(s.push(50));
    System.out.println(s.peek()+" peek ");
    System.out.println(s.size());
    System.out.println(s.capacity());
  //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
  
  Queue<Integer> q= new PriorityQueue<Integer>();
  q.add(1);
  q.add(2);
  q.add(3);
  q.add(4);
  
  System.out.println(q);
  System.out.println(q.element());
  System.out.println(q.remove());
  System.out.println(q.peek());

  
  }
  
}