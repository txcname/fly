package com.test.thread01;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GameStart {

	public static void main(String args[]) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		final CountDownLatch latch = new CountDownLatch(10);
		for (int i = 0; i < 10; i++) {
			Prole p = RoleFactory.createRole(i);
			RoleInitTask<Prole> task = new RoleInitTask<Prole>(latch, p);
			es.submit(task);
		}

		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("所有玩家都到齐");

	}
}
