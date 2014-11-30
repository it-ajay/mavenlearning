package moh.sample.threads;

import org.s2n.ddt.util.threads.DdtPools;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        TaskInit init = new TaskInit();
        init.init();
        for(int i = 0; i < 50; i++) {
        		EmailTask task = new EmailTask();
        		DdtPools.offer(TaskInit.EMAIL_TASK_NAME, task);
        }
    }
}
