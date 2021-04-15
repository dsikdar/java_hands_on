package threadtest;

public class ThreadDemo1 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ThreadDemo1 d=new ThreadDemo1();
		
		d.start();
		
		for(int i=0;i<10;i++)
			System.out.println("i : "+i);
	}

	public void run() {
		
		for(int j = 0 ; j< 10 ; j++) {
			
			System.out.println("j : "+j);
		}
	}
}
