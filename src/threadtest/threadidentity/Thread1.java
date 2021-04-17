package threadtest.threadidentity;

public class Thread1 extends Thread{

	public void run() {
		
		Thread t = new Thread1();
		t.setName("the first ");
		
		for (int i = 0; i < 10; i++)
			System.out.println("Running thread " + t.getName());
	}
}
