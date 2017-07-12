package com.test.thread01;

import java.util.Random;

public class Rrole extends Prole {

	public Rrole(int hp, String name) {
		super(hp, name);
	}

	@Override
	public int decrOther(int rand) {
		Random r = new Random();
		return r.nextInt(10);
	}

	@Override
	public void init() {
		Random r = new Random();
		int sleep = 200+ r.nextInt(2000);
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(this.getName() + " 初始化完成。");
	}

}
