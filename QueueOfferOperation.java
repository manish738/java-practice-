import java.util.concurrent.*;

public class QueueOfferOperation
{
   public static void main(String[] args) 
	{
		
	BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

	System.out.println(queue.offer("one"));
	System.out.println(queue.offer("two"));
	System.out.println(queue);
	System.out.println(queue.offer("three"));
	System.out.println(queue);
  	}
}


//As our queue is limited to two elements, when we try to add third element using BlockingQueue.offer() operation, it returns “false” value as shown above.