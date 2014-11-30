package moh.sample.threads;

import java.util.Random;

public class EmailTask implements Runnable{
	private static long count = 0;
	private long taskId = 0;
	
	EmailTask(){
		taskId = ++count;
		
	}
	
	
	public void run() {
		Random rn = new Random();
		int r = 50 + rn.nextInt(150);
		try {
			Thread.sleep(r);
		} catch (Exception e) {

		}
		System.out.println("Task id " + taskId + " in thread " + Thread.currentThread().getName());
		
	}
}
