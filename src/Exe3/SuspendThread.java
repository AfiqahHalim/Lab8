package Exe3;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/*
 * By fiqa
 */


public class SuspendThread implements Runnable {
	
	//to suspend word1
	private static boolean status = false;
	

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
		
		//initialize array
		Object textOrderArray[] = set.toArray();
		
		
		String reOrderText = "";
		
		for (int i=0 ; i<arr.length ; i++)
		{
			reOrderText += arr[(int) textOrderArray[i]] + "";
		}
		
		System.out.println(reOrderText);
	}
	
	
	public void randomRunnableText(String threadName)
	{
		
		String arr[] = { "It ", "is ", "recommended ", "to ", "use ", "Calendar ", "class "};
		
		Random randomText = new Random();
		
		//to avoid duplicate data
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		while (set.size() < arr.length)
		{
			set.add(randomText.nextInt(arr.length));
		}
		
		//initialize array
		Object textOrderArray[] = set.toArray();
		
		
		String reOrderText = "";
		
		for (int i=0 ; i<arr.length ; i++)
		{
			
			reOrderText += arr[(int) textOrderArray[i]] + "";
			try {
				
				if (status == true)
				{
					//to suspend the thread for 5seconds
					System.out.println("\n\n\n" + threadName + " is sleeping\n");
					
					Thread.sleep(5000);
					
					status = false;
				}
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			System.out.println(threadName + " : " + reOrderText);
		}
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
		String textName = currentThread.getName();
		
		if ( textName.equals("text"))
			toExtractText();
		
		else if(textName.equals("word1"))
			randomRunnableText();
		else
			randomRunnableText(currentThread.getName());
	
	} 

}
