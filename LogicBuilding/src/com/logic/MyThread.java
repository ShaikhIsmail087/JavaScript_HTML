package com.logic;

interface Call {
	void call(String str, double i);
}

class MyThread extends Thread{
	public void run(){
		for (int i = 1; i < 11; i++) {
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println("Thread3 : " + i);
		}
	}
	public static void main(String[] args) {
		System.out.println("Program Started...");
		Call c = (a, b) -> {
			System.out.println("Payment : " + a + " " + b);
		};
		c.call("Tushar", 50000);
		Runnable t1 = () -> {
			int total = 0;
			for (int i = 1; i < 100000; i++) {
				total += i;
			}
			System.out.println("Thread2 : " + total);
		};
		Thread t = new Thread(t1);
		MyThread thread = new MyThread();
		thread.start();
		t.start();
		for (int i = 1; i < 11; i++) {
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" : " + i);
		}
		System.out.println("Program Ended...");
	}
}