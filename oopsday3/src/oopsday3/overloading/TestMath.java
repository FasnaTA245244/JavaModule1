package oopsday3.overloading;

public  class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math math = new Math();
		int result = math.add(10, 20);
		System.out.println(result);
		
		double result2 = math.add(10.25, 25.25);
		System.out.println(result2);
		
		result2 = math.add(10.25, 25.25,35.5);
		System.out.println(result2);
		
		result2 = math.add(10L,20L,30L);
		System.out.println("Long  " + result2);
		
		result2 = math.add(10.25f, 20.25f);
		System.out.println(result2);
		

	}

}
