package threadtest.threadidentity;

public class Thread2 extends Thread {

	public void run() {

		Thread t = new Thread2();
		t.setName("the second ");
		
		for (int i = 0; i < 10; i++)
			System.out.println("Running Thread "+ t.getName());
	}
}
