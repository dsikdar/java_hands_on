package threadtest;

import java.util.Scanner;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Summing and producting");
		Summer s = new Summer(num);
		s.start();
		s.join();// parallel or serial ?
		Producter p = new Producter(num);
		p.start();

	}

}

class Summer extends Thread {

	int n = 0;

	Summer(int number) {

		n = number;
	}

	void getSum(int n) throws InterruptedException {

		int sum = 0;

		for (int i = 0; i <= n; i++) {

			System.out.println("summing");

			Thread.sleep(1000);

			sum += i;
		}

		System.out.println(sum);
	}

	public void run() {

		try {
			getSum(n);
		} catch (InterruptedException e) {

		}
	}

}

class Producter extends Thread {

	int n = 1;

	Producter(int number) {

		n = number;
	}

	void getProductUpto(int n) throws InterruptedException {
		int result = 1;

		for (int i = 1; i <= n; i++) {

			System.out.println("producting");

			Thread.sleep(1000);

			result *= i;
		}

		System.out.println(result);
	}

	public void run() {

		try {
			getProductUpto(n);
		} catch (InterruptedException e) {

		}
	}

}
