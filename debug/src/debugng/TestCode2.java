package debugng;

public class TestCode2 {
	int a;
	int b;
	int x;
	static int a1[] = {2,5,7,8,5};
	static int b1[] = {23,43,27,32,12};
	static int x1[] = {18,19,20,21,22};
	
	public static void add() {
		double one,two,third;
		int result=0;
		
	for (int i=0; i<=a1.length; i++) {
		
		 one = (a1[i]*Math.pow(x1[i], 2));
		 two = (b1[i]*Math.pow(x1[i], 2));
		 third = 2*a1[i] + b1[i];
		 result = (int)(one + two + third);
		 System.out.println(result);
	}
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();

	}

}
