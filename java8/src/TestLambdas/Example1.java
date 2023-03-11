package TestLambdas;


//functional interface
interface Shape{
	double area();
	//not allowed double perimeter();
}

interface Math{
	 double power(int b, int e);
}

interface Factorial{
	 int fact(int n);
}


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1= new Runnable() {
			public void run() {
				System.out.println("From run method");
			}
		};
		
		Factorial facto = (int n)->{
	        int f =1;
	        for(int i=1; i<=n; i++)
	        {
	        	f=f*i;
	        }
	        return f;
              };
        System.out.println(facto.fact(5));
		
		
		Runnable r= ()->{
			for(int i=1;i<5;i++)
			{
				System.out.println("In run Method" + i);
			}
		                };
		                
		         Thread t = new Thread(r);
		         t.start();
		 
		Math m = (int b, int e)->{
			        int p =1;
			        for(int i=1; i<=e; i++)
			        {
			        	p*=b;
			        }
			        return p;
		              };
		              
		    double p = m.power(2,3);
		    System.out.println(p);
		    
		Shape s = ()-> {
			return 0.0;
		                };
	double result = s.area();
	System.out.println(result);
	}

}
