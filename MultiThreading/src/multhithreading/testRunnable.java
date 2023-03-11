package multhithreading;

public class testRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started...");
		System.out.println("Main's Priority =" + Thread.currentThread().getPriority());
		MyRunnable runnable = new MyRunnable();
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("T1's Priority =" + t1.getPriority());
		System.out.println("T2's Priority =" + t2.getPriority());
		System.out.println("Main Exited... ");
			

	}

}
