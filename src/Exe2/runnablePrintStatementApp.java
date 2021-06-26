package Exe2;

public class runnablePrintStatementApp {

	
	public static void main(String[] args)
	{
		
		//create the objects
		Runnable statementPrinter1 = new runnablePrintStatement();
		Runnable statementPrinter2 = new runnablePrintStatement();
		Runnable statementPrinter3 = new runnablePrintStatement();
		
		
		Thread text1 = new Thread (statementPrinter1, "text1");
		Thread text2 = new Thread (statementPrinter2, "text2");
		Thread text3 = new Thread (statementPrinter3, "text3");
		
		text1.start();
		text2.start();
		text3.start();
		
		}
}
