package com.test.thread01;

import java.util.concurrent.CountDownLatch;

public class RoleInitTask<T extends Prole> implements Runnable {

	private final CountDownLatch latch;

	private T t;
	public RoleInitTask(CountDownLatch latch,T t) {
		this.latch = latch;
		this.t = t;
	}
	
	
    //任务开始准备
	public void run() {
		t.init();//初始化等待
		latch.countDown();
	}

	
	
}
