package Exe1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime extends Thread{
	
	public void displayCurrentTime (String currentThreadTime)
	{
		
		LocalTime cTime = LocalTime.now();
		DateTimeFormatter formatForTime = DateTimeFormatter.ofPattern("HH:MM:SS");
		
		String formatTime = cTime.format(formatForTime);
		
		for ( int i = 0 ; i < 10 ; i ++ )
		{
			
			System.out.println("Round " + i + " : " + currentThreadTime + " at " + formatTime);
		}
		
	}
	
	public void run()
	{
		
		//to get current thread
		Thread currentThread = Thread.currentThread();
		
		//to display thread
		displayCurrentTime(currentThread.getName());
	}

}
