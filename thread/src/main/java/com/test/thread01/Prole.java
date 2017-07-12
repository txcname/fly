package com.test.thread01;

public abstract class Prole {

	private int hp;
	private String name;

	public Prole(int hp, String name) {
		this.hp = hp;
		this.name = name;
	}

	public abstract int decrOther(int rand);

	public abstract void init();

	public int getHp() {
		return hp;
	}

	public String getName() {
		return name;
	}

}
