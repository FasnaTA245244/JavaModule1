package Strings;

public class inttostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =151;
		String str= i+"";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		boolean result = str.equals(sb.toString());
		System.out.println(result);
	}

}
