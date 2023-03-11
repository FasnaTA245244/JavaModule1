package oopsday3;

public class Math2 implements MathIface {
	private int a;
	private int b;
	private int n;
	
	public Math2() {
		
	}
	
	public Math2(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void getN() {
		this.n = n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public int Factorial(int n) {
		// TODO Auto-generated method stub
		int f = 1;
		for(int i =1; i<=n ;i++)
		{
			f = f*i;
		}
		return f;
	}

	@Override
	public int Add(int a, int b) {
		// TODO Auto-generated method stub
        int add=0;
		add = a+b;
		
		return add;
	}

	

	@Override
	public int Sub(int a, int b) {
		// TODO Auto-generated method stub
		int sub=0;
		sub = a-b;
		return sub;
	}

	@Override
	public int Mul(int a, int b) {
		// TODO Auto-generated method stub
		int mul=0;
		mul = a*b;
		return mul;
	}

	@Override
	public void EvenOrOdd() {
		// TODO Auto-generated method stub
		if(n%2 == 0)
		{
		  System.out.println(n + " is Even");
	    }
		else
		{
		 System.out.println(n + "is Odd");
		}
}

	@Override
	public int EvenOrOdd(int n) {
		// TODO Auto-generated method stub
		return 0;
	}
}
