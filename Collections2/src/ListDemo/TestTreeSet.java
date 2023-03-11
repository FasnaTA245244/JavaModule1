package ListDemo;
import java.util.TreeSet;
import java.util.Iterator;
public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> bookSet = new TreeSet<>();
		bookSet.add("Java in Nutshell");
		bookSet.add("Java Complete Reference");
		bookSet.add("Thinking in Java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java for Dummys");
	//	bookSet.add(null);    TreeSet does not allow null element.
		
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
