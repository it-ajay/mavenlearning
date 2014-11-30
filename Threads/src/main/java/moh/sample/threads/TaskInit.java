package moh.sample.threads;

import org.s2n.ddt.util.threads.DdtPools;
import org.s2n.ddt.util.threads.PoolOptions;

public class TaskInit {
	
	
	public static final String EMAIL_TASK_NAME = "EML";

	public void init() {
		//org.s2n.ddt.util.threads.DdtPools.initPool(String, PoolOptions)
		PoolOptions options = new PoolOptions();
		options.setCoreThreads(5);
		options.setMaxThreads(10);
		DdtPools.initPool(EMAIL_TASK_NAME, options);
		
		
	}

}
