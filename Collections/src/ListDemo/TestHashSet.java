package ListDemo;
import java.util.HashSet;
import java.util.Iterator;
public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> bookSet = new HashSet<>();
		bookSet.add("Java in Nutshell");
		bookSet.add("Java Complete Reference");
		bookSet.add("Thinking in Java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java for Dummys");
		bookSet.add(null);
		
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java in Nutshell"));
		
		
		bookSet.add("Thinking in Java");
		System.out.println(bookSet.size());
		
		for(String book: bookSet )
		{
			System.out.println(book);
		}
		
		Iterator<String> iter = bookSet.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		

	}

}
