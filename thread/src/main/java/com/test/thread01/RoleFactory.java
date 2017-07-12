package com.test.thread01;

import java.util.Random;

public class RoleFactory {

	private RoleFactory() {

	}

	public static Prole createRole(int i) {
		Random r = new Random();
		int hp = 100 + r.nextInt(20);
		return new Rrole(hp, "name" + i);
	}
}
