package Exe1;

/*
 * By Fiqa
 */

public class CurrentThreadApp {

	public static void main(String[] args) {
		
		//create the object
		Thread timeThread = new Thread();
		Thread timeThread2 = new Thread();
		
		timeThread.setName("Thread 1");
		timeThread2.setName("Thread 2");
		
		//display threads
		timeThread.start();
		timeThread2.start();

	}

}
