package moh.sample.threads;

import org.s2n.ddt.util.threads.DdtPools;
import org.s2n.ddt.util.threads.PoolOptions;


/**
 * Hello world!
 *
 */
public class App1 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		PoolOptions poolOptions = new PoolOptions();
		poolOptions.setCoreThreads(2);
		poolOptions.setMaxThreads(3);
        DdtPools.initPool("AjayPool",poolOptions);
		Do1 p = null;
		for (int i = 0; i < 18; i++) {
			p = new Do1();
			DdtPools.offer("AjayPool", p);

		}
        
        System.out.println( "Pool Allocated" );
    }
}



class Do1 implements Runnable {
	volatile static long l = 0;
	private long taskid = 0;

	public Do1() {
		taskid=l++;
	      System.out.println("Task "+taskid+" ,counter "+ l +" allocated");

	}

	public void run() {


	      System.out.println("Task "+taskid+", Counter "+l+ ";;; Thread.currentThread().getName()" + Thread.currentThread().getName());
	         for(int i = 0; i < 5; i++) {
	        	 try {
					Thread.sleep(10+(i*5));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	//            System.out.println("i: " +  i);
	         }
	     System.out.println("Task "+taskid+", Counter "+l+" exiting.;;; Thread.currentThread().getName()" + Thread.currentThread().getName());
//		System.out.println("hi " + l);
	}

	public static long getLs() {
		return l;
	}
}
