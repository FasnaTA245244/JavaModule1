package multhithreading;

import java.util.Scanner;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++)
		{
			System.out.println("Enter your Input");
			int a = new Scanner(System.in).nextInt();
			System.out.println("Got the Input Proceeding");
			System.out.println(Thread.currentThread().getName() + "=" + i);
			try {
				Thread.sleep(330);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
