package Strings;

public class TestStrings {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		byte bytes[] = {65,66,67,68,69};
		
		String str = new String(bytes);
		System.out.println(str.length());
		
		System.out.println(str);
		str = "Welcome to UST ";
		
		bytes = str.getBytes();
		for(byte b: bytes)
		{
			System.out.println(b);
		}
		
		char chars[] = {'U','S','T',' ','G'};
		str = new String(chars);
		System.out.println(str);
		
		str.getChars(0,chars.length-1, chars, 0);
		for(char c : chars)
		{
			System.out.println(c);
		}
		
		String string = new String("She sells sea shells in sea shore");
        int count=0;
		for(int i=0;i<string.length();i++)
		{
		
			if (string.charAt(i)=='S' || string.charAt(i) =='s')
			{
				count++;
			}
		}
		System.out.println("Count of s = " + count);
		
		String words[] = string.split(" ");
		System.out.println(words.length);

		for(String word : words)
		{
			System.out.println(word);
		}

		string = new String("Cartoon");
		System.out.println(string.startsWith("Car"));
		System.out.println(string.endsWith("toon"));
		
		int apos = string.indexOf('a');
		int tpos = string.indexOf('t');
		
		String string1 = string.substring(apos, tpos+1);
		System.out.println(string1);
		string1 = string.substring(tpos);
		System.out.println(string1);
		
		string = new String("Madamdam");
		int dpos = string.lastIndexOf('d');
		System.out.println(dpos);
		string1 = string.substring(dpos,string.length());
		System.out.println(string1);
		
		
		String email= new String("aneeta.roy@ust.com");
		int dotp = email.lastIndexOf('.');
        email = email.substring(dotp, email.length());
         System.out.println(email);
         
         
         
         String str1 = new String("welcome");
         String str2 = new String("welcome");
         boolean result = str1.equals(str2);
         System.out.println(result);
         int val1 = str1.compareTo(str2);
         System.out.println(val1);
         
         
         
         String str11 = new String("WELCOME");
         String str22 = new String("welcome");
         boolean result2 = str11.equals(str22);
         System.out.println(result2);
         
         int val = str11.compareTo(str22);
         System.out.println(val);
         
         string = "Diehard";
         System.out.println(string.toLowerCase());
         System.out.println(string);
         System.out.println(string.toUpperCase());
         System.out.println(string);   //they are immutable
         
         
         
         String str3 = new String("welcome");
         String str4 = new String("WELCOME");
         boolean result1 = str3.equalsIgnoreCase(str4);
         System.out.println(result1);
          
         
         String st = new String("16-11-477/6/A/3 Hyderabad 500036");
         int dcount=0,lcount=0,ccount=0,neither=0,other=0;
         for(int i=0;i<st.length();i++)
         {
        	 if(Character.isDigit(st.charAt(i)))
        	 {
        		 dcount++;
        	 }
        	 else if(Character.isAlphabetic(st.charAt(i)))
        	 {
        		 lcount++;
        	 }
        	 else if(Character.isSpaceChar(st.charAt(i)))
        	 {
        		 ccount++;
        	 }
        	 else
        	 {
        		 neither++;
        	 }
         }
         other=neither+ccount;
         System.out.println("Count of Letters = " + lcount);
         System.out.println("Count of Digits = " + dcount);
         System.out.println("Count of other Characters = " + other);
         
		
	
		}

}
