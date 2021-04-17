package threadtest.threadidentity;

public class MainClass {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		
		Thread2 t2 = new Thread2();
		
		t1.start();
		
		//t1.yield();
		//t1.interrupt();
		t2.start();
		
	}

}
