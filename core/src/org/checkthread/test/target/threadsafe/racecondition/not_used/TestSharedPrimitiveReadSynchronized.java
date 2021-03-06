package org.checkthread.test.target.threadsafe.racecondition.not_used;

import org.checkthread.annotations.*;

public class TestSharedPrimitiveReadSynchronized {
	
	private int fSharedPrimitive = 1;
	private volatile int fSharedVolatilePrimitive = 2;
	
	@ThreadSafe
	public synchronized void methodSharedRead(int v) {
		// atomic getfield operation
		System.out.println(fSharedPrimitive);
		System.out.println(fSharedVolatilePrimitive);
	}
}