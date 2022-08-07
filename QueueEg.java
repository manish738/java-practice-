import java.util.Queue;
import java.util.LinkedList;


public class QueueEg 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Queue<String> w = new LinkedList<>();
		w.add("one");
		w.add("two");
		w.add("three");
		w.add("four");
		System.out.println(w);
		w.remove("four");
		System.out.println(w);
		System.out.println("Queue size :" + w.size());
		System.out.println("Queue Contains element 'two' or not? : " + w.contains("two"));
		System.out.println(w. remove());
		System.out.println(w.poll());
		System.out.println(w.peek());
		System.out.println(w.element());
		
		
	}

}
