package ListDemo;
import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<String> queue = new ArrayDeque<>();
		
		queue.addLast("First");
		queue.addLast("Second");
		queue.addLast("Third");
		queue.addLast("Fourth");
		queue.addLast("Fifth");
		
		System.out.println(queue);
		System.out.println(queue.size());
		
	    String element = queue.peek();
	    System.out.println(element);
	    queue.poll();
	    System.out.println(queue);
	    
	    Iterator<String> iter = queue.iterator();
	    while(iter.hasNext())
	    {
	    	System.out.println(iter.next());
	    }

	}

}
