package userdefinedobject;
import java.util.Collection;
import java.util.HashMap;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int count1=0;
		HashMap<String,Integer> word = new HashMap<>();
		String str = "the destructive algorithms contained in this class, that is, the algorithms that modify the collection on which they operate, are specified to throw UnsupportedOperationException if the collection does not support the appropriate mutation primitive, such as the set method. these algorithms may, but are not required to, throw this exception if an invocation would have no effect on the collection. for example, invoking the sort method on an unmodifiable list that is already sorted may or may not throw UnsupportedOperationException.";
		
		String str1 = str.replace(".","");
		String str2 = str1.replace(",","");
		String a[]  = str2.split("[ ]");
		for(String w:a)
		{
			count++;
			//System.out.println(w);
			
			if(word.containsKey(w))
			{
				count1= word.get(w);
				word.put(w, ++count1);
			}
			else
			{
				word.put(w,1);
			}
			
			
		}
		System.out.println(word);
		System.out.println("Total no. of Words = " + count);
		
		
		
		
	}

}
