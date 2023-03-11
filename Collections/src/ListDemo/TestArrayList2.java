package ListDemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList();
//		colors.add(new Object());
//		colors.add(new Double("10.10"));
		
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Black");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add(null);
		
		System.out.println(colors.size());
		System.out.println(colors);
		String str = colors.get(3);
		System.out.println(str);
	}

}
