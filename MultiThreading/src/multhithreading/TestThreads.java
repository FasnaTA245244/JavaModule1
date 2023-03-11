package multhithreading;

public class TestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Started...");
		
		
		MyThread t1 = new MyThread("T1");
		MyThread t2 = new MyThread("T2");
		t1.start();
		t2.start();
		
		
		System.out.println("Main Exited...");
		

	}

}
