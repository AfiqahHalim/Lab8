package Exe2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/*
 * By fiqa
 */


public class runnablePrintStatement implements Runnable {
	
	
	public void randomRunnableText ()
	{
		String arr[] = { "It ", "is ", "recommended ", "to ", "use ", "Calendar ", "class "};
		
		Random randomText = new Random();
		
		//to avoid duplicate data
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		while (set.size() < arr.length)
		{
			
			set.add(randomText.nextInt(arr.length));
			
		}
		
		Object textOrderArray[] = set.toArray();
		
		String reorderText = "";
		
		for (int i=0 ; i<arr.length ; i++)
		{
			
			reorderText += arr[(int) textOrderArray[i]] + "";
		}
		
		System.out.println(reorderText);
	}
	
	
	public void toExtractText()
	{
		
		String text = "Programming is fun if you understand the coding.";
		
		String tempText = "";
		
		char extractTheChar;
		
		for ( int i=0 ; i<10 ; i++)
		{
			
			extractTheChar = text.charAt(i);
			
			tempText += extractTheChar;
			
			System.out.println(tempText);
			
			
		}
	}
	
	
	public void run()
	{
	
		Thread currentThread = Thread.currentThread();
		
		if ( currentThread.getName().equals("text"))
			toExtractText();
		
		else
			randomRunnableText();
	
	}
	
}
