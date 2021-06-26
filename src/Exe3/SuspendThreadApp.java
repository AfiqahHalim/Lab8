package Exe3;

public class SuspendThreadApp {

	public static void main(String[] args) {

		
		//create object for runnable
		//create the objects
				Runnable statementPrinter1 = new SuspendThread();
				Runnable statementPrinter2 = new SuspendThread();
				Runnable statementPrinter3 = new SuspendThread();
				
				
				Thread word1 = new Thread (statementPrinter1, "word1");
				Thread word2 = new Thread (statementPrinter2, "word2");
				Thread text3 = new Thread (statementPrinter3, "text");
				
				
				word1.start();
				word2.start();
				text3.start();
				 
	}

}
