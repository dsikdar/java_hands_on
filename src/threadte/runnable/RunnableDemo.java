package threadte.runnable;

public class RunnableDemo {

	public static void main(String[] args) {

		RunnableThread t = new RunnableThread();

		Thread t1 = new Thread(t);

		t1.start();

	}

}
