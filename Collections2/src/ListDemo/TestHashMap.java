package ListDemo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> countryCurr = new HashMap<>();
		
		countryCurr.put("IND", "Rupee");
		countryCurr.put("USA", "Dollar");
		countryCurr.put("UK", "Pound");
		countryCurr.put(null,null);
		countryCurr.put(null,null);
		
		System.out.println(countryCurr);
		
		System.out.println(countryCurr.get("IND"));
		
		countryCurr.put("IND", "Rupe");
		
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("UK"));
		System.out.println(countryCurr.containsValue("Dollar"));
		
		//HashMap has 3 views.
		//1. Key View
		
		Set<String> Keys = countryCurr.keySet();
		for(String key : Keys)
		{
			System.out.println(key);
		}
		
		//2. Values View
		
		Collection<String> values = countryCurr.values();
		for(String value : values)
		{
			System.out.println(value);
		}
		
		//3. Key values together - EntrySet
		Set<Entry<String,String>>entries = countryCurr.entrySet();
		for(Entry entry : entries)
		{
			System.out.println(entry);
		}

	}

}
