package ListDemo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Marker");
		list.add("Pencil");
		list.add("Book");
		list.add("Eraser");
		list.add("Sharpner");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		list.add(2, "Sticky Notes");
		System.out.println(list);
		
		Iterator<String> iter = list.descendingIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		ListIterator<String> listIter = list.listIterator();
		while(listIter.hasNext())
		{
			String element = listIter.next();
			if(element.equals("Pencil"))
			{
				listIter.remove();
			}
			
		}
		System.out.println(list);

	}

}
